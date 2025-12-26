package com.magnariuk.colouredwater

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.server.recipe.RecipeExporter
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.recipe.book.RecipeCategory
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper
import net.minecraft.util.Identifier
import java.util.concurrent.CompletableFuture

class RecipeProvider(
    output: FabricDataOutput,
    registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>
): FabricRecipeProvider(output, registriesFuture) {
    override fun generate(exporter: RecipeExporter) {
        createWaterRecipe(exporter, ModFluids.BLACK_WATER.bucket, Items.BLACK_DYE)
        createWaterRecipe(exporter, ModFluids.YELLOW_WATER.bucket, Items.YELLOW_DYE)
        createWaterRecipe(exporter, ModFluids.WHITE_WATER.bucket, Items.WHITE_DYE)
        createWaterRecipe(exporter, ModFluids.ORANGE_WATER.bucket, Items.ORANGE_DYE)
        createWaterRecipe(exporter, ModFluids.MAGENTA_WATER.bucket, Items.MAGENTA_DYE)
        createWaterRecipe(exporter, ModFluids.LIGHT_BLUE_WATER.bucket, Items.LIGHT_BLUE_DYE)
        createWaterRecipe(exporter, ModFluids.LIME_WATER.bucket, Items.LIME_DYE)
        createWaterRecipe(exporter, ModFluids.PINK_WATER.bucket, Items.PINK_DYE)
        createWaterRecipe(exporter, ModFluids.GRAY_WATER.bucket, Items.GRAY_DYE)
        createWaterRecipe(exporter, ModFluids.LIGHT_GRAY_WATER.bucket, Items.LIGHT_GRAY_DYE)
        createWaterRecipe(exporter, ModFluids.CYAN_WATER.bucket, Items.CYAN_DYE)
        createWaterRecipe(exporter, ModFluids.PURPLE_WATER.bucket, Items.PURPLE_DYE)
        createWaterRecipe(exporter, ModFluids.BLUE_WATER.bucket, Items.BLUE_DYE)
        createWaterRecipe(exporter, ModFluids.BROWN_WATER.bucket, Items.BROWN_DYE)
        createWaterRecipe(exporter, ModFluids.GREEN_WATER.bucket, Items.GREEN_DYE)
        createWaterRecipe(exporter, ModFluids.RED_WATER.bucket, Items.RED_DYE)

        createOpaqueWaterRecipe(exporter, ModFluids.BLACK_WATER.bucket, ModFluids.BLACK_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.WHITE_WATER.bucket, ModFluids.WHITE_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.GRAY_WATER.bucket, ModFluids.GRAY_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.LIGHT_GRAY_WATER.bucket, ModFluids.LIGHT_GRAY_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.RED_WATER.bucket, ModFluids.RED_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.ORANGE_WATER.bucket, ModFluids.ORANGE_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.YELLOW_WATER.bucket, ModFluids.YELLOW_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.LIME_WATER.bucket, ModFluids.LIME_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.GREEN_WATER.bucket, ModFluids.GREEN_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.CYAN_WATER.bucket, ModFluids.CYAN_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.LIGHT_BLUE_WATER.bucket, ModFluids.LIGHT_BLUE_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.BLUE_WATER.bucket, ModFluids.BLUE_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.PURPLE_WATER.bucket, ModFluids.PURPLE_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.MAGENTA_WATER.bucket, ModFluids.MAGENTA_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.PINK_WATER.bucket, ModFluids.PINK_WATER_OPAQUE.bucket)
        createOpaqueWaterRecipe(exporter, ModFluids.BROWN_WATER.bucket, ModFluids.BROWN_WATER_OPAQUE.bucket)

        createShiningWaterRecipe(exporter, ModFluids.BLACK_WATER.bucket, ModFluids.BLACK_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.WHITE_WATER.bucket, ModFluids.WHITE_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.GRAY_WATER.bucket, ModFluids.GRAY_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.LIGHT_GRAY_WATER.bucket, ModFluids.LIGHT_GRAY_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.RED_WATER.bucket, ModFluids.RED_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.ORANGE_WATER.bucket, ModFluids.ORANGE_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.YELLOW_WATER.bucket, ModFluids.YELLOW_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.LIME_WATER.bucket, ModFluids.LIME_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.GREEN_WATER.bucket, ModFluids.GREEN_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.CYAN_WATER.bucket, ModFluids.CYAN_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.LIGHT_BLUE_WATER.bucket, ModFluids.LIGHT_BLUE_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.BLUE_WATER.bucket, ModFluids.BLUE_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.PURPLE_WATER.bucket, ModFluids.PURPLE_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.MAGENTA_WATER.bucket, ModFluids.MAGENTA_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.PINK_WATER.bucket, ModFluids.PINK_WATER_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.BROWN_WATER.bucket, ModFluids.BROWN_WATER_SHINING.bucket)

        createShiningWaterRecipe(exporter, ModFluids.BLACK_WATER_OPAQUE.bucket, ModFluids.BLACK_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.WHITE_WATER_OPAQUE.bucket, ModFluids.WHITE_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.GRAY_WATER_OPAQUE.bucket, ModFluids.GRAY_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.LIGHT_GRAY_WATER_OPAQUE.bucket, ModFluids.LIGHT_GRAY_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.RED_WATER_OPAQUE.bucket, ModFluids.RED_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.ORANGE_WATER_OPAQUE.bucket, ModFluids.ORANGE_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.YELLOW_WATER_OPAQUE.bucket, ModFluids.YELLOW_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.LIME_WATER_OPAQUE.bucket, ModFluids.LIME_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.GREEN_WATER_OPAQUE.bucket, ModFluids.GREEN_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.CYAN_WATER_OPAQUE.bucket, ModFluids.CYAN_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.LIGHT_BLUE_WATER_OPAQUE.bucket, ModFluids.LIGHT_BLUE_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.BLUE_WATER_OPAQUE.bucket, ModFluids.BLUE_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.PURPLE_WATER_OPAQUE.bucket, ModFluids.PURPLE_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.MAGENTA_WATER_OPAQUE.bucket, ModFluids.MAGENTA_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.PINK_WATER_OPAQUE.bucket, ModFluids.PINK_WATER_OPAQUE_SHINING.bucket)
        createShiningWaterRecipe(exporter, ModFluids.BROWN_WATER_OPAQUE.bucket, ModFluids.BROWN_WATER_OPAQUE_SHINING.bucket)

        createShiningWaterRecipe(exporter, Items.WATER_BUCKET, ModFluids.WATER_SHINING.bucket)
    }
    private fun createWaterRecipe(exporter: RecipeExporter, outputBucket: Item, dyeItem: Item) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputBucket)
            .input(Items.WATER_BUCKET)
            .input(dyeItem)
            .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
            .criterion(hasItem(dyeItem), conditionsFromItem(dyeItem))
            .offerTo(exporter)
    }

    private fun createShiningWaterRecipe(exporter: RecipeExporter, inputBucket: Item, outputBucket: Item) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputBucket)
            .input(inputBucket)
            .input(Items.GLOW_INK_SAC)
            .criterion(hasItem(inputBucket), conditionsFromItem(inputBucket))
            .criterion(hasItem(Items.GLOW_INK_SAC), conditionsFromItem(Items.GLOW_INK_SAC))
            .offerTo(exporter)
    }

    private fun createOpaqueWaterRecipe(exporter: RecipeExporter,inputBucket: Item, outputBucket: Item) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, outputBucket)
            .input(inputBucket)
            .input(Items.INK_SAC)
            .criterion(hasItem(inputBucket), conditionsFromItem(inputBucket))
            .criterion(hasItem(Items.INK_SAC), conditionsFromItem(Items.INK_SAC))
            .offerTo(exporter)

        val inputId = Registries.ITEM.getId(inputBucket)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, inputBucket)
            .input(outputBucket)
            .input(Items.BONE_MEAL)
            .criterion(hasItem(outputBucket), conditionsFromItem(outputBucket))
            .criterion(hasItem(Items.INK_SAC), conditionsFromItem(Items.INK_SAC))
            .offerTo(exporter, Identifier.of(inputId.namespace, inputId.path + "_from_opaque"))
    }

}