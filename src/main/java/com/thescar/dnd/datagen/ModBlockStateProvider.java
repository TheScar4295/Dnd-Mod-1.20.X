package com.thescar.dnd.datagen;

import com.thescar.dnd.DnD;
import com.thescar.dnd.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DnD.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);

        horizontalBlock(ModBlocks.VASE.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/vase")));

        blockWithItem(ModBlocks.SHALE);
        wallBlock((WallBlock) ModBlocks.SHALE_WALL.get(), blockTexture(ModBlocks.SHALE.get()));
        stairsBlock((StairBlock) ModBlocks.SHALE_STAIRS.get(), blockTexture(ModBlocks.SHALE.get()));
        blockItem(ModBlocks.SHALE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.SHALE_SLAB.get()), blockTexture(ModBlocks.SHALE.get()), blockTexture(ModBlocks.SHALE.get()));
        blockItem(ModBlocks.SHALE_SLAB);
        blockWithItem(ModBlocks.POLISHED_SHALE);
        wallBlock((WallBlock) ModBlocks.POLISHED_SHALE_WALL.get(), blockTexture(ModBlocks.POLISHED_SHALE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_SHALE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_SHALE.get()));
        blockItem(ModBlocks.POLISHED_SHALE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.POLISHED_SHALE_SLAB.get()), blockTexture(ModBlocks.POLISHED_SHALE.get()), blockTexture(ModBlocks.POLISHED_SHALE.get()));
        blockItem(ModBlocks.POLISHED_SHALE_SLAB);
        blockWithItem(ModBlocks.SHALE_BRICKS);
        wallBlock((WallBlock) ModBlocks.SHALE_BRICK_WALL.get(), blockTexture(ModBlocks.SHALE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.SHALE_BRICK_STAIRS.get(), blockTexture(ModBlocks.SHALE_BRICKS.get()));
        blockItem(ModBlocks.SHALE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.SHALE_BRICK_SLAB.get()), blockTexture(ModBlocks.SHALE_BRICKS.get()), blockTexture(ModBlocks.SHALE_BRICKS.get()));
        blockItem(ModBlocks.SHALE_BRICK_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.SHALE_PILLAR.get(), new ResourceLocation(DnD.MOD_ID, "block/shale_pillar"),
                new ResourceLocation(DnD.MOD_ID, "block/shale_pillar_top"));
        blockItem(ModBlocks.SHALE_PILLAR);
        blockWithItem(ModBlocks.SHALE_SHINGLES);
        wallBlock((WallBlock) ModBlocks.SHALE_SHINGLE_WALL.get(), blockTexture(ModBlocks.SHALE_SHINGLES.get()));
        stairsBlock((StairBlock) ModBlocks.SHALE_SHINGLE_STAIRS.get(), blockTexture(ModBlocks.SHALE_SHINGLES.get()));
        blockItem(ModBlocks.SHALE_SHINGLE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.SHALE_SHINGLE_SLAB.get()), blockTexture(ModBlocks.SHALE_SHINGLES.get()), blockTexture(ModBlocks.SHALE_SHINGLES.get()));
        blockItem(ModBlocks.SHALE_SHINGLE_SLAB);
        blockWithItem(ModBlocks.SHALE_TILES);
        wallBlock((WallBlock) ModBlocks.SHALE_TILE_WALL.get(), blockTexture(ModBlocks.SHALE_TILES.get()));
        stairsBlock((StairBlock) ModBlocks.SHALE_TILE_STAIRS.get(), blockTexture(ModBlocks.SHALE_TILES.get()));
        blockItem(ModBlocks.SHALE_TILE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.SHALE_TILE_SLAB.get()), blockTexture(ModBlocks.SHALE_TILES.get()), blockTexture(ModBlocks.SHALE_TILES.get()));
        blockItem(ModBlocks.SHALE_TILE_SLAB);

        blockWithItem(ModBlocks.GREENSCHIST);
        wallBlock((WallBlock) ModBlocks.GREENSCHIST_WALL.get(), blockTexture(ModBlocks.GREENSCHIST.get()));
        stairsBlock((StairBlock) ModBlocks.GREENSCHIST_STAIRS.get(), blockTexture(ModBlocks.GREENSCHIST.get()));
        blockItem(ModBlocks.GREENSCHIST_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.GREENSCHIST_SLAB.get()), blockTexture(ModBlocks.GREENSCHIST.get()), blockTexture(ModBlocks.GREENSCHIST.get()));
        blockItem(ModBlocks.GREENSCHIST_SLAB);
        blockWithItem(ModBlocks.POLISHED_GREENSCHIST);
        wallBlock((WallBlock) ModBlocks.POLISHED_GREENSCHIST_WALL.get(), blockTexture(ModBlocks.POLISHED_GREENSCHIST.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_GREENSCHIST_STAIRS.get(), blockTexture(ModBlocks.POLISHED_GREENSCHIST.get()));
        blockItem(ModBlocks.POLISHED_GREENSCHIST_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.POLISHED_GREENSCHIST_SLAB.get()), blockTexture(ModBlocks.POLISHED_GREENSCHIST.get()), blockTexture(ModBlocks.POLISHED_GREENSCHIST.get()));
        blockItem(ModBlocks.POLISHED_GREENSCHIST_SLAB);
        blockWithItem(ModBlocks.GREENSCHIST_BRICKS);
        wallBlock((WallBlock) ModBlocks.GREENSCHIST_BRICK_WALL.get(), blockTexture(ModBlocks.GREENSCHIST_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.GREENSCHIST_BRICK_STAIRS.get(), blockTexture(ModBlocks.GREENSCHIST_BRICKS.get()));
        blockItem(ModBlocks.GREENSCHIST_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.GREENSCHIST_BRICK_SLAB.get()), blockTexture(ModBlocks.GREENSCHIST_BRICKS.get()), blockTexture(ModBlocks.GREENSCHIST_BRICKS.get()));
        blockItem(ModBlocks.GREENSCHIST_BRICK_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.GREENSCHIST_PILLAR.get(), new ResourceLocation(DnD.MOD_ID, "block/greenschist_pillar"),
                new ResourceLocation(DnD.MOD_ID, "block/greenschist_pillar_top"));
        blockItem(ModBlocks.GREENSCHIST_PILLAR);
        blockWithItem(ModBlocks.CHISELED_GREENSCHIST);
        blockWithItem(ModBlocks.ALGAL_GREENSCHIST_BRICKS);
        wallBlock((WallBlock) ModBlocks.ALGAL_GREENSCHIST_BRICK_WALL.get(), blockTexture(ModBlocks.ALGAL_GREENSCHIST_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.ALGAL_GREENSCHIST_BRICK_STAIRS.get(), blockTexture(ModBlocks.ALGAL_GREENSCHIST_BRICKS.get()));
        blockItem(ModBlocks.ALGAL_GREENSCHIST_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.ALGAL_GREENSCHIST_BRICK_SLAB.get()), blockTexture(ModBlocks.ALGAL_GREENSCHIST_BRICKS.get()), blockTexture(ModBlocks.ALGAL_GREENSCHIST_BRICKS.get()));
        blockItem(ModBlocks.ALGAL_GREENSCHIST_BRICK_SLAB);

        blockWithItem(ModBlocks.AGING_ADOBE);
        wallBlock((WallBlock) ModBlocks.AGING_ADOBE_WALL.get(), blockTexture(ModBlocks.AGING_ADOBE.get()));
        stairsBlock((StairBlock) ModBlocks.AGING_ADOBE_STAIRS.get(), blockTexture(ModBlocks.AGING_ADOBE.get()));
        blockItem(ModBlocks.AGING_ADOBE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.AGING_ADOBE_SLAB.get()), blockTexture(ModBlocks.AGING_ADOBE.get()), blockTexture(ModBlocks.AGING_ADOBE.get()));
        blockItem(ModBlocks.AGING_ADOBE_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.AGING_ADOBE_PILLAR.get(), new ResourceLocation(DnD.MOD_ID, "block/aging_adobe_pillar"),
                new ResourceLocation(DnD.MOD_ID, "block/aging_adobe_pillar_top"));
        blockItem(ModBlocks.AGING_ADOBE_PILLAR);
        blockWithItem(ModBlocks.CHISELED_AGING_ADOBE);
        blockWithItem(ModBlocks.CRACKED_AGING_ADOBE);
        wallBlock((WallBlock) ModBlocks.CRACKED_AGING_ADOBE_WALL.get(), blockTexture(ModBlocks.CRACKED_AGING_ADOBE.get()));
        stairsBlock((StairBlock) ModBlocks.CRACKED_AGING_ADOBE_STAIRS.get(), blockTexture(ModBlocks.CRACKED_AGING_ADOBE.get()));
        blockItem(ModBlocks.CRACKED_AGING_ADOBE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRACKED_AGING_ADOBE_SLAB.get()), blockTexture(ModBlocks.CRACKED_AGING_ADOBE.get()), blockTexture(ModBlocks.CRACKED_AGING_ADOBE.get()));
        blockItem(ModBlocks.CRACKED_AGING_ADOBE_SLAB);
        blockWithItem(ModBlocks.MOSSY_AGING_ADOBE);
        wallBlock((WallBlock) ModBlocks.MOSSY_AGING_ADOBE_WALL.get(), blockTexture(ModBlocks.MOSSY_AGING_ADOBE.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_AGING_ADOBE_STAIRS.get(), blockTexture(ModBlocks.MOSSY_AGING_ADOBE.get()));
        blockItem(ModBlocks.MOSSY_AGING_ADOBE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.MOSSY_AGING_ADOBE_SLAB.get()), blockTexture(ModBlocks.MOSSY_AGING_ADOBE.get()), blockTexture(ModBlocks.MOSSY_AGING_ADOBE.get()));
        blockItem(ModBlocks.MOSSY_AGING_ADOBE_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.PAINTED_AGING_ADOBE.get(), new ResourceLocation(DnD.MOD_ID, "block/painted_aging_adobe"),
                new ResourceLocation(DnD.MOD_ID, "block/painted_aging_adobe_top"));
        blockItem(ModBlocks.PAINTED_AGING_ADOBE);
        blockWithItem(ModBlocks.SANDY_AGING_ADOBE);
        wallBlock((WallBlock) ModBlocks.SANDY_AGING_ADOBE_WALL.get(), blockTexture(ModBlocks.SANDY_AGING_ADOBE.get()));
        stairsBlock((StairBlock) ModBlocks.SANDY_AGING_ADOBE_STAIRS.get(), blockTexture(ModBlocks.SANDY_AGING_ADOBE.get()));
        blockItem(ModBlocks.SANDY_AGING_ADOBE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.SANDY_AGING_ADOBE_SLAB.get()), blockTexture(ModBlocks.SANDY_AGING_ADOBE.get()), blockTexture(ModBlocks.SANDY_AGING_ADOBE.get()));
        blockItem(ModBlocks.SANDY_AGING_ADOBE_SLAB);

        blockWithItem(ModBlocks.RAW_IRONSTONE);
        wallBlock((WallBlock) ModBlocks.RAW_IRONSTONE_WALL.get(), blockTexture(ModBlocks.RAW_IRONSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.RAW_IRONSTONE_STAIRS.get(), blockTexture(ModBlocks.RAW_IRONSTONE.get()));
        blockItem(ModBlocks.RAW_IRONSTONE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.RAW_IRONSTONE_SLAB.get()), blockTexture(ModBlocks.RAW_IRONSTONE.get()), blockTexture(ModBlocks.RAW_IRONSTONE.get()));
        blockItem(ModBlocks.RAW_IRONSTONE_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.IRONSTONE_PILLAR.get(), new ResourceLocation(DnD.MOD_ID, "block/ironstone_pillar"),
                new ResourceLocation(DnD.MOD_ID, "block/ironstone_pillar_top"));
        blockItem(ModBlocks.IRONSTONE_PILLAR);
        blockWithItem(ModBlocks.POLISHED_IRONSTONE);
        wallBlock((WallBlock) ModBlocks.POLISHED_IRONSTONE_WALL.get(), blockTexture(ModBlocks.POLISHED_IRONSTONE.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_IRONSTONE_STAIRS.get(), blockTexture(ModBlocks.POLISHED_IRONSTONE.get()));
        blockItem(ModBlocks.POLISHED_IRONSTONE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.POLISHED_IRONSTONE_SLAB.get()), blockTexture(ModBlocks.POLISHED_IRONSTONE.get()), blockTexture(ModBlocks.POLISHED_IRONSTONE.get()));
        blockItem(ModBlocks.POLISHED_IRONSTONE_SLAB);
        blockWithItem(ModBlocks.IRONSTONE_BRICKS);
        wallBlock((WallBlock) ModBlocks.IRONSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.IRONSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.IRONSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.IRONSTONE_BRICKS.get()));
        blockItem(ModBlocks.IRONSTONE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.IRONSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.IRONSTONE_BRICKS.get()), blockTexture(ModBlocks.IRONSTONE_BRICKS.get()));
        blockItem(ModBlocks.IRONSTONE_BRICK_SLAB);
        blockWithItem(ModBlocks.MOSSY_IRONSTONE_BRICKS);
        wallBlock((WallBlock) ModBlocks.MOSSY_IRONSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.MOSSY_IRONSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.MOSSY_IRONSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.MOSSY_IRONSTONE_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_IRONSTONE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.MOSSY_IRONSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.MOSSY_IRONSTONE_BRICKS.get()), blockTexture(ModBlocks.MOSSY_IRONSTONE_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_IRONSTONE_BRICK_SLAB);
        blockWithItem(ModBlocks.CRACKED_IRONSTONE_BRICKS);
        wallBlock((WallBlock) ModBlocks.CRACKED_IRONSTONE_BRICK_WALL.get(), blockTexture(ModBlocks.CRACKED_IRONSTONE_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CRACKED_IRONSTONE_BRICK_STAIRS.get(), blockTexture(ModBlocks.CRACKED_IRONSTONE_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_IRONSTONE_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRACKED_IRONSTONE_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_IRONSTONE_BRICKS.get()), blockTexture(ModBlocks.CRACKED_IRONSTONE_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_IRONSTONE_BRICK_SLAB);
        blockWithItem(ModBlocks.CHISELED_IRONSTONE);
        blockWithItem(ModBlocks.IRONSTONE_TILES);
        wallBlock((WallBlock) ModBlocks.IRONSTONE_TILE_WALL.get(), blockTexture(ModBlocks.IRONSTONE_TILES.get()));
        stairsBlock((StairBlock) ModBlocks.IRONSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.IRONSTONE_TILES.get()));
        blockItem(ModBlocks.IRONSTONE_TILE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.IRONSTONE_TILE_SLAB.get()), blockTexture(ModBlocks.IRONSTONE_TILES.get()), blockTexture(ModBlocks.IRONSTONE_TILES.get()));
        blockItem(ModBlocks.IRONSTONE_TILE_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.IRONSTONE_BATTLEMENT.get(), new ResourceLocation(DnD.MOD_ID, "block/ironstone_battlement"),
                new ResourceLocation(DnD.MOD_ID, "block/ironstone_battlement_top"));
        blockItem(ModBlocks.IRONSTONE_BATTLEMENT);

        blockWithItem(ModBlocks.FORGED_BRICKS);
        wallBlock((WallBlock) ModBlocks.FORGED_BRICK_WALL.get(), blockTexture(ModBlocks.FORGED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.FORGED_BRICK_STAIRS.get(), blockTexture(ModBlocks.FORGED_BRICKS.get()));
        blockItem(ModBlocks.FORGED_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.FORGED_BRICK_SLAB.get()), blockTexture(ModBlocks.FORGED_BRICKS.get()), blockTexture(ModBlocks.FORGED_BRICKS.get()));
        blockItem(ModBlocks.FORGED_BRICK_SLAB);
        blockWithItem(ModBlocks.CRACKED_FORGED_BRICKS);
        wallBlock((WallBlock) ModBlocks.CRACKED_FORGED_BRICK_WALL.get(), blockTexture(ModBlocks.CRACKED_FORGED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CRACKED_FORGED_BRICK_STAIRS.get(), blockTexture(ModBlocks.CRACKED_FORGED_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_FORGED_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRACKED_FORGED_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_FORGED_BRICKS.get()), blockTexture(ModBlocks.CRACKED_FORGED_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_FORGED_BRICK_SLAB);
        blockWithItem(ModBlocks.LINED_FORGED_BRICKS);
        wallBlock((WallBlock) ModBlocks.LINED_FORGED_BRICK_WALL.get(), blockTexture(ModBlocks.LINED_FORGED_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LINED_FORGED_BRICK_STAIRS.get(), blockTexture(ModBlocks.LINED_FORGED_BRICKS.get()));
        blockItem(ModBlocks.LINED_FORGED_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.LINED_FORGED_BRICK_SLAB.get()), blockTexture(ModBlocks.LINED_FORGED_BRICKS.get()), blockTexture(ModBlocks.LINED_FORGED_BRICKS.get()));
        blockItem(ModBlocks.LINED_FORGED_BRICK_SLAB);
        axisBlock((RotatedPillarBlock) ModBlocks.FORGED_PILLAR.get(), new ResourceLocation(DnD.MOD_ID, "block/forged_pillar"),
                new ResourceLocation(DnD.MOD_ID, "block/forged_pillar_top"));
        blockItem(ModBlocks.FORGED_PILLAR);
        blockWithItem(ModBlocks.FORGED_TILES);
        wallBlock((WallBlock) ModBlocks.FORGED_TILE_WALL.get(), blockTexture(ModBlocks.FORGED_TILES.get()));
        stairsBlock((StairBlock) ModBlocks.FORGED_TILE_STAIRS.get(), blockTexture(ModBlocks.FORGED_TILES.get()));
        blockItem(ModBlocks.FORGED_TILE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.FORGED_TILE_SLAB.get()), blockTexture(ModBlocks.FORGED_TILES.get()), blockTexture(ModBlocks.FORGED_TILES.get()));
        blockItem(ModBlocks.FORGED_TILE_SLAB);

        blockWithItem(ModBlocks.LAVAROCK);
        wallBlock((WallBlock) ModBlocks.LAVAROCK_WALL.get(), blockTexture(ModBlocks.LAVAROCK.get()));
        stairsBlock((StairBlock) ModBlocks.LAVAROCK_STAIRS.get(), blockTexture(ModBlocks.LAVAROCK.get()));
        blockItem(ModBlocks.LAVAROCK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.LAVAROCK_SLAB.get()), blockTexture(ModBlocks.LAVAROCK.get()), blockTexture(ModBlocks.LAVAROCK.get()));
        blockItem(ModBlocks.LAVAROCK_SLAB);
        blockWithItem(ModBlocks.LAVAROCK_BRICKS);
        wallBlock((WallBlock) ModBlocks.LAVAROCK_BRICK_WALL.get(), blockTexture(ModBlocks.LAVAROCK_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.LAVAROCK_BRICK_STAIRS.get(), blockTexture(ModBlocks.LAVAROCK_BRICKS.get()));
        blockItem(ModBlocks.LAVAROCK_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.LAVAROCK_BRICK_SLAB.get()), blockTexture(ModBlocks.LAVAROCK_BRICKS.get()), blockTexture(ModBlocks.LAVAROCK_BRICKS.get()));
        blockItem(ModBlocks.LAVAROCK_BRICK_SLAB);
        blockWithItem(ModBlocks.CRACKED_LAVAROCK_BRICKS);
        wallBlock((WallBlock) ModBlocks.CRACKED_LAVAROCK_BRICK_WALL.get(), blockTexture(ModBlocks.CRACKED_LAVAROCK_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CRACKED_LAVAROCK_BRICK_STAIRS.get(), blockTexture(ModBlocks.CRACKED_LAVAROCK_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_LAVAROCK_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CRACKED_LAVAROCK_BRICK_SLAB.get()), blockTexture(ModBlocks.CRACKED_LAVAROCK_BRICKS.get()), blockTexture(ModBlocks.CRACKED_LAVAROCK_BRICKS.get()));
        blockItem(ModBlocks.CRACKED_LAVAROCK_BRICK_SLAB);
        blockWithItem(ModBlocks.CHARRED_LAVAROCK_BRICKS);
        wallBlock((WallBlock) ModBlocks.CHARRED_LAVAROCK_BRICK_WALL.get(), blockTexture(ModBlocks.CHARRED_LAVAROCK_BRICKS.get()));
        stairsBlock((StairBlock) ModBlocks.CHARRED_LAVAROCK_BRICK_STAIRS.get(), blockTexture(ModBlocks.CHARRED_LAVAROCK_BRICKS.get()));
        blockItem(ModBlocks.CHARRED_LAVAROCK_BRICK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.CHARRED_LAVAROCK_BRICK_SLAB.get()), blockTexture(ModBlocks.CHARRED_LAVAROCK_BRICKS.get()), blockTexture(ModBlocks.CHARRED_LAVAROCK_BRICKS.get()));
        blockItem(ModBlocks.CHARRED_LAVAROCK_BRICK_SLAB);
        blockWithItem(ModBlocks.POLISHED_LAVAROCK);
        wallBlock((WallBlock) ModBlocks.POLISHED_LAVAROCK_WALL.get(), blockTexture(ModBlocks.POLISHED_LAVAROCK.get()));
        stairsBlock((StairBlock) ModBlocks.POLISHED_LAVAROCK_STAIRS.get(), blockTexture(ModBlocks.POLISHED_LAVAROCK.get()));
        blockItem(ModBlocks.POLISHED_LAVAROCK_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.POLISHED_LAVAROCK_SLAB.get()), blockTexture(ModBlocks.POLISHED_LAVAROCK.get()), blockTexture(ModBlocks.POLISHED_LAVAROCK.get()));
        blockItem(ModBlocks.POLISHED_LAVAROCK_SLAB);
        blockWithItem(ModBlocks.CHISELED_LAVAROCK);
        axisBlock((RotatedPillarBlock) ModBlocks.LAVAROCK_PILLAR.get(), new ResourceLocation(DnD.MOD_ID, "block/lavarock_pillar"),
                new ResourceLocation(DnD.MOD_ID, "block/lavarock_pillar_top"));
        blockItem(ModBlocks.LAVAROCK_PILLAR);

        blockWithItem(ModBlocks.SHINGLES);
        wallBlock((WallBlock) ModBlocks.SHINGLE_WALL.get(), blockTexture(ModBlocks.SHINGLES.get()));
        stairsBlock((StairBlock) ModBlocks.SHINGLE_STAIRS.get(), blockTexture(ModBlocks.SHINGLES.get()));
        blockItem(ModBlocks.SHINGLE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.SHINGLE_SLAB.get()), blockTexture(ModBlocks.SHINGLES.get()), blockTexture(ModBlocks.SHINGLES.get()));
        blockItem(ModBlocks.SHINGLE_SLAB);
        blockWithItem(ModBlocks.RUINED_SHINGLES);
        wallBlock((WallBlock) ModBlocks.RUINED_SHINGLE_WALL.get(), blockTexture(ModBlocks.RUINED_SHINGLES.get()));
        stairsBlock((StairBlock) ModBlocks.RUINED_SHINGLE_STAIRS.get(), blockTexture(ModBlocks.RUINED_SHINGLES.get()));
        blockItem(ModBlocks.RUINED_SHINGLE_STAIRS);
        slabBlock(((SlabBlock) ModBlocks.RUINED_SHINGLE_SLAB.get()), blockTexture(ModBlocks.RUINED_SHINGLES.get()), blockTexture(ModBlocks.RUINED_SHINGLES.get()));
        blockItem(ModBlocks.RUINED_SHINGLE_SLAB);
        blockWithItem(ModBlocks.RUBBLE);
        blockWithItem(ModBlocks.CHUNKY_RUBBLE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("dnd:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("dnd:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}