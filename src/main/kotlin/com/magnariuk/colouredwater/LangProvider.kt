package com.magnariuk.colouredwater

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries
import net.minecraft.registry.RegistryWrapper
import java.util.concurrent.CompletableFuture

class LangProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<RegistryWrapper.WrapperLookup>)
    : FabricLanguageProvider(output, registriesFuture) {
    override fun generateTranslations(
        registryLookup: RegistryWrapper.WrapperLookup,
        translationBuilder: TranslationBuilder
    ) {
        Registries.ITEM.forEach { item ->
            val id = Registries.ITEM.getId(item)
            if (id.namespace == "colouredwater") {
                translationBuilder.add(item, formatName(id.path))
            }
        }

        Registries.BLOCK.forEach { block ->
            val id = Registries.BLOCK.getId(block)
            if (id.namespace == "colouredwater") {
                translationBuilder.add(block, formatName(id.path))
            }
        }
    }

    private fun formatName(path: String): String {
        return path.split("_")
            .joinToString(" ") { word -> word.replaceFirstChar { it.uppercase() } }
    }

}