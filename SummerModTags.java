package com.Lulu.SummerMod.regi;

import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class SummerModTags {

    public static class Blocks{
       public static final Tags.IOptionalNamedTag<Block> NEEDS_BULECURTAIN_TOOL = tag("needs_bluecurtain_tool");
        private static final Tags.IOptionalNamedTag<Block> tag(String name){
            return BlockTags.createOptional(new ResourceLocation(SummerMod.MOD_ID,name));
        }
    }
    public static class Items{
        private static final Tags.IOptionalNamedTag<Item> tag(String name){

            return ItemTags.createOptional(new ResourceLocation(SummerMod.MOD_ID,name));
        }
    }

}
