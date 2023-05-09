package com.Lulu.SummerMod.item.tool;

import com.Lulu.SummerMod.main.SummerMod;
import com.Lulu.SummerMod.regi.SummerModBlocks;
import com.Lulu.SummerMod.regi.SummerModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;
import java.util.Objects;

public class SummerModTiers {

    public static final ForgeTier SUMMER = new ForgeTier(6,2700,10.0F,5.0F,100,SummerModTags.Blocks.NEEDS_BULECURTAIN_TOOL, ()-> Ingredient.of(SummerModBlocks.BLUE_BLOCK));

    static {
        TierSortingRegistry.registerTier(SUMMER, new ResourceLocation(SummerMod.MOD_ID,"summer"),
                List.of(Objects.requireNonNull(TierSortingRegistry.getName(Tiers.DIAMOND))),List.of());
    }
}
