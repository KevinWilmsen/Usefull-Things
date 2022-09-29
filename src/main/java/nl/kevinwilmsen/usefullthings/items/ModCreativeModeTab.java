package nl.kevinwilmsen.usefullthings.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab USEFULL_TAB = new CreativeModeTab("usefulltab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TANZANITE.get());
        }
    };
}
