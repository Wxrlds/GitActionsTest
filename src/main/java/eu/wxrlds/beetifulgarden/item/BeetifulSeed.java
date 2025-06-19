package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.block.ModBlocks;
import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class BeetifulSeed extends Item {
    public BeetifulSeed(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos().above();
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.CLOUDY_PLANTABLE_ON.get()),
                ModBlocks.CLOUDY_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.EMINENCE_PLANTABLE_ON.get()),
                ModBlocks.EMINENCE_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.MARINE_PLANTABLE_ON.get()),
                ModBlocks.MARINE_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.OLIVE_PLANTABLE_ON.get()),
                ModBlocks.OLIVE_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.PISTACHIO_PLANTABLE_ON.get()),
                ModBlocks.PISTACHIO_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.PIXIE_PLANTABLE_ON.get()),
                ModBlocks.PIXIE_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.SIENNA_PLANTABLE_ON.get()),
                ModBlocks.SIENNA_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.VELVET_PLANTABLE_ON.get()),
                ModBlocks.VELVET_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.VERDANT_PLANTABLE_ON.get()),
                ModBlocks.VERDANT_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        if (checkPlaceability(
                ModBlocks.ParseConfigPlantableBlock(BeetifulGardenCommonConfigs.VERDIGRIS_PLANTABLE_ON.get()),
                ModBlocks.VERDIGRIS_CROP.get(), context, world, blockPos)) {
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    private boolean checkPlaceability(Block plantableOn, Block cropBlock, UseOnContext context, Level world, BlockPos blockPos) {
        if (world.getBlockState(blockPos.below()).getBlock() == plantableOn) {
            world.setBlockAndUpdate(blockPos, cropBlock.defaultBlockState());
            if (!context.getPlayer().isCreative()) {
                context.getItemInHand().shrink(1);
            }
            return true;
        }
        return false;
    }
}
