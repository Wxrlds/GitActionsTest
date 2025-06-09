package eu.wxrlds.beetifulgarden.util;

import eu.wxrlds.beetifulgarden.BeetifulGarden;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.FoodStats;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BeetifulGarden.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void applyBeetifulEffectOnEaten(LivingEntityUseItemEvent.Finish event) {
        // Only execute on server
        if (!event.getEntity().level.isClientSide()) {

            PlayerEntity player = (PlayerEntity) event.getEntityLiving();

            EffectInstance[] effects = new EffectInstance[0];
            FoodStats foodStats = player.getFoodData();
            int nutritionValue = 0;
            double saturationValue = 0;

            // Get potion effects and food values
            Item item = event.getItem().getItem();
            if (item == ModItems.CLOUDY_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.CLOUDY_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.CLOUDY_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.CLOUDY_SATURATION.get();
            } else if (item == ModItems.EMINENCE_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.EMINENCE_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.EMINENCE_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.EMINENCE_SATURATION.get();
            } else if (item == ModItems.MARINE_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.MARINE_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.MARINE_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.MARINE_SATURATION.get();
            } else if (item == ModItems.OLIVE_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.OLIVE_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.OLIVE_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.OLIVE_SATURATION.get();
            } else if (item == ModItems.PISTACHIO_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.PISTACHIO_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.PISTACHIO_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.PISTACHIO_SATURATION.get();
            } else if (item == ModItems.PIXIE_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.PIXIE_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.PIXIE_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.PIXIE_SATURATION.get();
            } else if (item == ModItems.SIENNA_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.SIENNA_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.SIENNA_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.SIENNA_SATURATION.get();
            } else if (item == ModItems.VELVET_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.VELVET_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.VELVET_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.VELVET_SATURATION.get();
            } else if (item == ModItems.VERDANT_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.VERDANT_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.VERDANT_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.VERDANT_SATURATION.get();
            } else if (item == ModItems.VERDIGRIS_BEETIFUL.get()) {
                effects = Effects.ConfigEffectsToEffectInstanceList(BeetifulGardenCommonConfigs.VERDIGRIS_EFFECTS.get());
                nutritionValue = BeetifulGardenCommonConfigs.VERDIGRIS_NUTRITION.get();
                saturationValue = BeetifulGardenCommonConfigs.VERDIGRIS_SATURATION.get();
            }

            for (EffectInstance effect : effects) {
                player.addEffect(effect);
            }
            // We need to cap it at 20 or the food value can go over the vanilla limit
            foodStats.setSaturation(Math.min(20, foodStats.getSaturationLevel() + (float) saturationValue));
            foodStats.setFoodLevel(Math.min(20, foodStats.getFoodLevel() + nutritionValue));
        }
    }
}