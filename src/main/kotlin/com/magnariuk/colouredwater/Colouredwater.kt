package com.magnariuk.colouredwater

import com.magnariuk.colouredwater.Fluids.UnifiedWater
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.block.Blocks
import net.minecraft.block.DispenserBlock
import net.minecraft.block.FluidBlock
import net.minecraft.block.LeveledCauldronBlock
import net.minecraft.block.cauldron.CauldronBehavior
import net.minecraft.fluid.FlowableFluid
import net.minecraft.item.BucketItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroups
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Identifier
import net.minecraft.world.biome.Biome
import java.awt.print.Book

val MOD_ID = "colouredwater"

object ModFluids {
    lateinit var BLACK_WATER: ColouredWaterSet
    lateinit var YELLOW_WATER: ColouredWaterSet
    lateinit var WHITE_WATER: ColouredWaterSet
    lateinit var ORANGE_WATER: ColouredWaterSet
    lateinit var MAGENTA_WATER: ColouredWaterSet
    lateinit var LIGHT_BLUE_WATER: ColouredWaterSet
    lateinit var LIME_WATER: ColouredWaterSet
    lateinit var PINK_WATER: ColouredWaterSet
    lateinit var GRAY_WATER: ColouredWaterSet
    lateinit var LIGHT_GRAY_WATER: ColouredWaterSet
    lateinit var CYAN_WATER: ColouredWaterSet
    lateinit var PURPLE_WATER: ColouredWaterSet
    lateinit var BLUE_WATER: ColouredWaterSet
    lateinit var BROWN_WATER: ColouredWaterSet
    lateinit var GREEN_WATER: ColouredWaterSet
    lateinit var RED_WATER: ColouredWaterSet

    lateinit var BLACK_WATER_OPAQUE: ColouredWaterSet
    lateinit var YELLOW_WATER_OPAQUE: ColouredWaterSet
    lateinit var WHITE_WATER_OPAQUE: ColouredWaterSet
    lateinit var ORANGE_WATER_OPAQUE: ColouredWaterSet
    lateinit var MAGENTA_WATER_OPAQUE: ColouredWaterSet
    lateinit var LIGHT_BLUE_WATER_OPAQUE: ColouredWaterSet
    lateinit var LIME_WATER_OPAQUE: ColouredWaterSet
    lateinit var PINK_WATER_OPAQUE: ColouredWaterSet
    lateinit var GRAY_WATER_OPAQUE: ColouredWaterSet
    lateinit var LIGHT_GRAY_WATER_OPAQUE: ColouredWaterSet
    lateinit var CYAN_WATER_OPAQUE: ColouredWaterSet
    lateinit var PURPLE_WATER_OPAQUE: ColouredWaterSet
    lateinit var BLUE_WATER_OPAQUE: ColouredWaterSet
    lateinit var BROWN_WATER_OPAQUE: ColouredWaterSet
    lateinit var GREEN_WATER_OPAQUE: ColouredWaterSet
    lateinit var RED_WATER_OPAQUE: ColouredWaterSet

    lateinit var BLACK_WATER_SHINING: ColouredWaterSet
    lateinit var YELLOW_WATER_SHINING: ColouredWaterSet
    lateinit var WHITE_WATER_SHINING: ColouredWaterSet
    lateinit var ORANGE_WATER_SHINING: ColouredWaterSet
    lateinit var MAGENTA_WATER_SHINING: ColouredWaterSet
    lateinit var LIGHT_BLUE_WATER_SHINING: ColouredWaterSet
    lateinit var LIME_WATER_SHINING: ColouredWaterSet
    lateinit var PINK_WATER_SHINING: ColouredWaterSet
    lateinit var GRAY_WATER_SHINING: ColouredWaterSet
    lateinit var LIGHT_GRAY_WATER_SHINING: ColouredWaterSet
    lateinit var CYAN_WATER_SHINING: ColouredWaterSet
    lateinit var PURPLE_WATER_SHINING: ColouredWaterSet
    lateinit var BLUE_WATER_SHINING: ColouredWaterSet
    lateinit var BROWN_WATER_SHINING: ColouredWaterSet
    lateinit var GREEN_WATER_SHINING: ColouredWaterSet
    lateinit var RED_WATER_SHINING: ColouredWaterSet

    lateinit var BLACK_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var YELLOW_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var WHITE_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var ORANGE_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var MAGENTA_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var LIGHT_BLUE_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var LIME_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var PINK_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var GRAY_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var LIGHT_GRAY_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var CYAN_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var PURPLE_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var BLUE_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var BROWN_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var GREEN_WATER_OPAQUE_SHINING: ColouredWaterSet
    lateinit var RED_WATER_OPAQUE_SHINING: ColouredWaterSet

    lateinit var WATER_SHINING: ColouredWaterSet


}
data class ColouredWaterSet(
    val still: FlowableFluid,
    val flowing: FlowableFluid,
    val bucket: Item,
    val block: Block,
    val cauldron: Block
)

class Colouredwater : ModInitializer {

    override fun onInitialize() {
        ModFluids.BLACK_WATER = registerWater("black_water")
        ModFluids.YELLOW_WATER = registerWater("yellow_water")
        ModFluids.WHITE_WATER = registerWater("white_water")
        ModFluids.ORANGE_WATER = registerWater("orange_water")
        ModFluids.MAGENTA_WATER = registerWater("magenta_water")
        ModFluids.LIGHT_BLUE_WATER = registerWater("light_blue_water")
        ModFluids.LIME_WATER = registerWater("lime_water")
        ModFluids.PINK_WATER = registerWater("pink_water")
        ModFluids.GRAY_WATER = registerWater("gray_water")
        ModFluids.LIGHT_GRAY_WATER = registerWater("light_gray_water")
        ModFluids.CYAN_WATER = registerWater("cyan_water")
        ModFluids.PURPLE_WATER = registerWater("purple_water")
        ModFluids.BLUE_WATER = registerWater("blue_water")
        ModFluids.BROWN_WATER = registerWater("brown_water")
        ModFluids.GREEN_WATER = registerWater("green_water")
        ModFluids.RED_WATER = registerWater("red_water")

        ModFluids.BLACK_WATER_OPAQUE = registerWater("black_water_opaque")
        ModFluids.YELLOW_WATER_OPAQUE = registerWater("yellow_water_opaque")
        ModFluids.WHITE_WATER_OPAQUE = registerWater("white_water_opaque")
        ModFluids.ORANGE_WATER_OPAQUE = registerWater("orange_water_opaque")
        ModFluids.MAGENTA_WATER_OPAQUE = registerWater("magenta_water_opaque")
        ModFluids.LIGHT_BLUE_WATER_OPAQUE = registerWater("light_blue_water_opaque")
        ModFluids.LIME_WATER_OPAQUE = registerWater("lime_water_opaque")
        ModFluids.PINK_WATER_OPAQUE = registerWater("pink_water_opaque")
        ModFluids.GRAY_WATER_OPAQUE = registerWater("gray_water_opaque")
        ModFluids.LIGHT_GRAY_WATER_OPAQUE = registerWater("light_gray_water_opaque")
        ModFluids.CYAN_WATER_OPAQUE = registerWater("cyan_water_opaque")
        ModFluids.PURPLE_WATER_OPAQUE = registerWater("purple_water_opaque")
        ModFluids.BLUE_WATER_OPAQUE = registerWater("blue_water_opaque")
        ModFluids.BROWN_WATER_OPAQUE = registerWater("brown_water_opaque")
        ModFluids.GREEN_WATER_OPAQUE = registerWater("green_water_opaque")
        ModFluids.RED_WATER_OPAQUE = registerWater("red_water_opaque")

        ModFluids.BLACK_WATER_SHINING = registerWater("black_water_shining", lightLevel = 15)
        ModFluids.YELLOW_WATER_SHINING = registerWater("yellow_water_shining", lightLevel = 15)
        ModFluids.WHITE_WATER_SHINING = registerWater("white_water_shining", lightLevel = 15)
        ModFluids.ORANGE_WATER_SHINING = registerWater("orange_water_shining", lightLevel = 15)
        ModFluids.MAGENTA_WATER_SHINING = registerWater("magenta_water_shining", lightLevel = 15)
        ModFluids.LIGHT_BLUE_WATER_SHINING = registerWater("light_blue_water_shining", lightLevel = 15)
        ModFluids.LIME_WATER_SHINING = registerWater("lime_water_shining", lightLevel = 15)
        ModFluids.PINK_WATER_SHINING = registerWater("pink_water_shining", lightLevel = 15)
        ModFluids.GRAY_WATER_SHINING = registerWater("gray_water_shining", lightLevel = 15)
        ModFluids.LIGHT_GRAY_WATER_SHINING = registerWater("light_gray_water_shining", lightLevel = 15)
        ModFluids.CYAN_WATER_SHINING = registerWater("cyan_water_shining", lightLevel = 15)
        ModFluids.PURPLE_WATER_SHINING = registerWater("purple_water_shining", lightLevel = 15)
        ModFluids.BLUE_WATER_SHINING = registerWater("blue_water_shining", lightLevel = 15)
        ModFluids.BROWN_WATER_SHINING = registerWater("brown_water_shining", lightLevel = 15)
        ModFluids.GREEN_WATER_SHINING = registerWater("green_water_shining", lightLevel = 15)
        ModFluids.RED_WATER_SHINING = registerWater("red_water_shining", lightLevel = 15)

        ModFluids.BLACK_WATER_OPAQUE_SHINING = registerWater("black_water_opaque_shining", lightLevel = 7)
        ModFluids.YELLOW_WATER_OPAQUE_SHINING = registerWater("yellow_water_opaque_shining", lightLevel = 7)
        ModFluids.WHITE_WATER_OPAQUE_SHINING = registerWater("white_water_opaque_shining", lightLevel = 7)
        ModFluids.ORANGE_WATER_OPAQUE_SHINING = registerWater("orange_water_opaque_shining", lightLevel = 7)
        ModFluids.MAGENTA_WATER_OPAQUE_SHINING = registerWater("magenta_water_opaque_shining", lightLevel = 7)
        ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING = registerWater("light_blue_water_opaque_shining", lightLevel = 7)
        ModFluids.LIME_WATER_OPAQUE_SHINING = registerWater("lime_water_opaque_shining", lightLevel = 7)
        ModFluids.PINK_WATER_OPAQUE_SHINING = registerWater("pink_water_opaque_shining", lightLevel = 7)
        ModFluids.GRAY_WATER_OPAQUE_SHINING = registerWater("gray_water_opaque_shining", lightLevel = 7)
        ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING = registerWater("light_gray_water_opaque_shining", lightLevel = 7)
        ModFluids.CYAN_WATER_OPAQUE_SHINING = registerWater("cyan_water_opaque_shining", lightLevel = 7)
        ModFluids.PURPLE_WATER_OPAQUE_SHINING = registerWater("purple_water_opaque_shining", lightLevel = 7)
        ModFluids.BLUE_WATER_OPAQUE_SHINING = registerWater("blue_water_opaque_shining", lightLevel = 7)
        ModFluids.BROWN_WATER_OPAQUE_SHINING = registerWater("brown_water_opaque_shining", lightLevel = 7)
        ModFluids.GREEN_WATER_OPAQUE_SHINING = registerWater("green_water_opaque_shining", lightLevel = 7)
        ModFluids.RED_WATER_OPAQUE_SHINING = registerWater("red_water_opaque_shining", lightLevel = 7)

        ModFluids.WATER_SHINING = registerWater("water_shining", lightLevel = 15)


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register { content ->
            content.add(ModFluids.BLACK_WATER.bucket)
            content.add(ModFluids.WATER_SHINING.bucket)
            content.add(ModFluids.WHITE_WATER.bucket)
            content.add(ModFluids.GRAY_WATER.bucket)
            content.add(ModFluids.LIGHT_GRAY_WATER.bucket)
            content.add(ModFluids.RED_WATER.bucket)
            content.add(ModFluids.ORANGE_WATER.bucket)
            content.add(ModFluids.YELLOW_WATER.bucket)
            content.add(ModFluids.LIME_WATER.bucket)
            content.add(ModFluids.GREEN_WATER.bucket)
            content.add(ModFluids.CYAN_WATER.bucket)
            content.add(ModFluids.LIGHT_BLUE_WATER.bucket)
            content.add(ModFluids.BLUE_WATER.bucket)
            content.add(ModFluids.PURPLE_WATER.bucket)
            content.add(ModFluids.MAGENTA_WATER.bucket)
            content.add(ModFluids.PINK_WATER.bucket)
            content.add(ModFluids.BROWN_WATER.bucket)

            content.add(ModFluids.BLACK_WATER_OPAQUE.bucket)
            content.add(ModFluids.WHITE_WATER_OPAQUE.bucket)
            content.add(ModFluids.GRAY_WATER_OPAQUE.bucket)
            content.add(ModFluids.LIGHT_GRAY_WATER_OPAQUE.bucket)
            content.add(ModFluids.RED_WATER_OPAQUE.bucket)
            content.add(ModFluids.ORANGE_WATER_OPAQUE.bucket)
            content.add(ModFluids.YELLOW_WATER_OPAQUE.bucket)
            content.add(ModFluids.LIME_WATER_OPAQUE.bucket)
            content.add(ModFluids.GREEN_WATER_OPAQUE.bucket)
            content.add(ModFluids.CYAN_WATER_OPAQUE.bucket)
            content.add(ModFluids.LIGHT_BLUE_WATER_OPAQUE.bucket)
            content.add(ModFluids.BLUE_WATER_OPAQUE.bucket)
            content.add(ModFluids.PURPLE_WATER_OPAQUE.bucket)
            content.add(ModFluids.MAGENTA_WATER_OPAQUE.bucket)
            content.add(ModFluids.PINK_WATER_OPAQUE.bucket)
            content.add(ModFluids.BROWN_WATER_OPAQUE.bucket)

            content.add(ModFluids.BLACK_WATER_SHINING.bucket)
            content.add(ModFluids.WHITE_WATER_SHINING.bucket)
            content.add(ModFluids.GRAY_WATER_SHINING.bucket)
            content.add(ModFluids.LIGHT_GRAY_WATER_SHINING.bucket)
            content.add(ModFluids.RED_WATER_SHINING.bucket)
            content.add(ModFluids.ORANGE_WATER_SHINING.bucket)
            content.add(ModFluids.YELLOW_WATER_SHINING.bucket)
            content.add(ModFluids.LIME_WATER_SHINING.bucket)
            content.add(ModFluids.GREEN_WATER_SHINING.bucket)
            content.add(ModFluids.CYAN_WATER_SHINING.bucket)
            content.add(ModFluids.LIGHT_BLUE_WATER_SHINING.bucket)
            content.add(ModFluids.BLUE_WATER_SHINING.bucket)
            content.add(ModFluids.PURPLE_WATER_SHINING.bucket)
            content.add(ModFluids.MAGENTA_WATER_SHINING.bucket)
            content.add(ModFluids.PINK_WATER_SHINING.bucket)
            content.add(ModFluids.BROWN_WATER_SHINING.bucket)

            content.add(ModFluids.BLACK_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.WHITE_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.GRAY_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.RED_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.ORANGE_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.YELLOW_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.LIME_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.GREEN_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.CYAN_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.BLUE_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.PURPLE_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.MAGENTA_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.PINK_WATER_OPAQUE_SHINING.bucket)
            content.add(ModFluids.BROWN_WATER_OPAQUE_SHINING.bucket)
        }

    }

    fun registerWater(name: String, lightLevel: Int = 0): ColouredWaterSet {
        val stillFluid = UnifiedWater.Still()
        val flowingFluid = UnifiedWater.Flowing()

        stillFluid.still = stillFluid
        stillFluid.flowing = flowingFluid
        flowingFluid.still = stillFluid
        flowingFluid.flowing = flowingFluid

        Registry.register(Registries.FLUID, Identifier.of(MOD_ID, name), stillFluid)
        Registry.register(Registries.FLUID, Identifier.of(MOD_ID, "flowing_$name"), flowingFluid)

        val bucket = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "${name}_bucket"),
            BucketItem(stillFluid, Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1))
        )
        stillFluid.bucket = bucket
        flowingFluid.bucket = bucket

        var blockSettings = AbstractBlock.Settings.copy(Blocks.WATER)

        if (lightLevel > 0) {
            blockSettings = blockSettings.luminance {lightLevel}
                .emissiveLighting { _, _, _ -> true }
        }

        val block = Registry.register(
            Registries.BLOCK,
            Identifier.of(MOD_ID, "${name}_block"),
            object : FluidBlock(stillFluid, blockSettings) {}
        )
        stillFluid.block = block
        flowingFluid.block = block

        val cauldronMap = CauldronBehavior.createMap(name)
        val specificMap = CauldronBehavior.WATER_CAULDRON_BEHAVIOR.map()
        for ((key, value) in specificMap) {
            cauldronMap.map()[key] = value
        }

        cauldronMap.map()[Items.BUCKET] = CauldronBehavior { state, world, pos, player, hand, stack ->
            CauldronBehavior.emptyCauldron(state, world, pos, player, hand, stack,
                ItemStack(bucket), { true }, SoundEvents.ITEM_BUCKET_FILL)
        }

        var cauldronBlockSettings = AbstractBlock.Settings.copy(Blocks.CAULDRON)

        if(lightLevel > 0) {
            cauldronBlockSettings = cauldronBlockSettings.luminance {lightLevel}.emissiveLighting { _, _, _ -> true }
        }

        val cauldronBlock = Registry.register(
            Registries.BLOCK,
            Identifier.of(MOD_ID, "${name}_cauldron"),
            LeveledCauldronBlock(
                Biome.Precipitation.NONE,
                cauldronMap,
                cauldronBlockSettings
            )
        )

        CauldronBehavior.EMPTY_CAULDRON_BEHAVIOR.map()[bucket] =
            CauldronBehavior { state, world, pos, player, hand, stack ->
                CauldronBehavior.fillCauldron(world, pos, player, hand, stack, cauldronBlock.defaultState.with(
                    LeveledCauldronBlock.LEVEL, 3), SoundEvents.ITEM_BUCKET_EMPTY)
            }


        DispenserBlock.registerBehavior(bucket, DispenserBlock.BEHAVIORS[Items.WATER_BUCKET])

        return ColouredWaterSet(stillFluid, flowingFluid, bucket, block, cauldronBlock)
    }
}
