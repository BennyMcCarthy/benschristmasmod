package net.ben.christmasmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CANDY_CANE = new FoodComponent.Builder().hunger(4).saturationModifier(0.1F).snack().build();
    public static final FoodComponent GINGERBREAD_MAN = new FoodComponent.Builder().hunger(6).saturationModifier(0.3F).build();
    public static final FoodComponent RAW_GINGERBREAD_MAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300, 0), 0.5F).build();
}