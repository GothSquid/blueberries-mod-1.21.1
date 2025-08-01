package gothsquid.blueberriesmod.item;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.item.custom.BeerGlassItem;
import gothsquid.blueberriesmod.item.custom.DrinkableBeerItem;
import gothsquid.blueberriesmod.item.custom.MerlinsMeadItem;
import gothsquid.blueberriesmod.item.custom.PearlPilsnerItem;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

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
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.BLUEBERRY_WHEAT_ALE_COMPONENT)) {
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.blueberry_wheat_ale.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item SWEET_BERRY_SOUR = registerItem("sweet_berry_sour",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.SWEET_BERRY_SOUR_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.sweet_berry_sour.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item PUMPKIN_PORTER = registerItem("pumpkin_porter",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.PUMPKIN_PORTER_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.pumpkin_porter.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item GHASTLY_GOSE = registerItem("ghastly_gose",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.GHASTLY_GOSE_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.ghastly_gose.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item APPLEWOOD_CIDER = registerItem("applewood_cider",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.APPLEWOOD_CIDER_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.applewood_cider.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item INFINITY_INK_IPA = registerItem("infinity_ink_ipa",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.INFINITY_INK_IPA_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.infinity_ink_ipa.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item REDSTONE_STOUT = registerItem("redstone_stout",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.REDSTONE_STOUT_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.redstone_stout.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item GOLDEN_LAGER = registerItem("golden_lager",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.GOLDEN_LAGER_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.golden_lager.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item PEARL_PILSNER = registerItem("pearl_pilsner",
            new PearlPilsnerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.PEARL_PILSNER_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.pearl_pilsner.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item MERLINS_MEAD = registerItem("merlins_mead",
            new MerlinsMeadItem(new Item.Settings().maxCount(1).food(ModFoodComponents.MERLINS_MEAD_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.merlins_mead.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item INFERNO_BREW = registerItem("inferno_brew",
            new DrinkableBeerItem(new Item.Settings().maxCount(1).food(ModFoodComponents.INFERNO_BREW_COMPONENT)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.inferno_brew.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Item RAW_STAR_GARNET = registerItem("raw_star_garnet",
            new Item(new Item.Settings()));

    public static final Item STAR_GARNET = registerItem("star_garnet",
            new Item(new Item.Settings()));

    public static final Item STAR_GARNET_SWORD = registerItem("star_garnet_sword",
            new SwordItem(ModToolMaterials.STAR_GARNET, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.STAR_GARNET,3,-2.4f))));

    public static final Item STAR_GARNET_AXE = registerItem("star_garnet_axe",
            new AxeItem(ModToolMaterials.STAR_GARNET, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.STAR_GARNET,5.0f,-3.0f))));

    public static final Item STAR_GARNET_PICKAXE = registerItem("star_garnet_pickaxe",
            new PickaxeItem(ModToolMaterials.STAR_GARNET, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.STAR_GARNET,1.0f,-2.8f))));

    public static final Item STAR_GARNET_HOE = registerItem("star_garnet_hoe",
            new HoeItem(ModToolMaterials.STAR_GARNET, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.STAR_GARNET,-3.0f,0.0f))));

    public static final Item STAR_GARNET_SHOVEL = registerItem("star_garnet_shovel",
            new ShovelItem(ModToolMaterials.STAR_GARNET, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.STAR_GARNET,1.5f,-3.0f))));

    public static final Item STAR_GARNET_UPGRADE_SMITHING_TEMPLATE = registerItem("star_garnet_upgrade_smithing_template",
            new Item(new Item.Settings()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.blueberriesmod.star_garnet_upgrade_smithing_template.tooltip"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BlueberriesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BlueberriesMod.LOGGER.info("Registering Mod Items for " + BlueberriesMod.MOD_ID);
    }
}