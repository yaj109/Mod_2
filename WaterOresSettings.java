package com.Lulu.SummerMod.block.ore;

import com.Lulu.SummerMod.regi.SummerModBlocks;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class WaterOresSettings {
    public static final List<OreConfiguration.TargetBlockState> ORE_SUMMER_TARGET_LIST = List.of(OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                    SummerModBlocks.WATER_ORE.defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,SummerModBlocks.WATER_ORE.defaultBlockState()));


    public static final ConfiguredFeature<?,?> ORE_SUMMER_CONFIG = Feature.ORE.configured(new OreConfiguration(ORE_SUMMER_TARGET_LIST,8,1.0F));

    public static final PlacedFeature ORE_SUMMER = ORE_SUMMER_CONFIG.placed(commonOrePlacement(10,HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-105),VerticalAnchor.aboveBottom(105))));

    public static void oreGen(final BiomeLoadingEvent event){
        switch (event.getCategory()){
            default -> throw new IllegalStateException("Unexpected value:" + event.getCategory());
            case OCEAN, UNDERGROUND -> addGenerateOres(event.getGeneration(),ORE_SUMMER);

        }
    }

    private static void addGenerateOres(BiomeGenerationSettingsBuilder builder, PlacedFeature feature){
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES,feature);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(count), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int count, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(count), p_195351_);
    }
}

