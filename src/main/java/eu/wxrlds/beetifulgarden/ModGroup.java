package eu.wxrlds.beetifulgarden;

import eu.wxrlds.beetifulgarden.item.ModItems;
import net.minecraft.item.ItemStack;

public class ModGroup {

	public static final net.minecraft.item.ItemGroup BEETIFULGARDEN_GROUP = new net.minecraft.item.ItemGroup("beetifulGardenModGroup") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.VELVET_BEETIFUL.get());
		}
	};

}
