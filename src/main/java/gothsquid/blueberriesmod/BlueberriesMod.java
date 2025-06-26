package gothsquid.blueberriesmod;

import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.item.ModItems;
import gothsquid.blueberriesmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueberriesMod implements ModInitializer {
	public static final String MOD_ID = "blueberriesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

	}
}