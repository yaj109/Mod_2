package com.Lulu.SummerMod.item.tool;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Rarity;

public class ToolBlueCurtainPickaxe extends PickaxeItem {
    public ToolBlueCurtainPickaxe() {
        super(SummerModTiers.SUMMER,8,-8.0F, new Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant()
                .rarity(Rarity.EPIC));
        this.setRegistryName("bluecurtain_pickaxe");

    }


}
