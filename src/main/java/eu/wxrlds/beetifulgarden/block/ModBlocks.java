package eu.wxrlds.beetifulgarden.block;

import eu.wxrlds.beetifulgarden.BeetifulGarden;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeetifulGarden.MOD_ID);

	public static final RegistryObject<Block> BEETIFUL_CROP = BLOCKS.register("beetiful_crop",
			() -> new BeetifulCropBlock(AbstractBlock.Properties.copy(Blocks.BEETROOTS)));

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
