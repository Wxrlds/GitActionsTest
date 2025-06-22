package eu.wxrlds.beetifulgarden.item.fruit;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.util.Effects;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.PotionUtils;
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
        String effectString = BeetifulGardenCommonConfigs.CLOUDY_EFFECTS.get();
        List<EffectInstance> mobEffects = Effects.ConfigEffectsToEffectInstanceList(effectString);

        // Create a fake potion ItemStack to generate tooltip with custom effects.
        // The actual item can't store effects directly since we load the effect from the config file,
        // but PotionUtils.addPotionTooltip expects effects to be pulled from the ItemStack's NBT.
        // So we simulate a real potion item here with our desired effects baked in,
        // just to borrow its tooltip logic.
        ItemStack fakeStack = new ItemStack(Items.POTION);
        PotionUtils.setCustomEffects(fakeStack, mobEffects);
        PotionUtils.addPotionTooltip(fakeStack, tooltip, 1.0F);
    }
}
