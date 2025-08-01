package gothsquid.blueberriesmod.datagen;

import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.block.custom.BlueberryBushBlock;
import gothsquid.blueberriesmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BLUEBERRY_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED,
                BlueberryBushBlock.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.STAR_GARNET_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STAR_GARNET_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STAR_GARNET_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STAR_GARNET_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STAR_GARNET_HOE, Models.HANDHELD);

    }
}
