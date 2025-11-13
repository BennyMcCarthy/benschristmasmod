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
                    .icon(() -> new ItemStack(ModItems.CANDY_CANE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.CANDY_CANE);
                        entries.add(ModItems.GINGERBREAD_MAN);
                        entries.add(ModBlocks.CANDY_CANE_BLOCK);
                        entries.add(ModBlocks.RED_STOCKING);
                        entries.add(ModBlocks.RAINBOW_STRING_LIGHTS);

                    }).build());


    public static void registerItemGroups() {
        BensChristmasMod.LOGGER.info("Registering Item Groups for " + BensChristmasMod.MOD_ID);
    }
}
