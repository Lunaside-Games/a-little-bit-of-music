package net.notaglitch.albom.sound;


import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.notaglitch.albom.ALittleBitOfMusic;

public class ModSounds {
    public static final SoundEvent SPELUNK = registerSoundEvent("spelunk");
    public static final RegistryKey<JukeboxSong> SPELUNK_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "spelunk"));
    public static final SoundEvent RADIANCE = registerSoundEvent("radiance");
    public static final RegistryKey<JukeboxSong> RADIANCE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "radiance"));
    public static final RegistryKey<JukeboxSong> HOTEL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "hotel"));
    public static final RegistryKey<JukeboxSong> JADE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "jade" ));


    // Creative Discs
    public static final RegistryKey<JukeboxSong> RAINY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "rainy" ));
    public static final RegistryKey<JukeboxSong> GRAVEYARD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "graveyard" ));
    public static final RegistryKey<JukeboxSong> MYSTIQUE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "mystique" ));
    public static final RegistryKey<JukeboxSong> CORAL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "coral" ));
    public static final RegistryKey<JukeboxSong> SNOWFALL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "snowfall" ));



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(ALittleBitOfMusic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        ALittleBitOfMusic.LOGGER.info("Registering Mod Sounds for " + ALittleBitOfMusic.MOD_ID);
    }
}
