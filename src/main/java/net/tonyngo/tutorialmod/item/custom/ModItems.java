package net.tonyngo.tutorialmod.item.custom;

//import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.tonyngo.tutorialmod.Tutorialmod;
import net.tonyngo.tutorialmod.block.ModBlocks;
//import net.tonyngo.tutorialmod.item.ModFoodComponents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    // Example placeholder for ModFoodComponents.TOMATO
    private static class ModFoodComponents {
        public static final FoodComponent TOMATO = new FoodComponent.Builder().snack().saturationModifier(0.6f).build();
    }

    public static final Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings().food(ModFoodComponents.TOMATO)));
    public static final Item COAL_BRIQUETTE = registerItem("coal_briquette", new Item(new FabricItemSettings()));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds", new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Tutorialmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Tutorialmod.LOGGER.info("Registering Mod Items for " + Tutorialmod.MOD_ID);
    }
}