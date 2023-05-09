package com.Lulu.SummerMod.item;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.item.Item;

public class ItemIceStick extends Item {
    public ItemIceStick() {
        super(new Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant());
        this.setRegistryName("ice_stick");
    }
}
