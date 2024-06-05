package net.farzad.steel_scythe.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

public interface ScytheItemReach {
    void onEquipStack(ItemStack stack, LivingEntity user);

    void onUnequipStack(ItemStack stack, LivingEntity user);
}
