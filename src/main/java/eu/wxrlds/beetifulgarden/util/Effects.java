package eu.wxrlds.beetifulgarden.util;

import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class Effects {
    public static List<EffectInstance> ConfigEffectsToEffectInstanceList(String effectString) {
        List<EffectInstance> effectInstanceList = new ArrayList<>();
        if (effectString.isEmpty()) {
            return effectInstanceList;
        }
        String[] effectStrings = effectString.split("\\|");
        for (String effect : effectStrings) {
            String[] parts = effect.split(":");

            String modID = parts[0];
            String effectID = parts[1];
            int duration = Integer.parseInt(parts[2]);
            int amplifier = Integer.parseInt(parts[3]);

            EffectInstance effects = new EffectInstance(ForgeRegistries.POTIONS.getValue(new ResourceLocation(modID, effectID)), duration, amplifier);
            effectInstanceList.add(effects);
        }
        return effectInstanceList;
    }
}
