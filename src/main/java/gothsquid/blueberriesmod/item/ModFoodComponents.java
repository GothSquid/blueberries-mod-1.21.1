package gothsquid.blueberriesmod.item;

import net.minecraft.component.type.FoodComponent;

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
}
