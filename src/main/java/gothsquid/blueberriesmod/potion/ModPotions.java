package gothsquid.blueberriesmod.potion;

import gothsquid.blueberriesmod.BlueberriesMod;
import gothsquid.blueberriesmod.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {
    public static final RegistryEntry<Potion> BLUEBERRY_WINE = registerPotion("blueberry_wine",
            new Potion(new StatusEffectInstance(ModEffects.STICKY, 1200, 0)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(BlueberriesMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        BlueberriesMod.LOGGER.info("Registering Mod Potions for " + BlueberriesMod.MOD_ID);
    }
}
