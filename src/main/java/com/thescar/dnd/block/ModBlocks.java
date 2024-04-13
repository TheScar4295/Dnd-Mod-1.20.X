package com.thescar.dnd.block;

import com.thescar.dnd.DnD;
import com.thescar.dnd.block.custom.VaseBlock;
import com.thescar.dnd.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DnD.MOD_ID);

    public static final RegistryObject<Block> RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RAW_IRON_BLOCK)));

    public static final RegistryObject<Block> VASE = registerBlock("vase",
            () -> new VaseBlock(BlockBehaviour.Properties.copy(Blocks.DECORATED_POT).noOcclusion()));

    public static final RegistryObject<Block> SHALE = registerBlock("shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SHALE_WALL = registerBlock("shale_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SHALE_STAIRS = registerBlock("shale_stairs",
            () -> new StairBlock(() -> ModBlocks.SHALE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_SLAB = registerBlock("shale_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SHALE = registerBlock("polished_shale",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_SHALE_WALL = registerBlock("polished_shale_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> POLISHED_SHALE_STAIRS = registerBlock("polished_shale_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_SHALE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_SHALE_SLAB = registerBlock("polished_shale_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BRICKS = registerBlock("shale_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SHALE_BRICK_WALL = registerBlock("shale_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SHALE_BRICK_STAIRS = registerBlock("shale_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.SHALE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_BRICK_SLAB = registerBlock("shale_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_PILLAR = registerBlock("shale_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SHALE_SHINGLES = registerBlock("shale_shingles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SHALE_SHINGLE_WALL = registerBlock("shale_shingle_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SHALE_SHINGLE_STAIRS = registerBlock("shale_shingle_stairs",
            () -> new StairBlock(() -> ModBlocks.SHALE_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_SHINGLE_SLAB = registerBlock("shale_shingle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_TILES = registerBlock("shale_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SHALE_TILE_WALL = registerBlock("shale_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SHALE_TILE_STAIRS = registerBlock("shale_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.SHALE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHALE_TILE_SLAB = registerBlock("shale_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREENSCHIST = registerBlock("greenschist",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> GREENSCHIST_WALL = registerBlock("greenschist_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> GREENSCHIST_STAIRS = registerBlock("greenschist_stairs",
            () -> new StairBlock(() -> ModBlocks.GREENSCHIST.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREENSCHIST_SLAB = registerBlock("greenschist_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_GREENSCHIST = registerBlock("polished_greenschist",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_GREENSCHIST_WALL = registerBlock("polished_greenschist_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> POLISHED_GREENSCHIST_STAIRS = registerBlock("polished_greenschist_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GREENSCHIST.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_GREENSCHIST_SLAB = registerBlock("polished_greenschist_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREENSCHIST_BRICKS = registerBlock("greenschist_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GREENSCHIST_BRICK_WALL = registerBlock("greenschist_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> GREENSCHIST_BRICK_STAIRS = registerBlock("greenschist_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.GREENSCHIST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREENSCHIST_BRICK_SLAB = registerBlock("greenschist_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREENSCHIST_PILLAR = registerBlock("greenschist_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_GREENSCHIST = registerBlock("chiseled_greenschist",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> ALGAL_GREENSCHIST_BRICKS = registerBlock("algal_greenschist_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> ALGAL_GREENSCHIST_BRICK_WALL = registerBlock("algal_greenschist_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> ALGAL_GREENSCHIST_BRICK_STAIRS = registerBlock("algal_greenschist_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.ALGAL_GREENSCHIST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ALGAL_GREENSCHIST_BRICK_SLAB = registerBlock("algal_greenschist_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> AGING_ADOBE = registerBlock("aging_adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> AGING_ADOBE_WALL = registerBlock("aging_adobe_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> AGING_ADOBE_STAIRS = registerBlock("aging_adobe_stairs",
            () -> new StairBlock(() -> ModBlocks.AGING_ADOBE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AGING_ADOBE_SLAB = registerBlock("aging_adobe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> AGING_ADOBE_PILLAR = registerBlock("aging_adobe_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHISELED_AGING_ADOBE = registerBlock("chiseled_aging_adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_AGING_ADOBE = registerBlock("cracked_aging_adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_AGING_ADOBE_WALL = registerBlock("cracked_aging_adobe_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CRACKED_AGING_ADOBE_STAIRS = registerBlock("cracked_aging_adobe_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_AGING_ADOBE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_AGING_ADOBE_SLAB = registerBlock("cracked_aging_adobe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_AGING_ADOBE = registerBlock("mossy_aging_adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> MOSSY_AGING_ADOBE_WALL = registerBlock("mossy_aging_adobe_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> MOSSY_AGING_ADOBE_STAIRS = registerBlock("mossy_aging_adobe_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_AGING_ADOBE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_AGING_ADOBE_SLAB = registerBlock("mossy_aging_adobe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PAINTED_AGING_ADOBE = registerBlock("painted_aging_adobe",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SANDY_AGING_ADOBE = registerBlock("sandy_aging_adobe",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> SANDY_AGING_ADOBE_WALL = registerBlock("sandy_aging_adobe_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SANDY_AGING_ADOBE_STAIRS = registerBlock("sandy_aging_adobe_stairs",
            () -> new StairBlock(() -> ModBlocks.SANDY_AGING_ADOBE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SANDY_AGING_ADOBE_SLAB = registerBlock("sandy_aging_adobe_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> RAW_IRONSTONE = registerBlock("raw_ironstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> RAW_IRONSTONE_WALL = registerBlock("raw_ironstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> RAW_IRONSTONE_STAIRS = registerBlock("raw_ironstone_stairs",
            () -> new StairBlock(() -> ModBlocks.RAW_IRONSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RAW_IRONSTONE_SLAB = registerBlock("raw_ironstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE_PILLAR = registerBlock("ironstone_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> POLISHED_IRONSTONE = registerBlock("polished_ironstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_IRONSTONE_WALL = registerBlock("polished_ironstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> POLISHED_IRONSTONE_STAIRS = registerBlock("polished_ironstone_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_IRONSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_IRONSTONE_SLAB = registerBlock("polished_ironstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE_BRICKS = registerBlock("ironstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> IRONSTONE_BRICK_WALL = registerBlock("ironstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> IRONSTONE_BRICK_STAIRS = registerBlock("ironstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.IRONSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE_BRICK_SLAB = registerBlock("ironstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_IRONSTONE_BRICKS = registerBlock("mossy_ironstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> MOSSY_IRONSTONE_BRICK_WALL = registerBlock("mossy_ironstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> MOSSY_IRONSTONE_BRICK_STAIRS = registerBlock("mossy_ironstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_IRONSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MOSSY_IRONSTONE_BRICK_SLAB = registerBlock("mossy_ironstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_IRONSTONE_BRICKS = registerBlock("cracked_ironstone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_IRONSTONE_BRICK_WALL = registerBlock("cracked_ironstone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CRACKED_IRONSTONE_BRICK_STAIRS = registerBlock("cracked_ironstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_IRONSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_IRONSTONE_BRICK_SLAB = registerBlock("cracked_ironstone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_IRONSTONE = registerBlock("chiseled_ironstone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> IRONSTONE_TILES = registerBlock("ironstone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> IRONSTONE_TILE_WALL = registerBlock("ironstone_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> IRONSTONE_TILE_STAIRS = registerBlock("ironstone_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.IRONSTONE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE_TILE_SLAB = registerBlock("ironstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> IRONSTONE_BATTLEMENT = registerBlock("ironstone_battlement",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final RegistryObject<Block> FORGED_BRICKS = registerBlock("forged_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FORGED_BRICK_WALL = registerBlock("forged_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> FORGED_BRICK_STAIRS = registerBlock("forged_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.FORGED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FORGED_BRICK_SLAB = registerBlock("forged_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_FORGED_BRICKS = registerBlock("cracked_forged_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_FORGED_BRICK_WALL = registerBlock("cracked_forged_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CRACKED_FORGED_BRICK_STAIRS = registerBlock("cracked_forged_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_FORGED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_FORGED_BRICK_SLAB = registerBlock("cracked_forged_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LINED_FORGED_BRICKS = registerBlock("lined_forged_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LINED_FORGED_BRICK_WALL = registerBlock("lined_forged_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> LINED_FORGED_BRICK_STAIRS = registerBlock("lined_forged_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LINED_FORGED_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LINED_FORGED_BRICK_SLAB = registerBlock("lined_forged_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FORGED_PILLAR = registerBlock("forged_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> FORGED_TILES = registerBlock("forged_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> FORGED_TILE_WALL = registerBlock("forged_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> FORGED_TILE_STAIRS = registerBlock("forged_tile_stairs",
            () -> new StairBlock(() -> ModBlocks.FORGED_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> FORGED_TILE_SLAB = registerBlock("forged_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> LAVAROCK = registerBlock("lavarock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LAVAROCK_WALL = registerBlock("lavarock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> LAVAROCK_STAIRS = registerBlock("lavarock_stairs",
            () -> new StairBlock(() -> ModBlocks.LAVAROCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAVAROCK_SLAB = registerBlock("lavarock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAVAROCK_BRICKS = registerBlock("lavarock_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LAVAROCK_BRICK_WALL = registerBlock("lavarock_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> LAVAROCK_BRICK_STAIRS = registerBlock("lavarock_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LAVAROCK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LAVAROCK_BRICK_SLAB = registerBlock("lavarock_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_LAVAROCK_BRICKS = registerBlock("cracked_lavarock_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CRACKED_LAVAROCK_BRICK_WALL = registerBlock("cracked_lavarock_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CRACKED_LAVAROCK_BRICK_STAIRS = registerBlock("cracked_lavarock_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CRACKED_LAVAROCK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CRACKED_LAVAROCK_BRICK_SLAB = registerBlock("cracked_lavarock_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARRED_LAVAROCK_BRICKS = registerBlock("charred_lavarock_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> CHARRED_LAVAROCK_BRICK_WALL = registerBlock("charred_lavarock_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> CHARRED_LAVAROCK_BRICK_STAIRS = registerBlock("charred_lavarock_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.CHARRED_LAVAROCK_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHARRED_LAVAROCK_BRICK_SLAB = registerBlock("charred_lavarock_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_LAVAROCK = registerBlock("polished_lavarock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> POLISHED_LAVAROCK_WALL = registerBlock("polished_lavarock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> POLISHED_LAVAROCK_STAIRS = registerBlock("polished_lavarock_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_LAVAROCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> POLISHED_LAVAROCK_SLAB = registerBlock("polished_lavarock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> CHISELED_LAVAROCK = registerBlock("chiseled_lavarock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> LAVAROCK_PILLAR = registerBlock("lavarock_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final RegistryObject<Block> RUBBLE = registerBlock("rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> CHUNKY_RUBBLE = registerBlock("chunky_rubble",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIRT)));

    public static final RegistryObject<Block> SHINGLES = registerBlock("shingles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> SHINGLE_WALL = registerBlock("shingle_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> SHINGLE_STAIRS = registerBlock("shingle_stairs",
            () -> new StairBlock(() -> ModBlocks.SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> SHINGLE_SLAB = registerBlock("shingle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUINED_SHINGLES = registerBlock("ruined_shingles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block> RUINED_SHINGLE_WALL = registerBlock("ruined_shingle_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block> RUINED_SHINGLE_STAIRS = registerBlock("ruined_shingle_stairs",
            () -> new StairBlock(() -> ModBlocks.RUINED_SHINGLES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_STAIRS).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUINED_SHINGLE_SLAB = registerBlock("ruined_shingle_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB).sound(SoundType.STONE)));

    public static final RegistryObject<Block> ADAMANTITE_ORE = registerBlock("adamantite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ADAMANTITE_ORE = registerBlock("deepslate_adamantite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

        public static void register(IEventBus eventBus){
            BLOCKS.register(eventBus);
        }
}
