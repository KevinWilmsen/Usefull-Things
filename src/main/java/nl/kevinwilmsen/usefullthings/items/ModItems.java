package nl.kevinwilmsen.usefullthings.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import nl.kevinwilmsen.usefullthings.UsefullThings;

public class ModItems {

    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UsefullThings.MOD_ID);

    public static final RegistryObject<Item> TANZANITE =ITEMS.register("tanzanite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.USEFULL_TAB)));


    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
