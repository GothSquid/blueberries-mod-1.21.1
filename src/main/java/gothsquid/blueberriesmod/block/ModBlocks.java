package gothsquid.blueberriesmod.block;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.block.custom.BlueberryBushBlock;
import gothsquid.blueberriesmod.block.custom.KegBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BLUEBERRY_BUSH = registerBlockWithoutBlockItem("blueberry_bush",
            new BlueberryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    public static final Block KEG = registerBlock("keg",
            new KegBlock(AbstractBlock.Settings.create().nonOpaque()));

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
