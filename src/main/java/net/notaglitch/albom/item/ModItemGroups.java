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

            }).build());

    public static void registerItemGroups(){
        ALittleBitOfMusic.LOGGER.info("Registering Item Groups for " + ALittleBitOfMusic.MOD_ID);
    }
}
