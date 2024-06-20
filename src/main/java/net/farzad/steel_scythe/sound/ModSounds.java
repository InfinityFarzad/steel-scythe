package net.farzad.steel_scythe.sound;

import net.farzad.steel_scythe.SteelScythe;

import net.minecraft.client.sound.Sound;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent SCYTHE_SHARPEN = registerSoundEvent("scythe_sharpen");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(SteelScythe.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerModSounds() {

        SteelScythe.LOGGER.debug("Registering Sounds for " + SteelScythe.MOD_ID);
    }


}