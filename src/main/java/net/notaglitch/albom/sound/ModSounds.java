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
    public static final RegistryKey<JukeboxSong> RADIANCE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(ALittleBitOfMusic.MOD_ID, "radiance"));



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(ALittleBitOfMusic.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        ALittleBitOfMusic.LOGGER.info("Registering Mod Sounds for " + ALittleBitOfMusic.MOD_ID);
    }
}
