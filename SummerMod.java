package com.Lulu.SummerMod.main;

import com.Lulu.SummerMod.block.ore.WaterOresSettings;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;

@Mod("summermod")
public class SummerMod {

    public static final String MOD_ID = "summermod";

    public static final CreativeModeTab SUMMERMOD_TAB = new SummerModTab();

    public SummerMod(){
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGHEST,WaterOresSettings::oreGen);
    }

}
