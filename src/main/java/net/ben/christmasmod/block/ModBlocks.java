package net.ben.christmasmod.block;

import net.ben.christmasmod.BensChristmasMod;
import net.ben.christmasmod.block.custom.*;
import net.minecraft.block.*;
//import net.minecraft.block.enums.Instrument;
//didnt have enough time to figure out how to make instruments work
//didnt have enough time to figure out how to make instruments work
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;




public class ModBlocks {
//THE BLOCKS

//    STOCKINGS

    public static final Block WHITE_STOCKING = registerBlock(
            "white_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "white_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block LIGHT_GRAY_STOCKING = registerBlock(
            "light_gray_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "light_gray_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block GRAY_STOCKING = registerBlock(
            "gray_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "gray_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block BLACK_STOCKING = registerBlock(
            "black_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "black_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block BROWN_STOCKING = registerBlock(
            "brown_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "brown_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block RED_STOCKING = registerBlock(
            "red_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "red_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block ORANGE_STOCKING = registerBlock(
            "orange_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "orange_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block YELLOW_STOCKING = registerBlock(
            "yellow_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "yellow_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block LIME_STOCKING = registerBlock(
            "lime_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "lime_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block GREEN_STOCKING = registerBlock(
            "green_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "green_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block CYAN_STOCKING = registerBlock(
            "cyan_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "cyan_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block LIGHT_BLUE_STOCKING = registerBlock(
            "light_blue_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "light_blue_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block BLUE_STOCKING = registerBlock(
            "blue_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "blue_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block PURPLE_STOCKING = registerBlock(
            "purple_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "purple_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block MAGENTA_STOCKING = registerBlock(
            "magenta_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "magenta_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block PINK_STOCKING = registerBlock(
            "pink_stocking",
            new StockingBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "pink_stocking")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));


// STRING LIGHTS

    public static final Block WHITE_STRING_LIGHTS = registerBlock(
            "white_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "white_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_STRING_LIGHTS = registerBlock(
            "light_gray_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "light_gray_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_STRING_LIGHTS = registerBlock(
            "gray_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "gray_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_STRING_LIGHTS = registerBlock(
            "black_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "black_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_STRING_LIGHTS = registerBlock(
            "brown_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "brown_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_STRING_LIGHTS = registerBlock(
            "red_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "red_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_STRING_LIGHTS = registerBlock(
            "orange_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "orange_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_STRING_LIGHTS = registerBlock(
            "yellow_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "yellow_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_STRING_LIGHTS = registerBlock(
            "lime_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "lime_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_STRING_LIGHTS = registerBlock(
            "green_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "green_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_STRING_LIGHTS = registerBlock(
            "cyan_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "cyan_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_STRING_LIGHTS = registerBlock(
            "light_blue_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "light_blue_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_STRING_LIGHTS = registerBlock(
            "blue_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "blue_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_STRING_LIGHTS = registerBlock(
            "purple_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "purple_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_STRING_LIGHTS = registerBlock(
            "magenta_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "magenta_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_STRING_LIGHTS = registerBlock(
            "pink_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "pink_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block RAINBOW_STRING_LIGHTS = registerBlock(
            "rainbow_string_lights",
            new StringLightBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "rainbow_string_lights")))
                    .strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

//  END OF STRING LIGHJTS

//    public static final Block YELLOW_FAIRY_LIGHTS = registerBlock(
//            "yellow_fairy_lights",
//            new FairyLightBlock(AbstractBlock.Settings.create().noCollision().strength(0.2F).sounds(BlockSoundGroup.CHAIN).luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GARLAND = registerBlock(
            "garland",
            new GarlandBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "garland")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()));


    public static final Block GARLAND_BOW = registerBlock(
            "garland_bow",
            new GarlandBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "garland_bow")))
                    .noCollision().strength(0.3F).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()));

    //didnt have enough time to figure out how to make instruments work
        public static final Block CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
                new PillarBlock(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "candy_cane_block")))
                        .mapColor(MapColor.TERRACOTTA_WHITE)/*.instrument(Instrument.BASEDRUM)*/.sounds(BlockSoundGroup.CALCITE).strength(0.5F)));

//    public static final Block CANDY_CANE_STAIRS = registerBlock("candy_cane_stairs",
//            new StairsBlock(ModBlocks.CANDY_CANE_STAIRS.getDefaultState(), AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.CALCITE).strength(0.5F)));

//    public static final Block CANDY_CANE_STAIRS = registerBlock(
//            "candy_cane_stairs",
//            new CandyCaneStairsBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_WHITE).sounds(BlockSoundGroup.CALCITE).strength(0.5F)));


    public static final Block PAVLOVA = registerBlock("pavlova",
            new PavlovaBlock(AbstractBlock.Settings.copy(Blocks.CAKE).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, "pavlova")))));


// END OF THE BLOCKS


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BensChristmasMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(BensChristmasMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BensChristmasMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        BensChristmasMod.LOGGER.info("Registering ModBlocks for " + BensChristmasMod.MOD_ID);
    }
}
