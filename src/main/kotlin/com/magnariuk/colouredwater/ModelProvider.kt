package com.magnariuk.colouredwater

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
        generator.register(ModFluids.BLACK_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.WHITE_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.GRAY_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_GRAY_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.RED_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.ORANGE_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.YELLOW_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.LIME_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.GREEN_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.CYAN_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_BLUE_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.BLUE_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.PURPLE_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.MAGENTA_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.PINK_WATER.bucket, Models.GENERATED)
        generator.register(ModFluids.BROWN_WATER.bucket, Models.GENERATED)

        generator.register(ModFluids.BLACK_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.WHITE_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.GRAY_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_GRAY_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.RED_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.ORANGE_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.YELLOW_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.LIME_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.GREEN_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.CYAN_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_BLUE_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.BLUE_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.PURPLE_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.MAGENTA_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.PINK_WATER_OPAQUE.bucket, Models.GENERATED)
        generator.register(ModFluids.BROWN_WATER_OPAQUE.bucket, Models.GENERATED)

        generator.register(ModFluids.BLACK_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.WHITE_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.GRAY_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_GRAY_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.RED_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.ORANGE_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.YELLOW_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.LIME_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.GREEN_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.CYAN_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_BLUE_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.BLUE_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.PURPLE_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.MAGENTA_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.PINK_WATER_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.BROWN_WATER_SHINING.bucket, Models.GENERATED)

        generator.register(ModFluids.BLACK_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.WHITE_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.GRAY_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.RED_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.ORANGE_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.YELLOW_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.LIME_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.GREEN_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.CYAN_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.BLUE_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.PURPLE_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.MAGENTA_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.PINK_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.BROWN_WATER_OPAQUE_SHINING.bucket, Models.GENERATED)
        generator.register(ModFluids.WATER_SHINING.bucket, Models.GENERATED)
    }

}