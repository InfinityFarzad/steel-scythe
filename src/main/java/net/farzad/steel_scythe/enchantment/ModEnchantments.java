package net.farzad.steel_scythe.enchantment;

import net.farzad.steel_scythe.SteelScythe;
import net.minecraft.enchantment.Enchantment;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static Enchantment GRAPPLER = register("grappler", new GrapplerEnchantment());
    public static Enchantment DARKSTRIKE = register("darkstrike", new DarkStrikeEnchantment());


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(SteelScythe.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {

        SteelScythe.LOGGER.debug("Registering Enchantments for " + SteelScythe.MOD_ID);
    }
}