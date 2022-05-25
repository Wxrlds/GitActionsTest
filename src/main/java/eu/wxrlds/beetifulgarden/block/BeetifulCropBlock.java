package eu.wxrlds.beetifulgarden.block;

import eu.wxrlds.beetifulgarden.item.ModItems;
import net.minecraft.block.BeetrootBlock;
import net.minecraft.util.IItemProvider;

public class BeetifulCropBlock extends BeetrootBlock {

	public BeetifulCropBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected IItemProvider getBaseSeedId() {
		return ModItems.BEETIFUL_SEEDS.get();
	}
}