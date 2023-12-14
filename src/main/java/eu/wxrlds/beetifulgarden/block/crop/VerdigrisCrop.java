package eu.wxrlds.beetifulgarden.block.crop;

import eu.wxrlds.beetifulgarden.block.ModBlocks;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.item.ModItems;
import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class VerdigrisCrop extends BeetrootBlock implements IPlantable {
    Block plantableOn = ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.VERDIGRIS_PLANTABLE_ON.get());

    public VerdigrisCrop(Properties properties) {
        super(properties);
    }

    // Remove the plant type so that it cannot be placed on farmland
    @Override
    public PlantType getPlantType(IBlockReader world, BlockPos pos) {
        return null;
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return state.is(plantableOn);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.is(plantableOn);
    }

    @Override
    protected IItemProvider getBaseSeedId() {
        return ModItems.BEETIFUL_SEEDS.get();
    }
}