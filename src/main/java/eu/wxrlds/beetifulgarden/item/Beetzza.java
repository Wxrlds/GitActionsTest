package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.config.BeetifulGardenCommonConfigs;
import eu.wxrlds.beetifulgarden.util.Tooltips;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;

public class Beetzza extends Item {
    public Beetzza(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if (!BeetifulGardenCommonConfigs.BEETZZA_NEGATES_EFFECT.get().isEmpty()) {
            tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.beetzza_negates_alt").withStyle(TextFormatting.GRAY));
            Tooltips.addCuresTooltip(tooltip, 1.0F, BeetifulGardenCommonConfigs.BEETZZA_NEGATES_EFFECT.get());
        }
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!BeetifulGardenCommonConfigs.BEETZZA_NEGATES_EFFECT.get().isEmpty())
            if (!world.isClientSide) {
                if (entity instanceof PlayerEntity) {
                    String[] effectStrings = BeetifulGardenCommonConfigs.BEETZZA_NEGATES_EFFECT.get().split("\\|");
                    EffectInstance[] effects = new EffectInstance[effectStrings.length];
                    for (int i = 0; i < effectStrings.length; i++) {
                        String[] parts = effectStrings[i].split(":");
                        String modID = parts[0];
                        String effectID = parts[1];
                        effects[i] = new EffectInstance(ForgeRegistries.POTIONS.getValue(new ResourceLocation(modID, effectID)));

                        PlayerEntity player = (PlayerEntity) entity;
                        player.removeEffect(effects[i].getEffect());
                    }
                }
            }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
