package com.magnariuk.colouredwater.client

import com.magnariuk.colouredwater.LangProvider
import com.magnariuk.colouredwater.ModelProvider
import com.magnariuk.colouredwater.RecipeProvider
import com.magnariuk.colouredwater.TagProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class ColouredwaterDataGenerator : DataGeneratorEntrypoint {

    override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
        val pack = fabricDataGenerator.createPack()
        pack.addProvider(::TagProvider)
        pack.addProvider(::RecipeProvider)
        pack.addProvider(::ModelProvider)
        pack.addProvider(::LangProvider)
    }
}
