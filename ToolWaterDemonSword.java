package com.Lulu.SummerMod.item.tool;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.phys.Vec3;

public class ToolWaterDemonSword extends SwordItem {


    public ToolWaterDemonSword() {
        super(SummerModTiers.SUMMER,50,5.0F,new Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant());
        this.setRegistryName("waterdemon_sword");


    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity enemy, LivingEntity attacker) {
        Vec3  vec3 = attacker.getLookAngle();
        enemy.setDeltaMovement(vec3.x * 1.5,1.5, vec3.z *2.5);
        return super.hurtEnemy(stack, enemy, attacker);

    }


}
