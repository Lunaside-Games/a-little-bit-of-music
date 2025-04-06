package net.notaglitch.albom.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Portal;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.notaglitch.albom.ALittleBitOfMusic;
import net.minecraft.registry.Registry;
import net.notaglitch.albom.sound.ModSounds;

public class ModItems {
    // ALBOM OST 1
    public static final Item MUSIC_DISC_SPELUNK = registerItem("music_disc_spelunk",
            new Item(new Item.Settings().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.SPELUNK_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_RADIANCE = registerItem("music_disc_radiance",
            new Item(new Item.Settings().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.RADIANCE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_HOTEL = registerItem("music_disc_hotel",
            new Item(new Item.Settings().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.HOTEL_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_JADE = registerItem("music_disc_jade",
            new Item(new Item.Settings().rarity(Rarity.RARE).jukeboxPlayable(ModSounds.JADE_KEY).maxCount(1)));


    // ALBOM Creative Discs
    public static final Item MUSIC_DISC_RAINY = registerItem("music_disc_rainy",
            new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.RAINY_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_MYSTIQUE = registerItem("music_disc_mystique",
            new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.MYSTIQUE_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_GRAVEYARD = registerItem("music_disc_graveyard",
            new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.GRAVEYARD_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_CORAL = registerItem("music_disc_coral",
            new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.CORAL_KEY).maxCount(1)));
    public static final Item MUSIC_DISC_SNOWFALL = registerItem("music_disc_snowfall",
            new Item(new Item.Settings().rarity(Rarity.EPIC).jukeboxPlayable(ModSounds.SNOWFALL_KEY).maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ALittleBitOfMusic.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ALittleBitOfMusic.LOGGER.info("Registering Mod Items for " + ALittleBitOfMusic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(MUSIC_DISC_SPELUNK);
            entries.add(MUSIC_DISC_RADIANCE);
            entries.add(MUSIC_DISC_HOTEL);
            entries.add(MUSIC_DISC_JADE);
            entries.add(MUSIC_DISC_RAINY);
            entries.add(MUSIC_DISC_MYSTIQUE);
            entries.add(MUSIC_DISC_GRAVEYARD);
            entries.add(MUSIC_DISC_CORAL);
            entries.add(MUSIC_DISC_SNOWFALL);
        });
    }
}
