package gothsquid.blueberriesmod.item;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BLUEBERRIES = registerItem("blueberries",
            new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new Item.Settings().food(ModFoodComponents.BLUEBERRIES_COMPONENT)));

    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie",
            new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY_PIE_COMPONENT)));

    public static final Item BLUEBERRY_CHEESECAKE = registerItem("blueberry_cheesecake",
            new Item(new Item.Settings().food(ModFoodComponents.BLUEBERRY_CHEESECAKE_COMPONENT)));

    public static final Item BLUEBERRY_BOW = registerItem("blueberry_bow",
            new BowItem(new Item.Settings().maxDamage(500)));

    public static final Item FERMENTED_BLUEBERRY = registerItem("fermented_blueberry",
            new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BlueberriesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BlueberriesMod.LOGGER.info("Registering Mod Items for " + BlueberriesMod.MOD_ID);
    }
}