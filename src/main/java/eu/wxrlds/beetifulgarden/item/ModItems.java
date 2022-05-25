package eu.wxrlds.beetifulgarden.item;

import eu.wxrlds.beetifulgarden.BeetifulGarden;
import eu.wxrlds.beetifulgarden.ModGroup;
import eu.wxrlds.beetifulgarden.block.ModBlocks;
import eu.wxrlds.beetifulgarden.item.special.Effects;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.List;


public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeetifulGarden.MOD_ID);

	public static final RegistryObject<Item> EMINENCE_BEETIFUL = ITEMS.register("eminence_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.EMINENCE_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.eminence_effect"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> VELVET_BEETIFUL = ITEMS.register("velvet_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.VELVET_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.velvet_effect"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> MARINE_BEETIFUL = ITEMS.register("marine_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.MARINE_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.marine_effect"));
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.marine_effect_line2"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> CLOUDY_BEETIFUL = ITEMS.register("cloudy_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.CLOUDY_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.cloudy_effect"));
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.cloudy_effect_line2"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> VERDANT_BEETIFUL = ITEMS.register("verdant_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.VERDANT_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.verdant_effect"));
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.verdant_effect_line2"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> VERDIGRIS_BEETIFUL = ITEMS.register("verdigris_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.VERDIGRIS_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.verdigris_effect"));
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.verdigris_effect_line2"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> PISTACHIO_BEETIFUL = ITEMS.register("pistachio_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.PISTACHIO_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.pistachio_effect"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> PIXIE_BEETIFUL = ITEMS.register("pixie_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.PIXIE_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.pixie_effect"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> OLIVE_BEETIFUL = ITEMS.register("olive_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.OLIVE_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.olive_effect"));
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.olive_effect_line2"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> SIENNA_BEETIFUL = ITEMS.register("sienna_beetiful",
			() -> new Item(new Item.Properties()
					.food(Effects.SIENNA_EFFECT)
					.tab(ModGroup.BEETIFULGARDEN_GROUP)) {
				@Override
				public void appendHoverText(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.sienna_effect"));
					tooltip.add(new TranslationTextComponent("tooltip.beetifulgarden.sienna_effect_line2"));
					super.appendHoverText(stack, worldIn, tooltip, flagIn);
				}
			});

	public static final RegistryObject<Item> BEETIFUL_SEEDS = ITEMS.register("beetiful_seeds",
			() -> new BlockNamedItem(ModBlocks.BEETIFUL_CROP.get(),
					new Item.Properties()
							.tab(ModGroup.BEETIFULGARDEN_GROUP)));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}