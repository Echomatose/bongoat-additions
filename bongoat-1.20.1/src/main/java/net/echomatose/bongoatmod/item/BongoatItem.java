package net.echomatose.bongoatmod.item;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import net.echomatose.bongoatmod.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BongoatItem extends Item {

    public BongoatItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(@Nonnull Level pLevel, @Nonnull Player pPlayer,
            @Nonnull InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        pPlayer.startUsingItem(pUsedHand);
        {
            String name = pPlayer.getDisplayName().getString();
            // System.out.print(name);
            if (name.equals("Echomatose")) {
                pLevel.playLocalSound(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.BONGOAT_ECHO.get(),
                        SoundSource.PLAYERS, 1f, 1f, false);

            } else if (name.equals("LeonBlade")) {
                pLevel.playLocalSound(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.BONGOAT_LEON.get(),
                        SoundSource.PLAYERS, 1f, 1f, false);

            } else if (name.equals("Sin_The_Exile")) {
                pLevel.playLocalSound(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.BONGOAT_SIN.get(),
                        SoundSource.PLAYERS, 1f, 1f, false);

            } else if (name.equals("Yuch_i")) {
                pLevel.playLocalSound(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.BONGOAT_YUCHI.get(),
                        SoundSource.PLAYERS, 1f, 1f, false);

            } else if (name.equals("Sonack")) {
                pLevel.playLocalSound(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(), ModSounds.BONGOAT_SONACK.get(),
                        SoundSource.PLAYERS, 1f, 1f, false);

            } else {
                pLevel.playLocalSound(pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                        ModSounds.BONGOAT_BLOCK_CLICKED.get(),
                        SoundSource.PLAYERS, 1f, 1f, false);
            }

        }
        return InteractionResultHolder.consume(itemstack);
    }

    @Override
    public int getUseDuration(@Nullable ItemStack pStack) {
        return 60;
    }
}
