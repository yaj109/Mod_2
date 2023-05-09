package com.Lulu.SummerMod.item;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.item.Item;

public class ItemBlueIngot extends Item {
    public ItemBlueIngot() {
        super(new Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant());
        this.setRegistryName("blue_ingot");
    }
}
