package eu.wxrlds.beetifulgarden.item.fruit;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.util.Tooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class EminenceBeetiful extends Item {
    public EminenceBeetiful(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        Tooltips.addPotionTooltip(tooltip, 1.0F, BeetifulGardenCommonConfigs.EMINENCE_EFFECTS.get());
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
