package eu.wxrlds.beetifulgarden.item.fruit;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.util.Effects;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class PixieBeetiful extends Item {
    public PixieBeetiful(Properties properties) {
        super(properties.food(new FoodProperties.Builder().alwaysEat().build()));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        String effectString = BeetifulGardenCommonConfigs.PIXIE_EFFECTS.get();
        List<MobEffectInstance> mobEffects = Effects.ConfigEffectsToEffectInstanceList(effectString);

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
