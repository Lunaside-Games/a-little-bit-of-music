package net.notaglitch.albom.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.notaglitch.albom.ALittleBitOfMusic;
import net.minecraft.registry.Registry;

public class ModItems {
    public static final Item MUSIC_DISC_SPELUNK = registerItem("music_disc_spelunk", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfMusic.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ALittleBitOfMusic.LOGGER.info("Registering Mod Items for " + ALittleBitOfMusic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MUSIC_DISC_SPELUNK);
        });
    }
}
