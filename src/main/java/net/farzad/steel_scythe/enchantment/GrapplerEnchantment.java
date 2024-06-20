package net.farzad.steel_scythe.enchantment;



import net.fabricmc.fabric.mixin.loot.LootTableAccessor;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.loot.LootTable;
import net.minecraft.util.math.Vec3d;


public class GrapplerEnchantment extends Enchantment {
    public GrapplerEnchantment() {
        super(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});

    }

    @Override
    public int getMinPower(int level) {
        return 5; // Adjust as needed
    }

    @Override
    public int getMaxLevel() {
        return 2; // Adjust as needed
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ((LivingEntity) target).takeKnockback(0.4,target.getX() - user.getX(), target.getZ() - user.getZ());

        }

        target.velocityModified=true;
        super.onTargetDamaged(user, target, level);

    }
  
}
