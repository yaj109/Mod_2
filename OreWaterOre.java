package com.Lulu.SummerMod.block.ore;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.material.Material;

public class OreWaterOre extends OreBlock {
    public OreWaterOre() {
        super(Properties.of(Material.STONE)
                        .strength(3.0F,12000F)
                        .requiresCorrectToolForDrops()
                        .lightLevel(value -> 15)
                , UniformInt.of(6,15));


        this.setRegistryName("water_ore");
    }
}
