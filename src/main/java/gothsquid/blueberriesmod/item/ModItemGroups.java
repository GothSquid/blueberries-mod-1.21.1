package gothsquid.blueberriesmod.item;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BLUEBERRY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlueberriesMod.MOD_ID, "blueberry_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.BLUEBERRIES))
                    .displayName(Text.translatable("itemgroup.blueberriesmod.blueberry_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLUEBERRIES);
                        entries.add(ModItems.FERMENTED_BLUEBERRY);
                        entries.add(ModItems.BLUEBERRY_PIE);
                        entries.add(ModItems.BLUEBERRY_CHEESECAKE);
                        entries.add(ModItems.BLUEBERRY_BOW);
                    }).build());

    public static final ItemGroup BREWERY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BlueberriesMod.MOD_ID, "brewery_items"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.APPLEWOOD_CIDER))
                    .displayName(Text.translatable("itemgroup.blueberriesmod.brewery_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BEER_GLASS);
                        entries.add(ModItems.WATER_FILLED_BEER_GLASS);
                        entries.add(ModBlocks.KEG);
                        entries.add(ModItems.APPLEWOOD_CIDER);
                        entries.add(ModItems.BLUEBERRY_WHEAT_ALE);
                        entries.add(ModItems.GHASTLY_GOSE);
                        entries.add(ModItems.GOLDEN_LAGER);
                        entries.add(ModItems.INFERNO_BREW);
                        entries.add(ModItems.INFINITY_INK_IPA);
                        entries.add(ModItems.MERLINS_MEAD);
                        entries.add(ModItems.PEARL_PILSNER);
                        entries.add(ModItems.PUMPKIN_PORTER);
                        entries.add(ModItems.REDSTONE_STOUT);
                        entries.add(ModItems.SWEET_BERRY_SOUR);
                    }).build());

    public static void registerItemGroups() {
        BlueberriesMod.LOGGER.info("Registering Item Groups for " + BlueberriesMod.MOD_ID);
    }
}
