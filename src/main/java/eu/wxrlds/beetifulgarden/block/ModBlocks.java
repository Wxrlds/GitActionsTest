package eu.wxrlds.beetifulgarden.block;

import eu.wxrlds.beetifulgarden.BeetifulGarden;
import eu.wxrlds.beetifulgarden.block.crop.*;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeetifulGarden.MOD_ID);

    public static Block ParseConfigPlantableBlock(String blockString) {
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(blockString));
    }

    public static final RegistryObject<Block> CLOUDY_CROP = BLOCKS.register("cloudy_crop",
            () -> new CloudyCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> EMINENCE_CROP = BLOCKS.register("eminence_crop",
            () -> new EminenceCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> MARINE_CROP = BLOCKS.register("marine_crop",
            () -> new MarineCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> OLIVE_CROP = BLOCKS.register("olive_crop",
            () -> new OliveCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> PISTACHIO_CROP = BLOCKS.register("pistachio_crop",
            () -> new PistachioCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> PIXIE_CROP = BLOCKS.register("pixie_crop",
            () -> new PixieCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> SIENNA_CROP = BLOCKS.register("sienna_crop",
            () -> new SiennaCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> VELVET_CROP = BLOCKS.register("velvet_crop",
            () -> new VelvetCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> VERDANT_CROP = BLOCKS.register("verdant_crop",
            () -> new VerdantCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static final RegistryObject<Block> VERDIGRIS_CROP = BLOCKS.register("verdigris_crop",
            () -> new VerdigrisCrop(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
