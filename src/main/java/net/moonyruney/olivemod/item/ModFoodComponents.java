package net.moonyruney.olivemod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent OLIVE_OIL = new FoodComponent.Builder().hunger(5).saturationModifier(1.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1200, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2400, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 900, 0), 1.0f).build();
    public static final FoodComponent OLIVE = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();

}
