package net.farzad.steel_scythe.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.farzad.steel_scythe.SteelScythe;
import net.farzad.steel_scythe.item.custom.ModToolMaterial;

import net.farzad.steel_scythe.item.custom.ScytheItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SCYTHE = RegisterItem("scythe",
            new ScytheItem(ModToolMaterial.STEEL_INGOT,-3,5,2.4,new FabricItemSettings()));
    public static final Item[] bigItems = {SCYTHE};
    //bigitems is just a list name and is used to change the items model in inventory
    // but doss not change its size handheld that is done in its json file.
    public static final Item STEEL_INGOT = RegisterItem("steel_ingot", new Item(new FabricItemSettings()));

    private static Item RegisterItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SteelScythe.MOD_ID, name), item);
    }

    public static void registerModItems () {
        SteelScythe.LOGGER.debug("Registering Mod Items for " + SteelScythe.MOD_ID);

    }


}
