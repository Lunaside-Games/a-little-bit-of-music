package net.notaglitch.albom.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.notaglitch.albom.ALittleBitOfMusic;

import java.util.function.Supplier;

public class ModItemGroups {
    public static final ItemGroup ABLOM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ALittleBitOfMusic.MOD_ID, "albom_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MUSIC_DISC_SPELUNK))
                    .displayName(Text.translatable("itemgroup.albom.items"))
                    .entries((displayContext, entries) -> {
                entries.add(ModItems.MUSIC_DISC_SPELUNK);
                entries.add(ModItems.MUSIC_DISC_RADIANCE);
                entries.add(ModItems.MUSIC_DISC_HOTEL);
                entries.add(ModItems.MUSIC_DISC_JADE);

            }).build());
    public static final ItemGroup ABLOE_DISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ALittleBitOfMusic.MOD_ID, "alboe_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MUSIC_DISC_RAINY))
                    .displayName(Text.translatable("itemgroup.albom.creativedisc"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSIC_DISC_RAINY);
                        entries.add(ModItems.MUSIC_DISC_MYSTIQUE);
                        entries.add(ModItems.MUSIC_DISC_GRAVEYARD);
                        entries.add(ModItems.MUSIC_DISC_CORAL);
                        entries.add(ModItems.MUSIC_DISC_SNOWFALL);

                    }).build());

    public static void registerItemGroups(){
        ALittleBitOfMusic.LOGGER.info("Registering Item Groups for " + ALittleBitOfMusic.MOD_ID);
    }
}
