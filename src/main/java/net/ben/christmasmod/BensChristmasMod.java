package net.ben.christmasmod;

import net.ben.christmasmod.block.ModBlocks;
import net.ben.christmasmod.item.ModItemGroups;
import net.ben.christmasmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BensChristmasMod implements ModInitializer {
	public static final String MOD_ID = "benschristmasmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}
