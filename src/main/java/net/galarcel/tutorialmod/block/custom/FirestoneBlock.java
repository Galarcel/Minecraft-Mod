package net.galarcel.tutorialmod.block.custom;

import net.galarcel.tutorialmod.item.custom.Firestone;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class FirestoneBlock extends Block {
    public FirestoneBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }
    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType onBlockActivated(BlockState blockState, World worldIn, BlockPos pos, PlayerEntity playerEntity, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote()) {
            if (handIn == Hand.MAIN_HAND) {
                System.out.println("Player right clicked Firestone Block. Called Main hand");
            }
            if (handIn == Hand.OFF_HAND) {
                System.out.println("Player left clicked Firestone Block. Called Off hand");
            }
        }
        return super.onBlockActivated(blockState, worldIn, pos, playerEntity, handIn, hit);

    }

    @SuppressWarnings("deprecation")
    @Override
    public void onBlockClicked(BlockState state, World world, BlockPos blockPos, PlayerEntity playerEntity) {
        if (!world.isRemote()) {
            System.out.println("I left-clicked a firestone block");
        }
    }

    @Override
    public void onEntityWalk(World p_176199_1_, BlockPos p_176199_2_, Entity p_176199_3_) {
        Firestone.lightEntityOnFire(p_176199_3_, 5);
        super.onEntityWalk(p_176199_1_, p_176199_2_, p_176199_3_);
    }
}
