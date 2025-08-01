package gothsquid.blueberriesmod.block;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.custom.BlueberryBushBlock;
import gothsquid.blueberriesmod.block.custom.KegBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block KEG = registerBlock("keg",
            new KegBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(2.5f)
                    .sounds(BlockSoundGroup.WOOD)
                    .mapColor(MapColor.OAK_TAN)));

    public static final Block STAR_GARNET_BLOCK = registerBlock("star_garnet_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block STAR_GARNET_ORE = registerBlock("star_garnet_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                    .strength(3.0F, 3.0F)
                    .requiresTool()));

    public static final Block STAR_GARNET_DEEPSLATE_ORE = registerBlock("star_garnet_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()
                            .strength(4.5F, 3.0F)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(BlueberriesMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BlueberriesMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BlueberriesMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BlueberriesMod.LOGGER.info("Registering Mod Blocks for " + BlueberriesMod.MOD_ID);
    }
}
