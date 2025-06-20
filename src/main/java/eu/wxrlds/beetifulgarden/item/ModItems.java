package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.BeetifulGarden;
import eu.wxrlds.beetifulgarden.ModGroup;
import eu.wxrlds.beetifulgarden.item.fruit.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeetifulGarden.MOD_ID);

    public static final RegistryObject<Item> CLOUDY_BEETIFUL = ITEMS.register("cloudy_beetiful",
            () -> new CloudyBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> EMINENCE_BEETIFUL = ITEMS.register("eminence_beetiful",
            () -> new EminenceBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> MARINE_BEETIFUL = ITEMS.register("marine_beetiful",
            () -> new MarineBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> OLIVE_BEETIFUL = ITEMS.register("olive_beetiful",
            () -> new OliveBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> PISTACHIO_BEETIFUL = ITEMS.register("pistachio_beetiful",
            () -> new PistachioBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> PIXIE_BEETIFUL = ITEMS.register("pixie_beetiful",
            () -> new PixieBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> SIENNA_BEETIFUL = ITEMS.register("sienna_beetiful",
            () -> new SiennaBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> VELVET_BEETIFUL = ITEMS.register("velvet_beetiful",
            () -> new VelvetBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> VERDANT_BEETIFUL = ITEMS.register("verdant_beetiful",
            () -> new VerdantBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> VERDIGRIS_BEETIFUL = ITEMS.register("verdigris_beetiful",
            () -> new VerdigrisBeetiful(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)));

    public static final RegistryObject<Item> BEETIFUL_SEEDS = ITEMS.register("beetiful_seeds",
            () -> new BeetifulSeed(
                    new Item.Properties().tab(ModGroup.BEETIFULGARDEN_GROUP)
            ));

    public static final RegistryObject<Item> BEETZZA = ITEMS.register("beetzza",
            () -> new Beetzza(
                    new Item.Properties()
                            .tab(ModGroup.BEETIFULGARDEN_GROUP)
                            .stacksTo(1)
                            .rarity(Rarity.EPIC)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}