package net.tonyngo.tutorialmod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.tonyngo.tutorialmod.Tutorialmod;
import net.tonyngo.tutorialmod.block.custom.TomatoCropBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.block.Blocks;
import net.tonyngo.tutorialmod.item.custom.FabricItemSettings;

public class ModBlocks {
    public static final Block TOMATO_CROP = Registry.register(Registry.BLOCK, new Identifier(Tutorialmod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, Identifier.of(Tutorialmod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, Identifier.of(Tutorialmod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Tutorialmod.LOGGER.info("Registering ModBlocks for " + Tutorialmod.MOD_ID);
    }
}