package net.tonyngo.tutorialmod.item.custom;

import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.tonyngo.tutorialmod.Tutorialmod;
import net.tonyngo.tutorialmod.block.ModBlocks;

public class ModItems {

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Tutorialmod.MOD_ID, name), item);
    }

}
