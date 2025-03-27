package net.notaglitch.albom.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.notaglitch.albom.ALittleBitOfMusic;
import net.minecraft.registry.Registry;
import net.notaglitch.albom.sound.ModSounds;

public class ModItems {
    public static final Item MUSIC_DISC_SPELUNK = registerItem("music_disc_spelunk",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.SPELUNK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_RADIANCE = registerItem("music_disc_radiance",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.RADIANCE_KEY).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfMusic.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ALittleBitOfMusic.LOGGER.info("Registering Mod Items for " + ALittleBitOfMusic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(MUSIC_DISC_SPELUNK);
            entries.add(MUSIC_DISC_RADIANCE);
        });
    }
}
