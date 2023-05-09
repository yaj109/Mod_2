package com.Lulu.SummerMod.block.ore;

import com.Lulu.SummerMod.regi.SummerModBlocks;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;

public class OreDeepslateWaterOre extends OreBlock {
    public OreDeepslateWaterOre(Properties p_153992_, UniformInt p_153993_) {
        super(Properties.copy(SummerModBlocks.WATER_ORE)
                .color(MaterialColor.COLOR_BLUE)
                .sound(SoundType.DEEPSLATE)
                .strength(4.5F,10000F),
                UniformInt.of(9,19));

        this.setRegistryName("deepslate_water_ore");
    }
}
