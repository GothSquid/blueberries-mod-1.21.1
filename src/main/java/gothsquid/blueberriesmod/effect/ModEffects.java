package gothsquid.blueberriesmod.effect;

import gothsquid.blueberriesmod.BlueberriesMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> STICKY = registerStatusEffect("sticky",
            new StickyEffect(StatusEffectCategory.NEUTRAL, 0x725eef)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(BlueberriesMod.MOD_ID, "sticky"),-0.25F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> KNOWLEDGE = registerStatusEffect("knowledge",
            new KnowledgeEffect(StatusEffectCategory.BENEFICIAL, 0xb27516));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(BlueberriesMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        BlueberriesMod.LOGGER.info("Registering Mod Effects for " + BlueberriesMod.MOD_ID);
    }
}
