package gothsquid.blueberriesmod;

import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlueberriesModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());

        ModModelPredicates.registerModelPredicates();
    }
}
