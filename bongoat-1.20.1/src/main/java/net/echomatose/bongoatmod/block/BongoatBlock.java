package net.echomatose.bongoatmod.block;

import net.echomatose.bongoatmod.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BongoatBlock extends Block {
    public BongoatBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand,
            BlockHitResult pHit) {
        pLevel.playSound(pPlayer, pPos, ModSounds.BONGOAT_BLOCK_CLICKED.get(), SoundSource.BLOCKS, 1f, 1f);
        return InteractionResult.SUCCESS;

    }

}
