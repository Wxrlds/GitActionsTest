package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.BeetifulGarden;
import eu.wxrlds.beetifulgarden.ModGroup;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeetifulGarden.MOD_ID);

    public static final RegistryObject<Item> CLOUDY_BEETIFUL = BeetifulItem.RegisterBeetiful("cloudy_beetiful", BeetifulItem.CLOUDY_PROPERTIES, BeetifulGardenCommonConfigs.CLOUDY_EFFECTS.get());
    public static final RegistryObject<Item> EMINENCE_BEETIFUL = BeetifulItem.RegisterBeetiful("eminence_beetiful", BeetifulItem.EMINENCE_PROPERTIES, BeetifulGardenCommonConfigs.EMINENCE_EFFECTS.get());
    public static final RegistryObject<Item> MARINE_BEETIFUL = BeetifulItem.RegisterBeetiful("marine_beetiful", BeetifulItem.MARINE_PROPERTIES, BeetifulGardenCommonConfigs.MARINE_EFFECTS.get());
    public static final RegistryObject<Item> OLIVE_BEETIFUL = BeetifulItem.RegisterBeetiful("olive_beetiful", BeetifulItem.OLIVE_PROPERTIES, BeetifulGardenCommonConfigs.OLIVE_EFFECTS.get());
    public static final RegistryObject<Item> PISTACHIO_BEETIFUL = BeetifulItem.RegisterBeetiful("pistachio_beetiful", BeetifulItem.PISTACHIO_PROPERTIES, BeetifulGardenCommonConfigs.PISTACHIO_EFFECTS.get());
    public static final RegistryObject<Item> PIXIE_BEETIFUL = BeetifulItem.RegisterBeetiful("pixie_beetiful", BeetifulItem.PIXIE_PROPERTIES, BeetifulGardenCommonConfigs.PIXIE_EFFECTS.get());
    public static final RegistryObject<Item> SIENNA_BEETIFUL = BeetifulItem.RegisterBeetiful("sienna_beetiful", BeetifulItem.SIENNA_PROPERTIES, BeetifulGardenCommonConfigs.SIENNA_EFFECTS.get());
    public static final RegistryObject<Item> VELVET_BEETIFUL = BeetifulItem.RegisterBeetiful("velvet_beetiful", BeetifulItem.VELVET_PROPERTIES, BeetifulGardenCommonConfigs.VELVET_EFFECTS.get());
    public static final RegistryObject<Item> VERDANT_BEETIFUL = BeetifulItem.RegisterBeetiful("verdant_beetiful", BeetifulItem.VERDANT_PROPERTIES, BeetifulGardenCommonConfigs.VERDANT_EFFECTS.get());
    public static final RegistryObject<Item> VERDIGRIS_BEETIFUL = BeetifulItem.RegisterBeetiful("verdigris_beetiful", BeetifulItem.VERDIGRIS_PROPERTIES, BeetifulGardenCommonConfigs.VERDIGRIS_EFFECTS.get());

    public static final RegistryObject<Item> BEETIFUL_SEEDS = ITEMS.register("beetiful_seeds",
            () -> new BeetifulSeed(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}