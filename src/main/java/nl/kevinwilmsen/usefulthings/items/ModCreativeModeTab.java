package nl.kevinwilmsen.usefulthings.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab USEFULL_TAB = new CreativeModeTab("usefultab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TANZANITE.get());
        }
    };
}
