package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.ModGroup;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.util.Effects;
import eu.wxrlds.beetifulgarden.util.Tooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;

public class BeetifulItem {
    public static RegistryObject<Item> RegisterBeetiful(String itemID, Food.Builder foodPropertiesBuilder, String effectString) {
        return ModItems.ITEMS.register(itemID,
                () -> new Item(BeetifulItem.BeetifulProperties(foodPropertiesBuilder, effectString)) {
                    @Override
                    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
                        Tooltips.addPotionTooltip(tooltip, 1.0F, effectString);
                        super.appendHoverText(stack, worldIn, tooltip, flagIn);
                    }
                });
    }

    public static Item.Properties BeetifulProperties(Food.Builder foodPropertiesBuilder, String effectString) {
        EffectInstance[] effects = Effects.ConfigEffectsToEffectInstanceList(effectString);

        for (EffectInstance effectToAdd : effects) {
            foodPropertiesBuilder = foodPropertiesBuilder.effect(effectToAdd, 1.0f);
        }
        Food foodProperties = foodPropertiesBuilder.build();
        return new Item.Properties()
                .food(foodProperties)
                .tab(ModGroup.BEETIFULGARDEN_GROUP);
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