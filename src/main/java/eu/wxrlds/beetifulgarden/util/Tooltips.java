package eu.wxrlds.beetifulgarden.util;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.EffectUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Map;

public class Tooltips {
    private static final IFormattableTextComponent NO_EFFECT = (new TranslationTextComponent("effect.none")).withStyle(TextFormatting.GRAY);

    // PotionUtils.addPotionTooltip
    @OnlyIn(Dist.CLIENT)
    public static void addPotionTooltip(List<ITextComponent> tooltip, float value, String effectString) {
        List<EffectInstance> list = getMobEffects(effectString);
        List<Pair<Attribute, AttributeModifier>> list1 = Lists.newArrayList();
        if (list.isEmpty()) {
            tooltip.add(NO_EFFECT);
        } else {
            for (EffectInstance effectinstance : list) {
                IFormattableTextComponent iformattabletextcomponent = new TranslationTextComponent(effectinstance.getDescriptionId());
                Effect effect = effectinstance.getEffect();
                Map<Attribute, AttributeModifier> map = effect.getAttributeModifiers();
                if (!map.isEmpty()) {
                    for (Map.Entry<Attribute, AttributeModifier> entry : map.entrySet()) {
                        AttributeModifier attributemodifier = entry.getValue();
                        AttributeModifier attributemodifier1 = new AttributeModifier(attributemodifier.getName(), effect.getAttributeModifierValue(effectinstance.getAmplifier(), attributemodifier), attributemodifier.getOperation());
                        list1.add(new Pair<>(entry.getKey(), attributemodifier1));
                    }
                }

                if (effectinstance.getAmplifier() > 0) {
                    iformattabletextcomponent = new TranslationTextComponent("potion.withAmplifier", iformattabletextcomponent, new TranslationTextComponent("potion.potency." + effectinstance.getAmplifier()));
                }

                if (effectinstance.getDuration() > 20) {
                    iformattabletextcomponent = new TranslationTextComponent("potion.withDuration", iformattabletextcomponent, EffectUtils.formatDuration(effectinstance, value));
                }

                tooltip.add(iformattabletextcomponent.withStyle(effect.getCategory().getTooltipFormatting()));
            }
        }

        if (!list1.isEmpty()) {
            tooltip.add(StringTextComponent.EMPTY);
            tooltip.add((new TranslationTextComponent("potion.whenDrank")).withStyle(TextFormatting.DARK_PURPLE));

            for (Pair<Attribute, AttributeModifier> pair : list1) {
                AttributeModifier attributemodifier2 = pair.getSecond();
                double d0 = attributemodifier2.getAmount();
                double d1;
                if (attributemodifier2.getOperation() != AttributeModifier.Operation.MULTIPLY_BASE && attributemodifier2.getOperation() != AttributeModifier.Operation.MULTIPLY_TOTAL) {
                    d1 = attributemodifier2.getAmount();
                } else {
                    d1 = attributemodifier2.getAmount() * 100.0D;
                }

                if (d0 > 0.0D) {
                    tooltip.add((new TranslationTextComponent("attribute.modifier.plus." + attributemodifier2.getOperation().toValue(), ItemStack.ATTRIBUTE_MODIFIER_FORMAT.format(d1), new TranslationTextComponent(pair.getFirst().getDescriptionId()))).withStyle(TextFormatting.BLUE));
                } else if (d0 < 0.0D) {
                    d1 = d1 * -1.0D;
                    tooltip.add((new TranslationTextComponent("attribute.modifier.take." + attributemodifier2.getOperation().toValue(), ItemStack.ATTRIBUTE_MODIFIER_FORMAT.format(d1), new TranslationTextComponent(pair.getFirst().getDescriptionId()))).withStyle(TextFormatting.RED));
                }
            }
        }

    }

    public static List<EffectInstance> getMobEffects(String effectString) {
        List<EffectInstance> effectInstanceList = Lists.newArrayList();
        if (!effectString.isEmpty()) {
            String[] effectStrings = effectString.split("\\|");
            for (String effects : effectStrings) {
                String[] parts = effects.split(":");
                String modID = parts[0];
                String effectID = parts[1];
                int durationInTicks = Integer.parseInt(parts[2]);
                int amplifier = Integer.parseInt(parts[3]);

                EffectInstance effect = new EffectInstance(ForgeRegistries.POTIONS.getValue(new ResourceLocation(modID, effectID)), durationInTicks, amplifier);
                effectInstanceList.add(effect);
            }
        }
        return effectInstanceList;
    }

    public static void addCuresTooltip(List<ITextComponent> tooltip, float value, String curesString) {
        if (Screen.hasAltDown()) {
            String[] effectStrings = BeetifulGardenCommonConfigs.BEETZZA_NEGATES_EFFECT.get().split("\\|");
            EffectInstance[] effects = new EffectInstance[effectStrings.length];
            for (int i = 0; i < effectStrings.length; i++) {
                String[] parts = effectStrings[i].split(":");
                String modID = parts[0];
                String effectID = parts[1];

                effects[i] = new EffectInstance(ForgeRegistries.POTIONS.getValue(new ResourceLocation(modID, effectID)));
                String translationKey = effects[i].getEffect().getDescriptionId();
                String displayName = I18n.get(translationKey);
                tooltip.add(ITextComponent.nullToEmpty(displayName).copy().withStyle(TextFormatting.GRAY));
            }
        }
    }
}
