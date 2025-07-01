package gothsquid.blueberriesmod;

import gothsquid.blueberriesmod.block.ModBlocks;
import gothsquid.blueberriesmod.effect.ModEffects;
import gothsquid.blueberriesmod.item.ModItemGroups;
import gothsquid.blueberriesmod.item.ModItems;
import gothsquid.blueberriesmod.potion.ModPotions;
import gothsquid.blueberriesmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueberriesMod implements ModInitializer {
	public static final String MOD_ID = "blueberriesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModEffects.registerEffects();
		ModPotions.registerPotions();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.WATER, ModItems.FERMENTED_BLUEBERRY, ModPotions.BLUEBERRY_WINE);
		});
	}
}