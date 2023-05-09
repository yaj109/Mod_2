package com.Lulu.SummerMod.regi;

import com.Lulu.SummerMod.item.*;
import com.Lulu.SummerMod.item.tool.ToolBlueCurtainPickaxe;
import com.Lulu.SummerMod.item.tool.ToolWaterDemonSword;
import com.Lulu.SummerMod.main.SummerMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@ObjectHolder(SummerMod.MOD_ID)
public class SummerModItems {

    public static final ItemBlueIngot BLUE_INGOT = new ItemBlueIngot();
    public static final ToolBlueCurtainPickaxe BLUECURTAIN_PICKAXE = new ToolBlueCurtainPickaxe();
    public static final ItemBlueHawaiiApple BLUEHAWAII_APPLE = new ItemBlueHawaiiApple();
    public static final ToolWaterDemonSword WATERDEMON_SWORD = new ToolWaterDemonSword();
    public static final ItemIceStick ICE_STICK= new ItemIceStick();
    public static final ItemMelon MELON = new ItemMelon();
    public static final ItemMineralwaterIngot MINERALWATER_INGOT = new ItemMineralwaterIngot();


    @Mod.EventBusSubscriber(modid = SummerMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class Register{

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event){

            final Item[] items = new Item[]{
                    BLUE_INGOT,
                    BLUECURTAIN_PICKAXE,
                    BLUEHAWAII_APPLE,
                    WATERDEMON_SWORD,
                    ICE_STICK,
                    MELON,
                    MINERALWATER_INGOT,
            };
            event.getRegistry().registerAll(items);
        }
    }
}
