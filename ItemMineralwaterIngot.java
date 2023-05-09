package com.Lulu.SummerMod.item;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.item.Item;

public class ItemMineralwaterIngot extends Item {

    public ItemMineralwaterIngot() {
        super(new Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant());
        this.setRegistryName("mineralwater_ingot");
    }
}
