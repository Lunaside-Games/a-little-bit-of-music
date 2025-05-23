package net.notaglitch.albom.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.notaglitch.albom.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MUSIC_DISC_SPELUNK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RADIANCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HOTEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JADE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_RAINY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_CORAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GRAVEYARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_SNOWFALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MYSTIQUE, Models.GENERATED);
    }
}
