package eu.wxrlds.beetifulgarden.item.special;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;

public class Effects {

	public static final Food EMINENCE_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.REGENERATION, 3000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food VELVET_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.REGENERATION, 6000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food CLOUDY_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.DIG_SPEED, 6000, 0), 1.0f)
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.WATER_BREATHING, 6000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food MARINE_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.DIG_SPEED, 12000, 0), 1.0f)
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.WATER_BREATHING, 12000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();


	public static final Food VERDANT_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.NIGHT_VISION, 6000, 0), 1.0f)
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.SATURATION, 6000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food VERDIGRIS_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.NIGHT_VISION, 12000, 0), 1.0f)
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.SATURATION, 12000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food PISTACHIO_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.MOVEMENT_SPEED, 6000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food PIXIE_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.MOVEMENT_SPEED, 12000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food OLIVE_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.FIRE_RESISTANCE, 6000, 1), 1.0f)
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.JUMP, 6000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();

	public static final Food SIENNA_EFFECT = new Food.Builder()
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.FIRE_RESISTANCE, 12000, 1), 1.0f)
			.effect(() -> new EffectInstance(net.minecraft.potion.Effects.JUMP, 12000, 0), 1.0f)
			.nutrition(1)
			.saturationMod(0.6f)
			.alwaysEat()
			.build();


}
