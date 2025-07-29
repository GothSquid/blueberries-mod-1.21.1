package gothsquid.blueberriesmod;

import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.screen.ModScreenHandlers;
import gothsquid.blueberriesmod.screen.custom.KegScreen;
import gothsquid.blueberriesmod.util.ModModelPredicates;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class BlueberriesModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUEBERRY_BUSH, RenderLayer.getCutout());

        ModModelPredicates.registerModelPredicates();

        HandledScreens.register(ModScreenHandlers.KEG_SCREEN_HANDLER, KegScreen::new);
    }
}
