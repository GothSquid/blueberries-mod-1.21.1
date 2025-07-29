package gothsquid.blueberriesmod.screen;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.screen.custom.KegScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<KegScreenHandler> KEG_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(BlueberriesMod.MOD_ID, "keg_screen_handler"),
                    new ExtendedScreenHandlerType<>(KegScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerScreenHandlers() {
        BlueberriesMod.LOGGER.info("Registering Screen Handlers for " + BlueberriesMod.MOD_ID);
    }
}
