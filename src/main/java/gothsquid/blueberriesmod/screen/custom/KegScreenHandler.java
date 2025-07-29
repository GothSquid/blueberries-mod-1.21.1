package gothsquid.blueberriesmod.screen.custom;

import gothsquid.blueberriesmod.block.entity.custom.KegBlockEntity;
import gothsquid.blueberriesmod.item.ModItems;
import gothsquid.blueberriesmod.screen.ModScreenHandlers;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;

public class KegScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;
    public final KegBlockEntity blockEntity;

    private static class WaterFilledBeerGlassSlot extends Slot {
        public WaterFilledBeerGlassSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return stack.isOf(ModItems.WATER_FILLED_BEER_GLASS);
        }
    }

    private static class OutputSlot extends Slot {
        public OutputSlot(Inventory inventory, int index, int x, int y) {
            super(inventory, index, x, y);
        }

        @Override
        public boolean canInsert(ItemStack stack) {
            return false;
        }
    }

    public KegScreenHandler(int syncId, PlayerInventory inventory, BlockPos pos) {
        this(syncId, inventory, inventory.player.getWorld().getBlockEntity(pos), new ArrayPropertyDelegate(2));
    }

    public KegScreenHandler(int syncId, PlayerInventory playerInventory,
                            BlockEntity blockEntity, PropertyDelegate arrayPropertyDelegate) {
        super(ModScreenHandlers.KEG_SCREEN_HANDLER, syncId);
        this.inventory = ((Inventory) blockEntity);
        this.blockEntity = ((KegBlockEntity) blockEntity);
        this.propertyDelegate = arrayPropertyDelegate;

        // Slot 0: Water Filled Beer Glass Slot
        this.addSlot(new WaterFilledBeerGlassSlot(inventory, 0, 26, 34));

        // Slots 1-3: Ingredient Slots
        this.addSlot(new Slot(inventory, 1, 44, 16)); // Ingredient Slot 1
        this.addSlot(new Slot(inventory, 2, 44, 34)); // Ingredient Slot 2
        this.addSlot(new Slot(inventory, 3, 44, 52)); // Ingredient Slot 3

        // Slot 4: Output Slot
        this.addSlot(new OutputSlot(inventory, 4, 116, 34));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);

        addProperties(arrayPropertyDelegate);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public int getScaledArrowProgress() {
        int progress = this.propertyDelegate.get(0);
        int maxProgress = this.propertyDelegate.get(1); // Max Progress
        int arrowPixelSize = 24; // This is the width in pixels of your arrow

        return maxProgress != 0 && progress != 0 ? progress * arrowPixelSize / maxProgress : 0;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int invSlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(invSlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (invSlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }
        }
        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
