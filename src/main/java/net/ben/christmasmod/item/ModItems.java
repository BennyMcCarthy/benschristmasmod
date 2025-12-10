package net.ben.christmasmod.item;

import net.ben.christmasmod.BensChristmasMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //    HELOO !!! OVER HERE !!!!!!          THE ITEMS ...:
    public static final Item CANDY_CANE = registerItem("candy_cane", new Item(new FabricItemSettings().food(ModFoodComponents.CANDY_CANE)));
    public static final Item GINGERBREAD_MAN = registerItem("gingerbread_man", new Item(new FabricItemSettings().food(ModFoodComponents.GINGERBREAD_MAN)));
    public static final Item RAW_GINGERBREAD_MAN = registerItem("raw_gingerbread_man", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_GINGERBREAD_MAN)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BensChristmasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BensChristmasMod.LOGGER.info("Registering Mod Items for " + BensChristmasMod.MOD_ID);

    }
}
