package gothsquid.blueberriesmod.item;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.item.custom.BeerGlassItem;
import gothsquid.blueberriesmod.item.custom.DrinkableBeerItem;
import gothsquid.blueberriesmod.item.custom.MerlinsMeadItem;
import gothsquid.blueberriesmod.item.custom.PearlPilsnerItem;
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

    public static final Item BEER_GLASS = registerItem("beer_glass",
            new BeerGlassItem(new Item.Settings().maxCount(1)));

    public static final Item WATER_FILLED_BEER_GLASS = registerItem("water_filled_beer_glass",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.WATER_FILLED_BEER_GLASS_COMPONENT)));

    public static final Item BLUEBERRY_WHEAT_ALE = registerItem("blueberry_wheat_ale",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.BLUEBERRY_WHEAT_ALE_COMPONENT)));

    public static final Item SWEET_BERRY_SOUR = registerItem("sweet_berry_sour",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.SWEET_BERRY_SOUR_COMPONENT)));

    public static final Item PUMPKIN_PORTER = registerItem("pumpkin_porter",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.PUMPKIN_PORTER_COMPONENT)));

    public static final Item GHASTLY_GOSE = registerItem("ghastly_gose",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.GHASTLY_GOSE_COMPONENT)));

    public static final Item APPLEWOOD_CIDER = registerItem("applewood_cider",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.APPLEWOOD_CIDER_COMPONENT)));

    public static final Item INFINITY_INK_IPA = registerItem("infinity_ink_ipa",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.INFINITY_INK_IPA_COMPONENT)));

    public static final Item REDSTONE_STOUT = registerItem("redstone_stout",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.REDSTONE_STOUT_COMPONENT)));

    public static final Item GOLDEN_LAGER = registerItem("golden_lager",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.GOLDEN_LAGER_COMPONENT)));

    public static final Item PEARL_PILSNER = registerItem("pearl_pilsner",
            new PearlPilsnerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.PEARL_PILSNER_COMPONENT)));

    public static final Item MERLINS_MEAD = registerItem("merlins_mead",
            new MerlinsMeadItem(new Item.Settings().maxCount(1).food(ModFoodComponents.MERLINS_MEAD_COMPONENT)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BlueberriesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BlueberriesMod.LOGGER.info("Registering Mod Items for " + BlueberriesMod.MOD_ID);
    }
}