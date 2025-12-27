package net.ben.christmasmod.item;

import net.ben.christmasmod.BensChristmasMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    //    HELOO !!! OVER HERE !!!!!!          THE ITEMS ...:
    public static final Item CANDY_CANE = registerItem(
            "candy_cane",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BensChristmasMod.MOD_ID, "candy_cane")))
                    .food(ModFoodComponents.CANDY_CANE, ModFoodComponents.CANDY_CANE_C))
    );
    public static final Item GINGERBREAD_MAN = registerItem(
            "gingerbread_man",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BensChristmasMod.MOD_ID, "gingerbread_man")))
                    .food(ModFoodComponents.GINGERBREAD_MAN))
    );
    public static final Item RAW_GINGERBREAD_MAN = registerItem(
            "raw_gingerbread_man",
            new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BensChristmasMod.MOD_ID, "raw_gingerbread_man")))
                    .food(ModFoodComponents.RAW_GINGERBREAD_MAN, ModFoodComponents.RAW_GINGERBREAD_MAN_C))
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BensChristmasMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BensChristmasMod.LOGGER.info("Registering Mod Items for " + BensChristmasMod.MOD_ID);

    }
}
