package net.tonyngo.tutorialmod.item.custom;

import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.minecraft.item.Item;

public class FabricItemSettings extends Item.Settings {
    @Override
    public Item.Settings equipmentSlot(EquipmentSlotProvider equipmentSlotProvider) {
        return super.equipmentSlot(equipmentSlotProvider);
    }
}
