package com.Lulu.SummerMod.main;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class SummerModTab extends CreativeModeTab {
    public SummerModTab() {
        super("summermod_tab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.WATER_BUCKET);
    }
}
