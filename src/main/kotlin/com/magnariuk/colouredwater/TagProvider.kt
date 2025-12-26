package com.magnariuk.colouredwater

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.registry.RegistryWrapper
import net.minecraft.registry.tag.FluidTags
import java.util.concurrent.CompletableFuture

class TagProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
): FabricTagProvider.FluidTagProvider(output, registriesFuture) {
    override fun configure(p0: RegistryWrapper.WrapperLookup?) {
        getOrCreateTagBuilder(FluidTags.WATER)
            .add(ModFluids.BLACK_WATER.still)
            .add(ModFluids.BLACK_WATER.flowing)
            .add(ModFluids.YELLOW_WATER.flowing)
            .add(ModFluids.YELLOW_WATER.still)
            .add(ModFluids.WHITE_WATER.still)
            .add(ModFluids.WHITE_WATER.flowing)
            .add(ModFluids.ORANGE_WATER.still).add(ModFluids.ORANGE_WATER.flowing)
            .add(ModFluids.MAGENTA_WATER.still).add(ModFluids.MAGENTA_WATER.flowing)
            .add(ModFluids.LIGHT_BLUE_WATER.still).add(ModFluids.LIGHT_BLUE_WATER.flowing)
            .add(ModFluids.LIME_WATER.still).add(ModFluids.LIME_WATER.flowing)
            .add(ModFluids.PINK_WATER.still).add(ModFluids.PINK_WATER.flowing)
            .add(ModFluids.GRAY_WATER.still).add(ModFluids.GRAY_WATER.flowing)
            .add(ModFluids.LIGHT_GRAY_WATER.still).add(ModFluids.LIGHT_GRAY_WATER.flowing)
            .add(ModFluids.CYAN_WATER.still).add(ModFluids.CYAN_WATER.flowing)
            .add(ModFluids.PURPLE_WATER.still).add(ModFluids.PURPLE_WATER.flowing)
            .add(ModFluids.BLUE_WATER.still).add(ModFluids.BLUE_WATER.flowing)
            .add(ModFluids.BROWN_WATER.still).add(ModFluids.BROWN_WATER.flowing)
            .add(ModFluids.GREEN_WATER.still).add(ModFluids.GREEN_WATER.flowing)
            .add(ModFluids.RED_WATER.still).add(ModFluids.RED_WATER.flowing)

            .add(ModFluids.BLACK_WATER_OPAQUE.still).add(ModFluids.BLACK_WATER_OPAQUE.flowing)
            .add(ModFluids.WHITE_WATER_OPAQUE.still).add(ModFluids.WHITE_WATER_OPAQUE.flowing)
            .add(ModFluids.GRAY_WATER_OPAQUE.still).add(ModFluids.GRAY_WATER_OPAQUE.flowing)
            .add(ModFluids.LIGHT_GRAY_WATER_OPAQUE.still).add(ModFluids.LIGHT_GRAY_WATER_OPAQUE.flowing)
            .add(ModFluids.RED_WATER_OPAQUE.still).add(ModFluids.RED_WATER_OPAQUE.flowing)
            .add(ModFluids.ORANGE_WATER_OPAQUE.still).add(ModFluids.ORANGE_WATER_OPAQUE.flowing)
            .add(ModFluids.YELLOW_WATER_OPAQUE.still).add(ModFluids.YELLOW_WATER_OPAQUE.flowing)
            .add(ModFluids.LIME_WATER_OPAQUE.still).add(ModFluids.LIME_WATER_OPAQUE.flowing)
            .add(ModFluids.GREEN_WATER_OPAQUE.still).add(ModFluids.GREEN_WATER_OPAQUE.flowing)
            .add(ModFluids.CYAN_WATER_OPAQUE.still).add(ModFluids.CYAN_WATER_OPAQUE.flowing)
            .add(ModFluids.LIGHT_BLUE_WATER_OPAQUE.still).add(ModFluids.LIGHT_BLUE_WATER_OPAQUE.flowing)
            .add(ModFluids.BLUE_WATER_OPAQUE.still).add(ModFluids.BLUE_WATER_OPAQUE.flowing)
            .add(ModFluids.PURPLE_WATER_OPAQUE.still).add(ModFluids.PURPLE_WATER_OPAQUE.flowing)
            .add(ModFluids.MAGENTA_WATER_OPAQUE.still).add(ModFluids.MAGENTA_WATER_OPAQUE.flowing)
            .add(ModFluids.PINK_WATER_OPAQUE.still).add(ModFluids.PINK_WATER_OPAQUE.flowing)
            .add(ModFluids.BROWN_WATER_OPAQUE.still).add(ModFluids.BROWN_WATER_OPAQUE.flowing)

            .add(ModFluids.BLACK_WATER_SHINING.still).add(ModFluids.BLACK_WATER_SHINING.flowing)
            .add(ModFluids.WHITE_WATER_SHINING.still).add(ModFluids.WHITE_WATER_SHINING.flowing)
            .add(ModFluids.GRAY_WATER_SHINING.still).add(ModFluids.GRAY_WATER_SHINING.flowing)
            .add(ModFluids.LIGHT_GRAY_WATER_SHINING.still).add(ModFluids.LIGHT_GRAY_WATER_SHINING.flowing)
            .add(ModFluids.RED_WATER_SHINING.still).add(ModFluids.RED_WATER_SHINING.flowing)
            .add(ModFluids.ORANGE_WATER_SHINING.still).add(ModFluids.ORANGE_WATER_SHINING.flowing)
            .add(ModFluids.YELLOW_WATER_SHINING.still).add(ModFluids.YELLOW_WATER_SHINING.flowing)
            .add(ModFluids.LIME_WATER_SHINING.still).add(ModFluids.LIME_WATER_SHINING.flowing)
            .add(ModFluids.GREEN_WATER_SHINING.still).add(ModFluids.GREEN_WATER_SHINING.flowing)
            .add(ModFluids.CYAN_WATER_SHINING.still).add(ModFluids.CYAN_WATER_SHINING.flowing)
            .add(ModFluids.LIGHT_BLUE_WATER_SHINING.still).add(ModFluids.LIGHT_BLUE_WATER_SHINING.flowing)
            .add(ModFluids.BLUE_WATER_SHINING.still).add(ModFluids.BLUE_WATER_SHINING.flowing)
            .add(ModFluids.PURPLE_WATER_SHINING.still).add(ModFluids.PURPLE_WATER_SHINING.flowing)
            .add(ModFluids.MAGENTA_WATER_SHINING.still).add(ModFluids.MAGENTA_WATER_SHINING.flowing)
            .add(ModFluids.PINK_WATER_SHINING.still).add(ModFluids.PINK_WATER_SHINING.flowing)
            .add(ModFluids.BROWN_WATER_SHINING.still).add(ModFluids.BROWN_WATER_SHINING.flowing)

            .add(ModFluids.BLACK_WATER_OPAQUE_SHINING.still).add(ModFluids.BLACK_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.WHITE_WATER_OPAQUE_SHINING.still).add(ModFluids.WHITE_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.GRAY_WATER_OPAQUE_SHINING.still).add(ModFluids.GRAY_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING.still).add(ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.RED_WATER_OPAQUE_SHINING.still).add(ModFluids.RED_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.ORANGE_WATER_OPAQUE_SHINING.still).add(ModFluids.ORANGE_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.YELLOW_WATER_OPAQUE_SHINING.still).add(ModFluids.YELLOW_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.LIME_WATER_OPAQUE_SHINING.still).add(ModFluids.LIME_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.GREEN_WATER_OPAQUE_SHINING.still).add(ModFluids.GREEN_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.CYAN_WATER_OPAQUE_SHINING.still).add(ModFluids.CYAN_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING.still).add(ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.BLUE_WATER_OPAQUE_SHINING.still).add(ModFluids.BLUE_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.PURPLE_WATER_OPAQUE_SHINING.still).add(ModFluids.PURPLE_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.MAGENTA_WATER_OPAQUE_SHINING.still).add(ModFluids.MAGENTA_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.PINK_WATER_OPAQUE_SHINING.still).add(ModFluids.PINK_WATER_OPAQUE_SHINING.flowing)
            .add(ModFluids.BROWN_WATER_OPAQUE_SHINING.still).add(ModFluids.BROWN_WATER_OPAQUE_SHINING.flowing)

            .add(ModFluids.WATER_SHINING.still).add(ModFluids.WATER_SHINING.flowing)
    }
}