package net.tonyngo.tutorialmod.block;

import com.jcraft.jorbis.Block;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.minecraft.block.Blocks;
import net.minecraft.registry.Registry;
import net.tonyngo.tutorialmod.Tutorialmod;
import net.tonyngo.tutorialmod.block.custom.TomatoCropBlock;
import net.minecraft.util.Identifier;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


public class ModBlocks {

    private static Object Regristries;
    public static final Block TOMATO_CROP = Registry.register(Regristries.BLOCK, new Identifier(Tutorialmod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

}
