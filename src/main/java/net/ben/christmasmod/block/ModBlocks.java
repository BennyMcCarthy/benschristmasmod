package net.ben.christmasmod.block;

import net.ben.christmasmod.BensChristmasMod;
import net.ben.christmasmod.block.custom.FairyLightBlock;
import net.ben.christmasmod.block.custom.PavlovaBlock;
import net.ben.christmasmod.block.custom.StockingBlock;
import net.ben.christmasmod.block.custom.StringLightBlock;
import net.ben.christmasmod.block.custom.GarlandBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;




public class ModBlocks {
//THE BLOCKS

//    STOCKINGS

    public static final Block WHITE_STOCKING = registerBlock(
            "white_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block LIGHT_GRAY_STOCKING = registerBlock(
            "light_gray_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block GRAY_STOCKING = registerBlock(
            "gray_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block BLACK_STOCKING = registerBlock(
            "black_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block BROWN_STOCKING = registerBlock(
            "brown_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block RED_STOCKING = registerBlock(
            "red_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block ORANGE_STOCKING = registerBlock(
            "orange_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block YELLOW_STOCKING = registerBlock(
            "yellow_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block LIME_STOCKING = registerBlock(
            "lime_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block GREEN_STOCKING = registerBlock(
            "green_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block CYAN_STOCKING = registerBlock(
            "cyan_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block LIGHT_BLUE_STOCKING = registerBlock(
            "light_blue_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block BLUE_STOCKING = registerBlock(
            "blue_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block PURPLE_STOCKING = registerBlock(
            "purple_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block MAGENTA_STOCKING = registerBlock(
            "magenta_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));

    public static final Block PINK_STOCKING = registerBlock(
            "pink_stocking",
            new StockingBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.WOOL).nonOpaque()));


// STRING LIGHTS

    public static final Block WHITE_STRING_LIGHTS = registerBlock(
            "white_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_GRAY_STRING_LIGHTS = registerBlock(
            "light_gray_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRAY_STRING_LIGHTS = registerBlock(
            "gray_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLACK_STRING_LIGHTS = registerBlock(
            "black_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BROWN_STRING_LIGHTS = registerBlock(
            "brown_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block RED_STRING_LIGHTS = registerBlock(
            "red_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ORANGE_STRING_LIGHTS = registerBlock(
            "orange_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block YELLOW_STRING_LIGHTS = registerBlock(
            "yellow_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIME_STRING_LIGHTS = registerBlock(
            "lime_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GREEN_STRING_LIGHTS = registerBlock(
            "green_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block CYAN_STRING_LIGHTS = registerBlock(
            "cyan_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block LIGHT_BLUE_STRING_LIGHTS = registerBlock(
            "light_blue_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block BLUE_STRING_LIGHTS = registerBlock(
            "blue_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PURPLE_STRING_LIGHTS = registerBlock(
            "purple_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block MAGENTA_STRING_LIGHTS = registerBlock(
            "magenta_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PINK_STRING_LIGHTS = registerBlock(
            "pink_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block RAINBOW_STRING_LIGHTS = registerBlock(
            "rainbow_string_lights",
            new StringLightBlock(FabricBlockSettings.create().strength(0.2F).sounds(BlockSoundGroup.CHAIN).nonOpaque().luminance(state -> 4).emissiveLighting(Blocks::always).pistonBehavior(PistonBehavior.DESTROY)));

//  END OF STRING LIGHJTS

//    public static final Block YELLOW_FAIRY_LIGHTS = registerBlock(
//            "yellow_fairy_lights",
//            new FairyLightBlock(
//                    FabricBlockSettings.create()
//                            .noCollision()
//                            .strength(0.2F)
//                            .sounds(BlockSoundGroup.CHAIN)
//                            .luminance(state -> 4)
//                            .emissiveLighting(Blocks::always)
//                            .pistonBehavior(PistonBehavior.DESTROY)
//            )
//    );

    public static final Block GARLAND = registerBlock(
            "garland",
            new GarlandBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()));

    public static final Block GARLAND_BOW = registerBlock(
            "garland_bow",
            new GarlandBlock(FabricBlockSettings.create().noCollision().strength(0.3F).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque()));



        public static final Block CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
                new Block(FabricBlockSettings.create().mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BASEDRUM).sounds(BlockSoundGroup.CALCITE).strength(0.5F)));



    public static final Block PAVLOVA = registerBlock("pavlova",
            new PavlovaBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));


// END OF THE BLOCKS


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BensChristmasMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(BensChristmasMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        BensChristmasMod.LOGGER.info("Registering ModBlocks for " + BensChristmasMod.MOD_ID);
    }
}
