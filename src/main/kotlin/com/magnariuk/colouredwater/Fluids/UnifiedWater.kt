package com.magnariuk.colouredwater.Fluids

import com.magnariuk.colouredwater.ColouredWaterSet
import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.fluid.FlowableFluid
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.fluid.Fluids
import net.minecraft.item.Item
import net.minecraft.registry.tag.FluidTags
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView

abstract class UnifiedWater : ColouredWater() {
    lateinit var still: FlowableFluid
    lateinit var flowing: FlowableFluid
    lateinit var bucket: Item
    lateinit var block: Block

    override fun getStill(): Fluid = still
    override fun getFlowing(): Fluid = flowing
    override fun getBucketItem(): Item = bucket

    override fun matchesType(fluid: Fluid): Boolean {
        return fluid is UnifiedWater || fluid == Fluids.WATER || fluid == Fluids.FLOWING_WATER
    }
    override fun canBeReplacedWith(
        state: FluidState?,
        world: BlockView?,
        pos: BlockPos?,
        fluid: Fluid?,
        direction: Direction?
    ): Boolean {
        return (direction == Direction.DOWN && !fluid!!.isIn(FluidTags.WATER))
    }

    override fun toBlockState(state: FluidState): BlockState {
        return block.defaultState.with(Properties.LEVEL_15, getBlockStateLevel(state))
    }

    class Still : UnifiedWater() {
        override fun getLevel(state: FluidState): Int = 8
        override fun isStill(state: FluidState): Boolean = true
    }

    class Flowing : UnifiedWater() {
        override fun appendProperties(builder: StateManager.Builder<Fluid, FluidState>) {
            super.appendProperties(builder)
            builder.add(LEVEL)
        }

        override fun getLevel(state: FluidState): Int = state.get(LEVEL)
        override fun isStill(state: FluidState): Boolean = false
    }
}