package net.echomatose.bongoatmod.sound;

import net.echomatose.bongoatmod.BongoatMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
        public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister
                        .create(ForgeRegistries.SOUND_EVENTS, BongoatMod.MODID);

        public static final RegistryObject<SoundEvent> BONGOAT_BLOCK_CLICKED = registerSoundEvents(
                        "bongoat_block_clicked");
        public static final RegistryObject<SoundEvent> BONGOAT_ECHO = registerSoundEvents("bongoat_echo");
        public static final RegistryObject<SoundEvent> BONGOAT_YUCHI = registerSoundEvents("bongoat_yuchi");
        public static final RegistryObject<SoundEvent> BONGOAT_SONACK = registerSoundEvents("bongoat_sonack");
        public static final RegistryObject<SoundEvent> BONGOAT_SIN = registerSoundEvents("bongoat_sin");
        public static final RegistryObject<SoundEvent> BONGOAT_LEON = registerSoundEvents("bongoat_leon");
        public static final RegistryObject<SoundEvent> NOM_NOM = registerSoundEvents("nom_nom");

        public static final RegistryObject<SoundEvent> BONGOAT_STEP = registerSoundEvents("bongoat_step");
        public static final RegistryObject<SoundEvent> BONGOAT_FALL = registerSoundEvents("bongoat_fall");
        public static final RegistryObject<SoundEvent> BONGOAT_PLACE = registerSoundEvents("bongoat_place");
        public static final RegistryObject<SoundEvent> BONGOAT_HIT = registerSoundEvents("bongoat_hit");
        public static final RegistryObject<SoundEvent> BONGOAT_BREAK = registerSoundEvents("bongoat_break");

        public static final ForgeSoundType BONGOAT_BLOCK_SOUNDS = new ForgeSoundType(1f, 1.23f, BONGOAT_BREAK,
                        BONGOAT_STEP,
                        BONGOAT_PLACE, BONGOAT_HIT, BONGOAT_FALL);

        private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
                return SOUND_EVENTS.register(name,
                                () -> SoundEvent.createVariableRangeEvent(
                                                new ResourceLocation(BongoatMod.MODID, name)));
        }

        public static void register(IEventBus eventBus) {
                SOUND_EVENTS.register(eventBus);
        }

}
