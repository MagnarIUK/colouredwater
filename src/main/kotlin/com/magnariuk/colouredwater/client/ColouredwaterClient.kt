package com.magnariuk.colouredwater.client

import com.magnariuk.colouredwater.ColouredWaterSet
import com.magnariuk.colouredwater.ModFluids
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler
import net.minecraft.client.render.RenderLayer
import net.minecraft.util.Identifier

class ColouredwaterClient : ClientModInitializer {

    enum class WaterColor(val hex: Int) {
        WHITE(0xF9FFFE),
        ORANGE(0xF9801D),
        MAGENTA(0xC74EBD),
        LIGHT_BLUE(0x3AB3DA),
        YELLOW(0xFED83D),
        LIME(0x80C71F),
        PINK(0xF38BAA),
        GRAY(0x474F52),
        LIGHT_GRAY(0x9D9D97),
        CYAN(0x169C9C),
        PURPLE(0x8932B8),
        BLUE(0x3C44AA),
        BROWN(0x835432),
        GREEN(0x5E7C16),
        RED(0xB02E26),
        BLACK(0x1D1D21)
    }

    override fun onInitializeClient() {

        registerColouredWater(ModFluids.BLACK_WATER, WaterColor.BLACK.hex)
        registerColouredWater(ModFluids.YELLOW_WATER,WaterColor.YELLOW.hex)
        registerColouredWater(ModFluids.WHITE_WATER,WaterColor.WHITE.hex)
        registerColouredWater(ModFluids.ORANGE_WATER, WaterColor.ORANGE.hex)
        registerColouredWater(ModFluids.MAGENTA_WATER, WaterColor.MAGENTA.hex)
        registerColouredWater(ModFluids.LIGHT_BLUE_WATER, WaterColor.LIGHT_BLUE.hex)
        registerColouredWater(ModFluids.LIME_WATER, WaterColor.LIME.hex)
        registerColouredWater(ModFluids.PINK_WATER, WaterColor.PINK.hex)
        registerColouredWater(ModFluids.GRAY_WATER, WaterColor.GRAY.hex)
        registerColouredWater(ModFluids.LIGHT_GRAY_WATER, WaterColor.LIGHT_GRAY.hex)
        registerColouredWater(ModFluids.CYAN_WATER, WaterColor.CYAN.hex)
        registerColouredWater(ModFluids.PURPLE_WATER, WaterColor.PURPLE.hex)
        registerColouredWater(ModFluids.BLUE_WATER, WaterColor.BLUE.hex)
        registerColouredWater(ModFluids.BROWN_WATER, WaterColor.BROWN.hex)
        registerColouredWater(ModFluids.GREEN_WATER, WaterColor.GREEN.hex)
        registerColouredWater(ModFluids.RED_WATER, WaterColor.RED.hex)

        registerColouredWater(ModFluids.BLACK_WATER_OPAQUE, WaterColor.BLACK.hex, opaque = true)
        registerColouredWater(ModFluids.YELLOW_WATER_OPAQUE, WaterColor.YELLOW.hex, opaque = true)
        registerColouredWater(ModFluids.WHITE_WATER_OPAQUE, WaterColor.WHITE.hex, opaque = true)
        registerColouredWater(ModFluids.ORANGE_WATER_OPAQUE, WaterColor.ORANGE.hex, opaque = true)
        registerColouredWater(ModFluids.MAGENTA_WATER_OPAQUE, WaterColor.MAGENTA.hex, opaque = true)
        registerColouredWater(ModFluids.LIGHT_BLUE_WATER_OPAQUE, WaterColor.LIGHT_BLUE.hex, opaque = true)
        registerColouredWater(ModFluids.LIME_WATER_OPAQUE, WaterColor.LIME.hex, opaque = true)
        registerColouredWater(ModFluids.PINK_WATER_OPAQUE, WaterColor.PINK.hex, opaque = true)
        registerColouredWater(ModFluids.GRAY_WATER_OPAQUE, WaterColor.GRAY.hex, opaque = true)
        registerColouredWater(ModFluids.LIGHT_GRAY_WATER_OPAQUE, WaterColor.LIGHT_GRAY.hex, opaque = true)
        registerColouredWater(ModFluids.CYAN_WATER_OPAQUE, WaterColor.CYAN.hex, opaque = true)
        registerColouredWater(ModFluids.PURPLE_WATER_OPAQUE, WaterColor.PURPLE.hex, opaque = true)
        registerColouredWater(ModFluids.BLUE_WATER_OPAQUE, WaterColor.BLUE.hex, opaque = true)
        registerColouredWater(ModFluids.BROWN_WATER_OPAQUE, WaterColor.BROWN.hex, opaque = true)
        registerColouredWater(ModFluids.GREEN_WATER_OPAQUE, WaterColor.GREEN.hex, opaque = true)
        registerColouredWater(ModFluids.RED_WATER_OPAQUE, WaterColor.RED.hex, opaque = true)

        registerColouredWater(ModFluids.BLACK_WATER_SHINING, WaterColor.BLACK.hex)
        registerColouredWater(ModFluids.YELLOW_WATER_SHINING,WaterColor.YELLOW.hex)
        registerColouredWater(ModFluids.WHITE_WATER_SHINING,WaterColor.WHITE.hex)
        registerColouredWater(ModFluids.ORANGE_WATER_SHINING, WaterColor.ORANGE.hex)
        registerColouredWater(ModFluids.MAGENTA_WATER_SHINING, WaterColor.MAGENTA.hex)
        registerColouredWater(ModFluids.LIGHT_BLUE_WATER_SHINING, WaterColor.LIGHT_BLUE.hex)
        registerColouredWater(ModFluids.LIME_WATER_SHINING, WaterColor.LIME.hex)
        registerColouredWater(ModFluids.PINK_WATER_SHINING, WaterColor.PINK.hex)
        registerColouredWater(ModFluids.GRAY_WATER_SHINING, WaterColor.GRAY.hex)
        registerColouredWater(ModFluids.LIGHT_GRAY_WATER_SHINING, WaterColor.LIGHT_GRAY.hex)
        registerColouredWater(ModFluids.CYAN_WATER_SHINING, WaterColor.CYAN.hex)
        registerColouredWater(ModFluids.PURPLE_WATER_SHINING, WaterColor.PURPLE.hex)
        registerColouredWater(ModFluids.BLUE_WATER_SHINING, WaterColor.BLUE.hex)
        registerColouredWater(ModFluids.BROWN_WATER_SHINING, WaterColor.BROWN.hex)
        registerColouredWater(ModFluids.GREEN_WATER_SHINING, WaterColor.GREEN.hex)
        registerColouredWater(ModFluids.RED_WATER_SHINING, WaterColor.RED.hex)

        registerColouredWater(ModFluids.BLACK_WATER_OPAQUE_SHINING, WaterColor.BLACK.hex, opaque = true)
        registerColouredWater(ModFluids.YELLOW_WATER_OPAQUE_SHINING, WaterColor.YELLOW.hex, opaque = true)
        registerColouredWater(ModFluids.WHITE_WATER_OPAQUE_SHINING, WaterColor.WHITE.hex, opaque = true)
        registerColouredWater(ModFluids.ORANGE_WATER_OPAQUE_SHINING, WaterColor.ORANGE.hex, opaque = true)
        registerColouredWater(ModFluids.MAGENTA_WATER_OPAQUE_SHINING, WaterColor.MAGENTA.hex, opaque = true)
        registerColouredWater(ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING, WaterColor.LIGHT_BLUE.hex, opaque = true)
        registerColouredWater(ModFluids.LIME_WATER_OPAQUE_SHINING, WaterColor.LIME.hex, opaque = true)
        registerColouredWater(ModFluids.PINK_WATER_OPAQUE_SHINING, WaterColor.PINK.hex, opaque = true)
        registerColouredWater(ModFluids.GRAY_WATER_OPAQUE_SHINING, WaterColor.GRAY.hex, opaque = true)
        registerColouredWater(ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING, WaterColor.LIGHT_GRAY.hex, opaque = true)
        registerColouredWater(ModFluids.CYAN_WATER_OPAQUE_SHINING, WaterColor.CYAN.hex, opaque = true)
        registerColouredWater(ModFluids.PURPLE_WATER_OPAQUE_SHINING, WaterColor.PURPLE.hex, opaque = true)
        registerColouredWater(ModFluids.BLUE_WATER_OPAQUE_SHINING, WaterColor.BLUE.hex, opaque = true)
        registerColouredWater(ModFluids.BROWN_WATER_OPAQUE_SHINING, WaterColor.BROWN.hex, opaque = true)
        registerColouredWater(ModFluids.GREEN_WATER_OPAQUE_SHINING, WaterColor.GREEN.hex, opaque = true)
        registerColouredWater(ModFluids.RED_WATER_OPAQUE_SHINING, WaterColor.RED.hex, opaque = true)

        registerColouredWater(ModFluids.WATER_SHINING, 0x3F76E4)



    }
    fun registerColouredWater(
        set: ColouredWaterSet,
        colour: Int,
        opaque: Boolean = false
    ){
        FluidRenderHandlerRegistry.INSTANCE.register(
            set.still, set.flowing,
            SimpleFluidRenderHandler(
                Identifier.of("minecraft:block/water_still"),
                Identifier.of("minecraft:block/water_flow"),
                colour
            )
        )
        if (!opaque){
            BlockRenderLayerMap.INSTANCE.putFluids(
                RenderLayer.getTranslucent(),
                set.still, set.flowing
            )
        }
    }
}
