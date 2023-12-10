package eu.wxrlds.beetifulgarden.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class BeetifulGardenCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMINENCE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> EMINENCE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> EMINENCE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> VELVET_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> VELVET_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> VELVET_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARINE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> MARINE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> MARINE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> CLOUDY_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> CLOUDY_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> CLOUDY_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> VERDANT_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> VERDANT_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> VERDANT_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> VERDIGRIS_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> VERDIGRIS_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> VERDIGRIS_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> PISTACHIO_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> PISTACHIO_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> PISTACHIO_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> PIXIE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> PIXIE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> PIXIE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> OLIVE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> OLIVE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> OLIVE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SIENNA_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> SIENNA_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> SIENNA_EFFECTS;

    static {
        BUILDER.comment("Configs for the Beetiful Fruits");
        BUILDER.push("Beetiful");
        BUILDER.push("Eminence");
        EMINENCE_NUTRITION = BUILDER
                .comment("Nutrition value for Eminence Beetiful")
                .defineInRange("eminenceNutrition", 1, 0, 20);
        EMINENCE_SATURATION = BUILDER
                .comment("Saturation value for Eminence Beetiful")
                .defineInRange("eminenceSaturation", 0.6, 0.0, 20.0);
        EMINENCE_EFFECTS = BUILDER
                .comment("Effects of Eminence Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("eminenceEffects", "minecraft:regeneration:3000:0");
        BUILDER.pop();

        BUILDER.push("Velvet");
        VELVET_NUTRITION = BUILDER
                .comment("Nutrition value for Velvet Beetiful")
                .defineInRange("velvetNutrition", 1, 0, 20);
        VELVET_SATURATION = BUILDER
                .comment("Saturation value for Velvet Beetiful")
                .defineInRange("velvetSaturation", 0.6, 0.0, 20.0);
        VELVET_EFFECTS = BUILDER
                .comment("Effects of Velvet Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("velvetEffects", "minecraft:regeneration:6000:0");
        BUILDER.pop();

        BUILDER.push("Cloudy");
        CLOUDY_NUTRITION = BUILDER
                .comment("Nutrition value for Cloudy Beetiful")
                .defineInRange("cloudyNutrition", 1, 0, 20);
        CLOUDY_SATURATION = BUILDER
                .comment("Saturation value for Cloudy Beetiful")
                .defineInRange("cloudySaturation", 0.6, 0.0, 20.0);
        CLOUDY_EFFECTS = BUILDER
                .comment("Effects of Cloudy Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("cloudyEffects", "minecraft:haste:6000:0|minecraft:water_breathing:6000:0");
        BUILDER.pop();

        BUILDER.push("Marine");
        MARINE_NUTRITION = BUILDER
                .comment("Nutrition value for Marine Beetiful")
                .defineInRange("marineNutrition", 1, 0, 20);
        MARINE_SATURATION = BUILDER
                .comment("Saturation value for Marine Beetiful")
                .defineInRange("marineSaturation", 0.6, 0.0, 20.0);
        MARINE_EFFECTS = BUILDER
                .comment("Effects of Marine Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("marineEffects", "minecraft:haste:12000:0|minecraft:water_breathing:12000:0");
        BUILDER.pop();

        BUILDER.push("Verdant");
        VERDANT_NUTRITION = BUILDER
                .comment("Nutrition value for Verdant Beetiful")
                .defineInRange("verdantNutrition", 1, 0, 20);
        VERDANT_SATURATION = BUILDER
                .comment("Saturation value for Verdant Beetiful")
                .defineInRange("verdantSaturation", 0.6, 0.0, 20.0);
        VERDANT_EFFECTS = BUILDER
                .comment("Effects of Verdant Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("verdantEffects", "minecraft:night_vision:6000:0|minecraft:saturation:6000:0");
        BUILDER.pop();

        BUILDER.push("Verdigris");
        VERDIGRIS_NUTRITION = BUILDER
                .comment("Nutrition value for Verdigris Beetiful")
                .defineInRange("verdigrisNutrition", 1, 0, 20);
        VERDIGRIS_SATURATION = BUILDER
                .comment("Saturation value for Verdigris Beetiful")
                .defineInRange("verdigrisSaturation", 0.6, 0.0, 20.0);
        VERDIGRIS_EFFECTS = BUILDER
                .comment("Effects of Verdigris Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("verdigrisEffects", "minecraft:night_vision:12000:0|minecraft:saturation:12000:0");
        BUILDER.pop();

        BUILDER.push("Pistachio");
        PISTACHIO_NUTRITION = BUILDER
                .comment("Nutrition value for Pistachio Beetiful")
                .defineInRange("pistachioNutrition", 1, 0, 20);
        PISTACHIO_SATURATION = BUILDER
                .comment("Saturation value for Pistachio Beetiful")
                .defineInRange("pistachioSaturation", 0.6, 0.0, 20.0);
        PISTACHIO_EFFECTS = BUILDER
                .comment("Effects of Pistachio Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("pistachioEffects", "minecraft:speed:6000:0");
        BUILDER.pop();

        BUILDER.push("Pixie");
        PIXIE_NUTRITION = BUILDER
                .comment("Nutrition value for Pixie Beetiful")
                .defineInRange("pixieNutrition", 1, 0, 20);
        PIXIE_SATURATION = BUILDER
                .comment("Saturation value for Pixie Beetiful")
                .defineInRange("pixieSaturation", 0.6, 0.0, 20.0);
        PIXIE_EFFECTS = BUILDER
                .comment("Effects of Pixie Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("pixieEffects", "minecraft:speed:12000:0");
        BUILDER.pop();

        BUILDER.push("Olive");
        OLIVE_NUTRITION = BUILDER
                .comment("Nutrition value for Olive Beetiful")
                .defineInRange("oliveNutrition", 1, 0, 20);
        OLIVE_SATURATION = BUILDER
                .comment("Saturation value for Olive Beetiful")
                .defineInRange("oliveSaturation", 0.6, 0.0, 20.0);
        OLIVE_EFFECTS = BUILDER
                .comment("Effects of Olive Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("oliveEffects", "minecraft:fire_resistance:6000:0|minecraft:jump_boost:6000:0");
        BUILDER.pop();

        BUILDER.push("Sienna");
        SIENNA_NUTRITION = BUILDER
                .comment("Nutrition value for Sienna Beetiful")
                .defineInRange("siennaNutrition", 1, 0, 20);
        SIENNA_SATURATION = BUILDER
                .comment("Saturation value for Sienna Beetiful")
                .defineInRange("siennaSaturation", 0.6, 0.0, 20.0);
        SIENNA_EFFECTS = BUILDER
                .comment("Effects of Sienna Beetiful\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define("siennaEffects", "minecraft:fire_resistance:12000:0|minecraft:jump_boost:12000:0");
        BUILDER.pop();
        BUILDER.pop();

        SPEC = BUILDER.build();
    }

    // Load config file early to make nutrition, saturation, effects configurable
    public static void loadConfig(ForgeConfigSpec configFile, String filePath) {
        final CommentedFileConfig file = CommentedFileConfig.builder(
                new File(filePath)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        configFile.setConfig(file);
    }
}
