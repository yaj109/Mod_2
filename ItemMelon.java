package com.Lulu.SummerMod.item;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;


public class ItemMelon extends Item {

    public ItemMelon() {

        super(new Properties().tab(SummerMod.SUMMERMOD_TAB)
                .food(new FoodProperties.Builder()
                        .nutrition(20)
                        .saturationMod(60)
                        .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2300, 4),1F)
                        .effect(new MobEffectInstance(MobEffects.WATER_BREATHING,5000,4),1F)
                        .build()));
        this.setRegistryName("melon");
    }
}

