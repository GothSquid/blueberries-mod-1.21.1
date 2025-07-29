package gothsquid.blueberriesmod.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record KegRecipeInput (ItemStack slot0, ItemStack slot1, ItemStack slot2, ItemStack slot3) implements RecipeInput {
    @Override
    public ItemStack getStackInSlot(int slot) {
        return switch (slot) {
            case 0 -> slot0;
            case 1 -> slot1;
            case 2 -> slot2;
            case 3 -> slot3;
            default -> ItemStack.EMPTY;
        };
    }

    @Override
    public int getSize() {
        return 4;
    }
}
