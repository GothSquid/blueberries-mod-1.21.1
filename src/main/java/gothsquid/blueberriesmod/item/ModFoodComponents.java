package gothsquid.blueberriesmod.item;

import gothsquid.blueberriesmod.effect.ModEffects;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent BLUEBERRIES_COMPONENT = new FoodComponent.Builder()
            .nutrition(2)
            .saturationModifier(0.1F)
            .build();

    public static final FoodComponent BLUEBERRY_PIE_COMPONENT = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.3F)
            .build();

    public static final FoodComponent BLUEBERRY_CHEESECAKE_COMPONENT = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(1F)
            .build();

    public static final FoodComponent WATER_FILLED_BEER_GLASS_COMPONENT = new FoodComponent.Builder()
            .nutrition(0)
            .saturationModifier(0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent BLUEBERRY_WHEAT_ALE_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(ModEffects.STICKY, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent SWEET_BERRY_SOUR_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent PUMPKIN_PORTER_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent GHASTLY_GOSE_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 300, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent APPLEWOOD_CIDER_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 1), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent INFINITY_INK_IPA_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent REDSTONE_STOUT_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent GOLDEN_LAGER_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600, 0), 1.0F)
            .alwaysEdible()
            .build();

    public static final FoodComponent PEARL_PILSNER_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .alwaysEdible()
            .build();

    public static final FoodComponent MERLINS_MEAD_COMPONENT = new FoodComponent.Builder()
            .nutrition(6)
            .saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(ModEffects.KNOWLEDGE, 120, 0), 1.0F)
            .alwaysEdible()
            .build();
}
