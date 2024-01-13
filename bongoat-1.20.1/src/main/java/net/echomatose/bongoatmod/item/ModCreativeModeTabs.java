package net.echomatose.bongoatmod.item;

import net.echomatose.bongoatmod.BongoatMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, BongoatMod.MODID);

    public static final RegistryObject<CreativeModeTab> BONGOAT_TAB = CREATIVE_MODE_TABS.register("bongoat_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BONGOAT.get()))
                    .title(Component.translatable("creativetab.bongoat_tab")).displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BONGOAT.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
