package com.Lulu.SummerMod.item;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;


public class ItemBlueHawaiiApple extends Item {

    public ItemBlueHawaiiApple() {

        super(new Properties().tab(SummerMod.SUMMERMOD_TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(20)
                        .saturationMod(60)
                        .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 15),1F)
                        .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,6000,6),3F)
                        .effect(new MobEffectInstance(MobEffects.NIGHT_VISION,60000,4),1F)
                        .build()));
        this.setRegistryName("bluehawaii_apple");
    }
}
