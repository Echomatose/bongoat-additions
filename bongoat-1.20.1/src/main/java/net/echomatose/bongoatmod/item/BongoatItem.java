package net.echomatose.bongoatmod.item;

import net.echomatose.bongoatmod.sound.ModSounds;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

public class BongoatItem extends Item {

    public BongoatItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        ItemStack itemstack = pPlayer.getItemInHand(pUsedHand);
        pPlayer.startUsingItem(pUsedHand);
        {
            String name = pPlayer.getDisplayName().getString();
            // System.out.print(name);
            if (name.equals("Echomatose")) {
                pLevel.playSeededSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                        ModSounds.BONGOAT_ECHO.get(), SoundSource.PLAYERS, 1f, 1f, 0);

            } else if (name.equals("LeonBlade")) {
                pLevel.playSeededSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                        ModSounds.BONGOAT_LEON.get(), SoundSource.PLAYERS, 1f, 1f, 0);

            } else if (name.equals("Yuch_i")) {
                pLevel.playSeededSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                        ModSounds.BONGOAT_YUCHI.get(), SoundSource.PLAYERS, 1f, 1f, 0);

            } else {
                pLevel.playSeededSound(null, pPlayer.getX(), pPlayer.getY(), pPlayer.getZ(),
                        ModSounds.BONGOAT_BLOCK_CLICKED.get(), SoundSource.PLAYERS, 1f, 1f, 0);
            }

        }
        return InteractionResultHolder.consume(itemstack);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return ToolActions.DEFAULT_SHIELD_ACTIONS.contains(toolAction);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BLOCK;
    }

    @Override
    public int getUseDuration(ItemStack pStack) {
        return 72000;
    }

}
