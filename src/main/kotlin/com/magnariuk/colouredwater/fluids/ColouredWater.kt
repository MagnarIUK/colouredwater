package com.magnariuk.colouredwater.fluids

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.fluid.FlowableFluid
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.registry.tag.FluidTags
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView
import net.minecraft.world.World
import net.minecraft.world.WorldAccess
import net.minecraft.world.WorldView




abstract class ColouredWater: FlowableFluid() {

    override fun matchesType(fluid: Fluid): Boolean {
        return fluid == getStill() || fluid == getFlowing()
    }

    protected override fun isInfinite(world: World?): Boolean {
        return false
    }

    protected override fun beforeBreakingBlock(world: WorldAccess?, pos: BlockPos?, state: BlockState?) {
        val blockEntity = if (state!!.hasBlockEntity()) world!!.getBlockEntity(pos) else null
        Block.dropStacks(state, world, pos, blockEntity)
    }

    protected override fun canBeReplacedWith(
        state: FluidState?,
        world: BlockView?,
        pos: BlockPos?,
        fluid: Fluid?,
        direction: Direction?
    ): Boolean {
        return direction == Direction.DOWN && !fluid!!.isIn(FluidTags.WATER)
    }

    protected override fun getMaxFlowDistance(world: WorldView?): Int {
        return 8
    }

    protected override fun getLevelDecreasePerBlock(world: WorldView?): Int {
        return 1
    }

    override fun getTickRate(world: WorldView?): Int {
        return 5
    }
    override fun getBlastResistance(): Float {
        return 100.0F
    }

}