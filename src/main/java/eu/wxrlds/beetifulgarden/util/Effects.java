package eu.wxrlds.beetifulgarden.util;

import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class Effects {
    public static EffectInstance[] ConfigEffectsToEffectInstanceList(String effectString) {
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
}
