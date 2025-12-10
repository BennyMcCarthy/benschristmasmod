package net.ben.christmasmod.item;

import net.ben.christmasmod.BensChristmasMod;
import net.ben.christmasmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CHRISTMAS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BensChristmasMod.MOD_ID, "christmas_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.christmas"))
                    .icon(() -> new ItemStack(ModItems.GINGERBREAD_MAN)).entries((displayContext, entries) -> {

                        entries.add(ModItems.RAW_GINGERBREAD_MAN);
                        entries.add(ModItems.GINGERBREAD_MAN);

                        entries.add(ModBlocks.PAVLOVA);

                        entries.add(ModItems.CANDY_CANE);
                        entries.add(ModBlocks.CANDY_CANE_BLOCK);

                        entries.add(ModBlocks.GARLAND);
                        entries.add(ModBlocks.GARLAND_BOW);

                        entries.add(ModBlocks.RAINBOW_STRING_LIGHTS);
                        entries.add(ModBlocks.WHITE_STRING_LIGHTS);
                        entries.add(ModBlocks.LIGHT_GRAY_STRING_LIGHTS);
                        entries.add(ModBlocks.GRAY_STRING_LIGHTS);
                        entries.add(ModBlocks.BLACK_STRING_LIGHTS);
                        entries.add(ModBlocks.BROWN_STRING_LIGHTS);
                        entries.add(ModBlocks.RED_STRING_LIGHTS);
                        entries.add(ModBlocks.ORANGE_STRING_LIGHTS);
                        entries.add(ModBlocks.YELLOW_STRING_LIGHTS);
                        entries.add(ModBlocks.LIME_STRING_LIGHTS);
                        entries.add(ModBlocks.GREEN_STRING_LIGHTS);
                        entries.add(ModBlocks.CYAN_STRING_LIGHTS);
                        entries.add(ModBlocks.LIGHT_BLUE_STRING_LIGHTS);
                        entries.add(ModBlocks.BLUE_STRING_LIGHTS);
                        entries.add(ModBlocks.PURPLE_STRING_LIGHTS);
                        entries.add(ModBlocks.MAGENTA_STRING_LIGHTS);
                        entries.add(ModBlocks.PINK_STRING_LIGHTS);


                        entries.add(ModBlocks.WHITE_STOCKING);
                        entries.add(ModBlocks.LIGHT_GRAY_STOCKING);
                        entries.add(ModBlocks.GRAY_STOCKING);
                        entries.add(ModBlocks.BLACK_STOCKING);
                        entries.add(ModBlocks.BROWN_STOCKING);
                        entries.add(ModBlocks.RED_STOCKING);
                        entries.add(ModBlocks.ORANGE_STOCKING);
                        entries.add(ModBlocks.YELLOW_STOCKING);
                        entries.add(ModBlocks.LIME_STOCKING);
                        entries.add(ModBlocks.GREEN_STOCKING);
                        entries.add(ModBlocks.CYAN_STOCKING);
                        entries.add(ModBlocks.LIGHT_BLUE_STOCKING);
                        entries.add(ModBlocks.BLUE_STOCKING);
                        entries.add(ModBlocks.PURPLE_STOCKING);
                        entries.add(ModBlocks.MAGENTA_STOCKING);
                        entries.add(ModBlocks.PINK_STOCKING);

                    }).build());


    public static void registerItemGroups() {
        BensChristmasMod.LOGGER.info("Registering Item Groups for " + BensChristmasMod.MOD_ID);
    }
}
