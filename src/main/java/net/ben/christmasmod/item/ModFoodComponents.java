package net.ben.christmasmod.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.ConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class ModFoodComponents {
    public static final FoodComponent CANDY_CANE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.1F).build();
    public static final FoodComponent GINGERBREAD_MAN = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3F).build();
    public static final FoodComponent RAW_GINGERBREAD_MAN = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2F).build();

    public static final ConsumableComponent RAW_GINGERBREAD_MAN_C = ConsumableComponent.builder()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 12 * 20, 0), 0.5f))
            .build();
    public static final ConsumableComponent CANDY_CANE_C = ConsumableComponent.builder()
            .consumeSeconds(0.8f)
            .build();
}