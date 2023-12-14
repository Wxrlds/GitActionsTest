package eu.wxrlds.beetifulgarden.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class BeetifulGardenCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.ConfigValue<Integer> CLOUDY_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> CLOUDY_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> CLOUDY_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> CLOUDY_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMINENCE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> EMINENCE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> EMINENCE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> EMINENCE_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARINE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> MARINE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> MARINE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> MARINE_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> OLIVE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> OLIVE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> OLIVE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> OLIVE_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> PISTACHIO_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> PISTACHIO_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> PISTACHIO_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> PISTACHIO_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> PIXIE_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> PIXIE_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> PIXIE_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> PIXIE_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> SIENNA_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> SIENNA_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> SIENNA_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> SIENNA_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> VELVET_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> VELVET_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> VELVET_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> VELVET_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> VERDANT_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> VERDANT_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> VERDANT_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> VERDANT_PLANTABLE_ON;
    public static final ForgeConfigSpec.ConfigValue<Integer> VERDIGRIS_NUTRITION;
    public static final ForgeConfigSpec.ConfigValue<Double> VERDIGRIS_SATURATION;
    public static final ForgeConfigSpec.ConfigValue<String> VERDIGRIS_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<String> VERDIGRIS_PLANTABLE_ON;

    static {
        BUILDER.comment("Configs for the Beetiful Fruits");
        BUILDER.push("Beetiful");
        String plantName = "Cloudy";
        BUILDER.push(plantName);
        CLOUDY_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        CLOUDY_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        CLOUDY_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:haste:6000:0|minecraft:water_breathing:6000:0");
        CLOUDY_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:blue_ice");
        BUILDER.pop();

        plantName = "Eminence";
        BUILDER.push(plantName);
        EMINENCE_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        EMINENCE_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        EMINENCE_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:regeneration:3000:0");
        EMINENCE_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:crying_obsidian");
        BUILDER.pop();

        plantName = "Marine";
        BUILDER.push(plantName);
        MARINE_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        MARINE_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        MARINE_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:haste:12000:0|minecraft:water_breathing:12000:0");
        MARINE_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:blue_glazed_terracotta");
        BUILDER.pop();

        plantName = "Olive";
        BUILDER.push(plantName);
        OLIVE_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        OLIVE_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        OLIVE_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:fire_resistance:6000:0|minecraft:jump_boost:6000:0");
        OLIVE_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:hay_block");
        BUILDER.pop();

        plantName = "Pistachio";
        BUILDER.push(plantName);
        PISTACHIO_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        PISTACHIO_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        PISTACHIO_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:speed:6000:0");
        PISTACHIO_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:wet_sponge");
        BUILDER.pop();

        plantName = "Pixie";
        BUILDER.push(plantName);
        PIXIE_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        PIXIE_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        PIXIE_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:speed:12000:0");
        PIXIE_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:melon");
        BUILDER.pop();

        plantName = "Sienna";
        BUILDER.push(plantName);
        SIENNA_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        SIENNA_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        SIENNA_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:fire_resistance:12000:0|minecraft:jump_boost:12000:0");
        SIENNA_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:honeycomb_block");
        BUILDER.pop();

        plantName = "Velvet";
        BUILDER.push(plantName);
        VELVET_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        VELVET_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        VELVET_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:regeneration:6000:0");
        VELVET_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:bubble_coral_block");
        BUILDER.pop();

        plantName = "Verdant";
        BUILDER.push(plantName);
        VERDANT_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        VERDANT_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        VERDANT_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:night_vision:6000:0|minecraft:saturation:6000:0");
        VERDANT_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:slime_block");
        BUILDER.pop();

        plantName = "Verdigris";
        BUILDER.push(plantName);
        VERDIGRIS_NUTRITION = BUILDER
                .comment("Nutrition value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Nutrition", 1, 0, 20);
        VERDIGRIS_SATURATION = BUILDER
                .comment("Saturation value for " + plantName + " Beetiful")
                .defineInRange(plantName.toLowerCase() + "Saturation", 0.6, 0.0, 20.0);
        VERDIGRIS_EFFECTS = BUILDER
                .comment("Effects of " + plantName + " Beetiful\nCan be empty string to disable effects \"\"\nEffects separated by pipe (|)\nmodID:effectID:durationInTicks:amplifier|modID:effectID:durationInTicks:amplifier")
                .define(plantName.toLowerCase() + "Effects", "minecraft:night_vision:12000:0|minecraft:saturation:12000:0");
        VERDIGRIS_PLANTABLE_ON = BUILDER
                .comment("Which block the " + plantName + " Beetiful is plantable on\nCan be empty string to disable planting\"\"\nmodID:blockID")
                .define(plantName.toLowerCase() + "PlantableOn", "minecraft:sea_lantern");
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
