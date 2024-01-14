package net.echomatose.bongoatmod.item;

import net.echomatose.bongoatmod.BongoatMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BongoatMod.MODID);

    public static final RegistryObject<Item> BONGOAT = ITEMS.register("bongoat",
            () -> new BongoatItem(new Item.Properties()));

    public static final RegistryObject<Item> BONGOAT_SMILING = ITEMS.register("bongoat_smiling",
            () -> new BongoatItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
