package net.farzad.steel_scythe;

import net.fabricmc.api.ModInitializer;

import net.farzad.steel_scythe.enchantment.ModEnchantments;
import net.farzad.steel_scythe.item.ModItems;
import net.farzad.steel_scythe.sound.ModSounds;
import net.farzad.steel_scythe.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteelScythe implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final String MOD_ID = "steel_scythe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEnchantments.registerModEnchantments();
		ModSounds.registerModSounds();
		ModLootTableModifiers.modifyLootTables();


		LOGGER.info("Hello Fabric world!");
	}
}
