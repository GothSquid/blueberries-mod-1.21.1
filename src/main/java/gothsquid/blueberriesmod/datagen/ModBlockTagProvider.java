package gothsquid.blueberriesmod.datagen;

import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.STAR_GARNET_BLOCK)
                .add(ModBlocks.STAR_GARNET_ORE)
                .add(ModBlocks.STAR_GARNET_DEEPSLATE_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_STAR_GARNET_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL);

    }
}
