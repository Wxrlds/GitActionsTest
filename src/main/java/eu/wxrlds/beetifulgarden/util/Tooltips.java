package eu.wxrlds.beetifulgarden.util;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.resources.I18n;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class Tooltips {
    public static void addCuresTooltip(List<ITextComponent> tooltip) {
        if (Screen.hasAltDown()) {
            String[] effectStrings = BeetifulGardenCommonConfigs.BEETZZA_NEGATES_EFFECT.get().split("\\|");
            for (String effectString : effectStrings) {
                EffectInstance effects = new EffectInstance(ForgeRegistries.POTIONS.getValue(new ResourceLocation(effectString)));

                String translationKey = effects.getEffect().getDescriptionId();
                String displayName = I18n.get(translationKey);
                tooltip.add(ITextComponent.nullToEmpty(displayName).copy().withStyle(TextFormatting.GRAY));
            }
        }
    }
}
