package net.moonyruney.olivemod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;


public class ModFoodComponents {

    public static final FoodComponent OLIVE_OIL = new FoodComponent.Builder().hunger(5).saturationModifier(1.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 12000, 4), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 18000, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1200, 0), 1.0f).build();
    public static final FoodComponent OLIVE = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f).build();
    public static final FoodComponent IRON_BREW = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 3600, 1),1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3600, 4), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 3600, 2),1.0f).build();
    public static final FoodComponent BUNGER = new FoodComponent.Builder().hunger(10).saturationModifier(1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 0), 1.0f).build();

}
