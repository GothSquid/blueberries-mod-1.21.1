package gothsquid.blueberriesmod.recipe;

import gothsquid.blueberriesmod.BlueberriesMod;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static final RecipeSerializer<KegRecipe> KEG_SERIALIZER = Registry.register(
            Registries.RECIPE_SERIALIZER, Identifier.of(BlueberriesMod.MOD_ID, "keg"),
            new KegRecipe.Serializer());
    public static final RecipeType<KegRecipe> KEG_TYPE = Registry.register(
            Registries.RECIPE_TYPE, Identifier.of(BlueberriesMod.MOD_ID, "keg"), new RecipeType<KegRecipe>() {
                @Override
                public String toString() {
                    return "keg";
                }
            });

    public static void registerRecipes() {
        BlueberriesMod.LOGGER.info("Registering Custom Recipes for " + BlueberriesMod.MOD_ID);
    }
}
