package net.Tibon_leader.firstmod.item;

import net.Tibon_leader.firstmod.FirstMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FirstMod.MODID);

    public static final DeferredItem<Item> Green_Diamond = ITEMS.register("green_diamond",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> Green_Amethyst_Shard = ITEMS.register("green_amethyst_shard",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
