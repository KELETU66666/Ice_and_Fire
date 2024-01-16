package com.github.alexthe666.iceandfire.block.keletu;

import com.google.common.collect.Lists;
import net.minecraft.block.Block;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class BlockDreadPistonStructureHelper {

    private final World world;
    private final BlockPos pistonPos;
    private final BlockPos blockToMove;
    private final EnumFacing moveDirection;
    private final List<BlockPos> toMove = Lists.<BlockPos>newArrayList();
    private final List<BlockPos> toDestroy = Lists.<BlockPos>newArrayList();
    
    private final boolean extending;

    public BlockDreadPistonStructureHelper(World worldIn, BlockPos posIn, EnumFacing pistonFacing, boolean extending)
    {
        this.world = worldIn;
        this.pistonPos = posIn;

        this.extending = extending;
        
        if (this.extending)
        {
            this.moveDirection = pistonFacing;
            this.blockToMove = posIn.offset(pistonFacing);
        }
        else
        {
            this.moveDirection = pistonFacing.getOpposite();
            this.blockToMove = posIn.offset(pistonFacing, 2);
        }
    }

    public boolean canMove()
    {
        this.toMove.clear();
        this.toDestroy.clear();
        IBlockState iblockstate = this.world.getBlockState(this.blockToMove);

        if (!canPush(iblockstate, this.world, this.blockToMove, this.moveDirection, false, this.moveDirection, this.extending))
        {
            if (iblockstate.getPushReaction() == EnumPushReaction.DESTROY)
            {
                this.toDestroy.add(this.blockToMove);
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (!this.addBlockLine(this.blockToMove, this.moveDirection))
        {
            return false;
        }
        else
        {
            for (int i = 0; i < this.toMove.size(); ++i)
            {
                BlockPos blockpos = this.toMove.get(i);

                IBlockState stateatpos = this.world.getBlockState(blockpos);
                Block blockatpos = stateatpos.getBlock();
                
                if (blockatpos.isStickyBlock(stateatpos)
                		&& !this.addBranchingBlocks(blockpos))
                {
                    return false;
                }
            }

            return true;
        }
    }

    private static boolean canPush(IBlockState blockStateIn, World worldIn, BlockPos pos, EnumFacing pushDir, boolean destroyBlocks, EnumFacing face, boolean extendingIn) {
        return BlockDreadPistonBase.canPush(blockStateIn, worldIn, pos, pushDir, destroyBlocks, face);
    }

    private boolean addBlockLine(BlockPos origin, EnumFacing facing)
    {
        IBlockState iblockstate = this.world.getBlockState(origin);
        Block block = iblockstate.getBlock();

        if (iblockstate.getBlock().isAir(iblockstate, this.world, origin))
        {
            return true;
        }
        else if (!canPush(iblockstate, this.world, origin, this.moveDirection, false, facing, this.extending))
        {
            return true;
        }
        else if (origin.equals(this.pistonPos))
        {
            return true;
        }
        else if (this.toMove.contains(origin))
        {
            return true;
        }
        else
        {
            int i = 1;

            if (i + this.toMove.size() > 12)
            {
                return false;
            }
            else
            {
                while (block.isStickyBlock(iblockstate))
                {
                	
                    BlockPos blockpos = origin.offset(this.moveDirection.getOpposite(), i);
                    iblockstate = this.world.getBlockState(blockpos);
                    block = iblockstate.getBlock();

                    if (iblockstate.getBlock().isAir(iblockstate, this.world, blockpos) || !canPush(iblockstate, this.world, blockpos, this.moveDirection, false, this.moveDirection.getOpposite(), this.extending) || blockpos.equals(this.pistonPos))
                    {
                        break;
                    }

                    ++i;

                    if (i + this.toMove.size() > 12)
                    {
                        return false;
                    }
                }

                int i1 = 0;

                for (int j = i - 1; j >= 0; --j)
                {
                    this.toMove.add(origin.offset(this.moveDirection.getOpposite(), j));
                    ++i1;
                }

                int j1 = 1;

                while (true)
                {
                	EnumFacing facing1 = this.moveDirection;
                    BlockPos blockpos1 = origin.offset(facing1, j1);
                    int k = this.toMove.indexOf(blockpos1);

                    if (k > -1)
                    {
                        this.reorderListAtCollision(i1, k);

                        for (int l = 0; l <= k + i1; ++l)
                        {
                            BlockPos blockpos2 = this.toMove.get(l);

                            IBlockState stateatpos = this.world.getBlockState(blockpos2);
                            
                            if (stateatpos.getBlock().isStickyBlock(stateatpos) && !this.addBranchingBlocks(blockpos2))
                            {
                                return false;
                            }
                        }

                        return true;
                    }

                    iblockstate = this.world.getBlockState(blockpos1);

                    if (iblockstate.getBlock().isAir(iblockstate, this.world, blockpos1))
                    {
                        return true;
                    }

                    if (!canPush(iblockstate, this.world, blockpos1, this.moveDirection, true, this.moveDirection, this.extending) || blockpos1.equals(this.pistonPos))
                    {
                        return false;
                    }

                    if (iblockstate.getPushReaction() == EnumPushReaction.DESTROY)
                    {
                        this.toDestroy.add(blockpos1);
                        return true;
                    }

                    if (this.toMove.size() >= 12)
                    {
                        return false;
                    }

                    this.toMove.add(blockpos1);
                    ++i1;
                    ++j1;
                }
            }
        }
    }

    private void reorderListAtCollision(int p_177255_1_, int p_177255_2_)
    {
        List<BlockPos> list = Lists.<BlockPos>newArrayList();
        List<BlockPos> list1 = Lists.<BlockPos>newArrayList();
        List<BlockPos> list2 = Lists.<BlockPos>newArrayList();
        list.addAll(this.toMove.subList(0, p_177255_2_));
        list1.addAll(this.toMove.subList(this.toMove.size() - p_177255_1_, this.toMove.size()));
        list2.addAll(this.toMove.subList(p_177255_2_, this.toMove.size() - p_177255_1_));
        this.toMove.clear();
        this.toMove.addAll(list);
        this.toMove.addAll(list1);
        this.toMove.addAll(list2);
    }

    private boolean addBranchingBlocks(BlockPos fromPos) {
        EnumFacing[] var2 = EnumFacing.values();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            EnumFacing enumfacing = var2[var4];
            if (enumfacing.getAxis() != this.moveDirection.getAxis() && !this.addBlockLine(fromPos.offset(enumfacing), enumfacing)) {
                return false;
            }
        }

        return true;
    }

    public List<BlockPos> getBlocksToMove()
    {
        return this.toMove;
    }

    public List<BlockPos> getBlocksToDestroy()
    {
        return this.toDestroy;
    }
}