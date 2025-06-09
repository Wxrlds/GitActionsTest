package eu.wxrlds.beetifulgarden.item.fruit;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.util.Tooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CloudyBeetiful extends Item {
    public CloudyBeetiful(Properties properties) {
        super(properties.food(new Food.Builder().alwaysEat().build()));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        Tooltips.addPotionTooltip(tooltip, 1.0F, BeetifulGardenCommonConfigs.CLOUDY_EFFECTS.get());
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}
