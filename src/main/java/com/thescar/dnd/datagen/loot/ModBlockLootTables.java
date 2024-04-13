package com.thescar.dnd.datagen.loot;

import com.thescar.dnd.block.ModBlocks;
import com.thescar.dnd.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        this.dropSelf(ModBlocks.RUBBLE.get());
        this.dropSelf(ModBlocks.CHUNKY_RUBBLE.get());
        this.dropSelf(ModBlocks.SHINGLES.get());
        this.dropSelf(ModBlocks.SHINGLE_WALL.get());
        this.dropSelf(ModBlocks.SHINGLE_STAIRS.get());
        this.add(ModBlocks.SHINGLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHINGLE_SLAB.get()));
        this.dropSelf(ModBlocks.RUINED_SHINGLES.get());
        this.dropSelf(ModBlocks.RUINED_SHINGLE_WALL.get());
        this.dropSelf(ModBlocks.RUINED_SHINGLE_STAIRS.get());
        this.add(ModBlocks.RUINED_SHINGLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUINED_SHINGLE_SLAB.get()));

        this.dropSelf(ModBlocks.SHALE.get());
        this.dropSelf(ModBlocks.SHALE_WALL.get());
        this.dropSelf(ModBlocks.SHALE_STAIRS.get());
        this.add(ModBlocks.SHALE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHALE_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_SHALE.get());
        this.dropSelf(ModBlocks.POLISHED_SHALE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_SHALE_STAIRS.get());
        this.add(ModBlocks.POLISHED_SHALE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_SHALE_SLAB.get()));
        this.dropSelf(ModBlocks.SHALE_BRICKS.get());
        this.dropSelf(ModBlocks.SHALE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.SHALE_BRICK_STAIRS.get());
        this.add(ModBlocks.SHALE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHALE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.SHALE_PILLAR.get());
        this.dropSelf(ModBlocks.SHALE_SHINGLES.get());
        this.dropSelf(ModBlocks.SHALE_SHINGLE_WALL.get());
        this.dropSelf(ModBlocks.SHALE_SHINGLE_STAIRS.get());
        this.add(ModBlocks.SHALE_SHINGLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHALE_SHINGLE_SLAB.get()));
        this.dropSelf(ModBlocks.SHALE_TILES.get());
        this.dropSelf(ModBlocks.SHALE_TILE_WALL.get());
        this.dropSelf(ModBlocks.SHALE_TILE_STAIRS.get());
        this.add(ModBlocks.SHALE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SHALE_TILE_SLAB.get()));

        this.dropSelf(ModBlocks.GREENSCHIST.get());
        this.dropSelf(ModBlocks.GREENSCHIST_WALL.get());
        this.dropSelf(ModBlocks.GREENSCHIST_STAIRS.get());
        this.add(ModBlocks.GREENSCHIST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREENSCHIST_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_GREENSCHIST.get());
        this.dropSelf(ModBlocks.POLISHED_GREENSCHIST_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_GREENSCHIST_STAIRS.get());
        this.add(ModBlocks.POLISHED_GREENSCHIST_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_GREENSCHIST_SLAB.get()));
        this.dropSelf(ModBlocks.GREENSCHIST_BRICKS.get());
        this.dropSelf(ModBlocks.GREENSCHIST_BRICK_WALL.get());
        this.dropSelf(ModBlocks.GREENSCHIST_BRICK_STAIRS.get());
        this.add(ModBlocks.GREENSCHIST_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREENSCHIST_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.GREENSCHIST_PILLAR.get());
        this.dropSelf(ModBlocks.CHISELED_GREENSCHIST.get());
        this.dropSelf(ModBlocks.ALGAL_GREENSCHIST_BRICKS.get());
        this.dropSelf(ModBlocks.ALGAL_GREENSCHIST_BRICK_WALL.get());
        this.dropSelf(ModBlocks.ALGAL_GREENSCHIST_BRICK_STAIRS.get());
        this.add(ModBlocks.ALGAL_GREENSCHIST_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ALGAL_GREENSCHIST_BRICK_SLAB.get()));

        this.dropSelf(ModBlocks.AGING_ADOBE.get());
        this.dropSelf(ModBlocks.AGING_ADOBE_WALL.get());
        this.dropSelf(ModBlocks.AGING_ADOBE_STAIRS.get());
        this.add(ModBlocks.AGING_ADOBE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AGING_ADOBE_SLAB.get()));
        this.dropSelf(ModBlocks.AGING_ADOBE_PILLAR.get());
        this.dropSelf(ModBlocks.CHISELED_AGING_ADOBE.get());
        this.dropSelf(ModBlocks.CRACKED_AGING_ADOBE.get());
        this.dropSelf(ModBlocks.CRACKED_AGING_ADOBE_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_AGING_ADOBE_STAIRS.get());
        this.add(ModBlocks.CRACKED_AGING_ADOBE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRACKED_AGING_ADOBE_SLAB.get()));
        this.dropSelf(ModBlocks.MOSSY_AGING_ADOBE.get());
        this.dropSelf(ModBlocks.MOSSY_AGING_ADOBE_WALL.get());
        this.dropSelf(ModBlocks.MOSSY_AGING_ADOBE_STAIRS.get());
        this.add(ModBlocks.MOSSY_AGING_ADOBE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_AGING_ADOBE_SLAB.get()));
        this.dropSelf(ModBlocks.PAINTED_AGING_ADOBE.get());
        this.dropSelf(ModBlocks.SANDY_AGING_ADOBE.get());
        this.dropSelf(ModBlocks.SANDY_AGING_ADOBE_WALL.get());
        this.dropSelf(ModBlocks.SANDY_AGING_ADOBE_STAIRS.get());
        this.add(ModBlocks.SANDY_AGING_ADOBE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SANDY_AGING_ADOBE_SLAB.get()));

        this.dropSelf(ModBlocks.RAW_IRONSTONE.get());
        this.dropSelf(ModBlocks.RAW_IRONSTONE_WALL.get());
        this.dropSelf(ModBlocks.RAW_IRONSTONE_STAIRS.get());
        this.add(ModBlocks.RAW_IRONSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RAW_IRONSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.IRONSTONE_PILLAR.get());
        this.dropSelf(ModBlocks.POLISHED_IRONSTONE.get());
        this.dropSelf(ModBlocks.POLISHED_IRONSTONE_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_IRONSTONE_STAIRS.get());
        this.add(ModBlocks.POLISHED_IRONSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_IRONSTONE_SLAB.get()));
        this.dropSelf(ModBlocks.IRONSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.IRONSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.IRONSTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.IRONSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.IRONSTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.MOSSY_IRONSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_IRONSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.MOSSY_IRONSTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.MOSSY_IRONSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_IRONSTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_IRONSTONE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_IRONSTONE_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_IRONSTONE_BRICK_STAIRS.get());
        this.add(ModBlocks.CRACKED_IRONSTONE_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRACKED_IRONSTONE_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_IRONSTONE.get());
        this.dropSelf(ModBlocks.IRONSTONE_TILES.get());
        this.dropSelf(ModBlocks.IRONSTONE_TILE_WALL.get());
        this.dropSelf(ModBlocks.IRONSTONE_TILE_STAIRS.get());
        this.add(ModBlocks.IRONSTONE_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.IRONSTONE_TILE_SLAB.get()));
        this.dropSelf(ModBlocks.IRONSTONE_BATTLEMENT.get());

        this.dropSelf(ModBlocks.FORGED_BRICKS.get());
        this.dropSelf(ModBlocks.FORGED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.FORGED_BRICK_STAIRS.get());
        this.add(ModBlocks.FORGED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FORGED_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_FORGED_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_FORGED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_FORGED_BRICK_STAIRS.get());
        this.add(ModBlocks.CRACKED_FORGED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRACKED_FORGED_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.LINED_FORGED_BRICKS.get());
        this.dropSelf(ModBlocks.LINED_FORGED_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LINED_FORGED_BRICK_STAIRS.get());
        this.add(ModBlocks.LINED_FORGED_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LINED_FORGED_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.FORGED_PILLAR.get());
        this.dropSelf(ModBlocks.FORGED_TILES.get());
        this.dropSelf(ModBlocks.FORGED_TILE_WALL.get());
        this.dropSelf(ModBlocks.FORGED_TILE_STAIRS.get());
        this.add(ModBlocks.FORGED_TILE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FORGED_TILE_SLAB.get()));

        this.dropSelf(ModBlocks.LAVAROCK.get());
        this.dropSelf(ModBlocks.LAVAROCK_WALL.get());
        this.dropSelf(ModBlocks.LAVAROCK_STAIRS.get());
        this.add(ModBlocks.LAVAROCK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LAVAROCK_SLAB.get()));
        this.dropSelf(ModBlocks.LAVAROCK_BRICKS.get());
        this.dropSelf(ModBlocks.LAVAROCK_BRICK_WALL.get());
        this.dropSelf(ModBlocks.LAVAROCK_BRICK_STAIRS.get());
        this.add(ModBlocks.LAVAROCK_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LAVAROCK_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CRACKED_LAVAROCK_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_LAVAROCK_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_LAVAROCK_BRICK_STAIRS.get());
        this.add(ModBlocks.CRACKED_LAVAROCK_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRACKED_LAVAROCK_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.CHARRED_LAVAROCK_BRICKS.get());
        this.dropSelf(ModBlocks.CHARRED_LAVAROCK_BRICK_WALL.get());
        this.dropSelf(ModBlocks.CHARRED_LAVAROCK_BRICK_STAIRS.get());
        this.add(ModBlocks.CHARRED_LAVAROCK_BRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHARRED_LAVAROCK_BRICK_SLAB.get()));
        this.dropSelf(ModBlocks.POLISHED_LAVAROCK.get());
        this.dropSelf(ModBlocks.POLISHED_LAVAROCK_WALL.get());
        this.dropSelf(ModBlocks.POLISHED_LAVAROCK_STAIRS.get());
        this.add(ModBlocks.POLISHED_LAVAROCK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.POLISHED_LAVAROCK_SLAB.get()));
        this.dropSelf(ModBlocks.CHISELED_LAVAROCK.get());
        this.dropSelf(ModBlocks.LAVAROCK_PILLAR.get());

        this.add(ModBlocks.ADAMANTITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        this.add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));

        this.dropSelf(ModBlocks.VASE.get());

    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}