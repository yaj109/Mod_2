package com.Lulu.SummerMod.regi;

import com.Lulu.SummerMod.block.BlockBlueBlock;
import com.Lulu.SummerMod.block.ore.OreWaterOre;
import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(SummerMod.MOD_ID)
public class SummerModBlocks {

    public static final BlockBlueBlock BLUE_BLOCK = new BlockBlueBlock();
    public static final OreWaterOre WATER_ORE = new OreWaterOre();

    @Mod.EventBusSubscriber(modid = SummerMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event){
            final Block[] blocks = new Block[]{
                    new BlockBlueBlock(),
                    new OreWaterOre()
            };

            event.getRegistry().registerAll(blocks);
        }


        @SubscribeEvent
        public static void registerBlockItem(final RegistryEvent.Register<Item> event){
            final BlockItem[] blockItems = {
                    new BlockItem(BLUE_BLOCK,new Item.Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant()),
                    new BlockItem(WATER_ORE,new Item.Properties().tab(SummerMod.SUMMERMOD_TAB).fireResistant())
            };
            for (BlockItem item : blockItems){
                 final Block block = item.getBlock();
                 final ResourceLocation registryName = block.getRegistryName();
                 event.getRegistry().register(item.setRegistryName(registryName));
            }
        }
    }
}
