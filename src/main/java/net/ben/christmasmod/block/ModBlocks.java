package net.ben.christmasmod.block;

import net.ben.christmasmod.BensChristmasMod;
import net.ben.christmasmod.block.custom.RedStockingBlock;
import net.ben.christmasmod.block.custom.StringLightBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

//THE BLOCKS
public class ModBlocks {
    public static final Block CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));

    public static final Block RED_STOCKING = registerBlock(
            "red_stocking",
            new RedStockingBlock(
                    FabricBlockSettings.create()
                            .mapColor(MapColor.RED)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup. WOOL)
                            .nonOpaque()
            )
    );

    public static final Block RAINBOW_STRING_LIGHTS = registerBlock(
            "rainbow_string_lights",
            new StringLightBlock(
                    FabricBlockSettings.create()
                            .mapColor(MapColor.IRON_GRAY)
                            .strength(0.2F)
                            .sounds(BlockSoundGroup. LANTERN)
                            .nonOpaque()
            )
    );






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
