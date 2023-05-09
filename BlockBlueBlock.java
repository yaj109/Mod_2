package com.Lulu.SummerMod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockBlueBlock extends Block {
    public BlockBlueBlock() {
        super(Properties.of(Material.STONE)
                        .strength(5.0F,12000F)
                        .requiresCorrectToolForDrops()
                        .lightLevel(value -> 15)
                        .sound(SoundType.STONE));


        this.setRegistryName("blue_block");
    }
}
