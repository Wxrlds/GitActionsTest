package eu.wxrlds.beetifulgarden.block.crop;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.item.ModItems;
import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.registries.ForgeRegistries;

public class VelvetCrop extends BeetrootBlock implements IPlantable {
    private Block getPlantableOn() {
        String configValue = BeetifulGardenCommonConfigs.VELVET_PLANTABLE_ON.get();
        return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(configValue));
    }

    public VelvetCrop(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.is(getPlantableOn());
    }

    @Override
    protected IItemProvider getBaseSeedId() {
        return ModItems.BEETIFUL_SEEDS.get();
    }
}