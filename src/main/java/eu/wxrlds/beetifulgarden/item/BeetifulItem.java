package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.ModGroup;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;


public class BeetifulItem {
    public static RegistryObject<Item> RegisterBeetiful(String itemID, Food.Builder foodPropertiesBuilder, String effectString) {
        return ModItems.ITEMS.register(itemID,
                () -> new Item(BeetifulItem.BeetifulProperties(foodPropertiesBuilder, effectString)));
    }

    public static Item.Properties BeetifulProperties(Food.Builder foodPropertiesBuilder, String effectString) {
        EffectInstance[] effects = ParseConfigEffects(effectString);

        for (EffectInstance effectToAdd : effects) {
            foodPropertiesBuilder = foodPropertiesBuilder.effect(effectToAdd, 1.0f);
        }
        Food foodProperties = foodPropertiesBuilder.build();
        return new Item.Properties()
                .food(foodProperties)
                .tab(ModGroup.BEETIFULGARDEN_GROUP);
    }

    public static EffectInstance[] ParseConfigEffects(String effectString) {
        if (!effectString.isEmpty()) {
            String[] effectStrings = effectString.split("\\|");
            EffectInstance[] effectInstances = new EffectInstance[effectStrings.length];
            for (int i = 0; i < effectStrings.length; i++) {
                String[] parts = effectStrings[i].split(":");
                String modID = parts[0];
                String effectID = parts[1];
                int duration = Integer.parseInt(parts[2]);
                int amplifier = Integer.parseInt(parts[3]);
                effectInstances[i] = new EffectInstance(ForgeRegistries.POTIONS.getValue(new ResourceLocation(modID, effectID)), duration, amplifier);
            }
            return effectInstances;
        }
        return new EffectInstance[0];
    }

    public static final Food.Builder CLOUDY_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.CLOUDY_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.CLOUDY_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder EMINENCE_PROPERTIES = (new Food.Builder())
            .nutrition(BeetifulGardenCommonConfigs.EMINENCE_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.EMINENCE_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder MARINE_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.MARINE_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.MARINE_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder OLIVE_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.OLIVE_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.OLIVE_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder PISTACHIO_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.PISTACHIO_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.PISTACHIO_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder PIXIE_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.PIXIE_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.PIXIE_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder SIENNA_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.SIENNA_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.SIENNA_SATURATION.get().doubleValue())
            .alwaysEat();

    public static final Food.Builder VELVET_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.VELVET_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.VELVET_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder VERDANT_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.VERDANT_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.VERDANT_SATURATION.get().doubleValue())
            .alwaysEat();
    public static final Food.Builder VERDIGRIS_PROPERTIES = new Food.Builder()
            .nutrition(BeetifulGardenCommonConfigs.VERDIGRIS_NUTRITION.get())
            .saturationMod((float) BeetifulGardenCommonConfigs.VERDIGRIS_SATURATION.get().doubleValue())
            .alwaysEat();
}