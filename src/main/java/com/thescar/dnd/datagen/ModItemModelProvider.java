package com.thescar.dnd.datagen;

import com.thescar.dnd.DnD;
import com.thescar.dnd.block.ModBlocks;
import com.thescar.dnd.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DnD.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.WYVERN_STINGER);
        simpleItem(ModItems.RAW_ADAMANTITE);
        simpleItem(ModItems.DRAGONBONE);
        simpleItem(ModItems.DWARVEN_INGOT);
        simpleItem(ModItems.ELVEN_BRASS_INGOT);
        simpleItem(ModItems.MITHRIL_INGOT);
        simpleItem(ModItems.OLDFORGED_INGOT);
        simpleItem(ModItems.BLANK_OBELISK);
        simpleItem(ModItems.GOLD_COINS);
        simpleItem(ModItems.LOOT_BAG);
        simpleItem(ModItems.MAGE_LOOT);

        withExistingParent(ModItems.WARG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_HOE);
        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_HOE);
        handheldItem(ModItems.ELVEN_BRASS_SWORD);
        handheldItem(ModItems.ELVEN_BRASS_AXE);
        handheldItem(ModItems.ELVEN_BRASS_PICKAXE);
        handheldItem(ModItems.ELVEN_BRASS_SHOVEL);
        handheldItem(ModItems.ELVEN_BRASS_HOE);
        handheldItem(ModItems.DRAGONBONE_SWORD);
        handheldItem(ModItems.DRAGONBONE_AXE);
        handheldItem(ModItems.DRAGONBONE_PICKAXE);
        handheldItem(ModItems.DRAGONBONE_SHOVEL);
        handheldItem(ModItems.DRAGONBONE_HOE);

        simpleItem(ModItems.STEEL_HELMET);
        simpleItem(ModItems.STEEL_CHESTPLATE);
        simpleItem(ModItems.STEEL_LEGGINGS);
        simpleItem(ModItems.STEEL_BOOTS);
        simpleItem(ModItems.ELVEN_BRASS_HELMET);
        simpleItem(ModItems.ELVEN_BRASS_CHESTPLATE);
        simpleItem(ModItems.ELVEN_BRASS_LEGGINGS);
        simpleItem(ModItems.ELVEN_BRASS_BOOTS);
        simpleItem(ModItems.MITHRIL_HELMET);
        simpleItem(ModItems.MITHRIL_CHESTPLATE);
        simpleItem(ModItems.MITHRIL_LEGGINGS);
        simpleItem(ModItems.MITHRIL_BOOTS);
        simpleItem(ModItems.DRAGONBONE_HELMET);
        simpleItem(ModItems.DRAGONBONE_CHESTPLATE);
        simpleItem(ModItems.DRAGONBONE_LEGGINGS);
        simpleItem(ModItems.DRAGONBONE_BOOTS);

        wallItem(ModBlocks.SHINGLE_WALL, ModBlocks.SHINGLES);
        wallItem(ModBlocks.RUINED_SHINGLE_WALL, ModBlocks.RUINED_SHINGLES);
        wallItem(ModBlocks.SHALE_WALL, ModBlocks.SHALE);
        wallItem(ModBlocks.POLISHED_SHALE_WALL, ModBlocks.SHALE);
        wallItem(ModBlocks.SHALE_BRICK_WALL, ModBlocks.SHALE_BRICKS);
        wallItem(ModBlocks.SHALE_SHINGLE_WALL, ModBlocks.SHALE_SHINGLES);
        wallItem(ModBlocks.SHALE_TILE_WALL, ModBlocks.SHALE_TILES);
        wallItem(ModBlocks.GREENSCHIST_WALL, ModBlocks.GREENSCHIST);
        wallItem(ModBlocks.POLISHED_GREENSCHIST_WALL, ModBlocks.POLISHED_GREENSCHIST);
        wallItem(ModBlocks.GREENSCHIST_BRICK_WALL, ModBlocks.GREENSCHIST_BRICKS);
        wallItem(ModBlocks.ALGAL_GREENSCHIST_BRICK_WALL, ModBlocks.ALGAL_GREENSCHIST_BRICKS);
        wallItem(ModBlocks.AGING_ADOBE_WALL, ModBlocks.AGING_ADOBE);
        wallItem(ModBlocks.CRACKED_AGING_ADOBE_WALL, ModBlocks.CRACKED_AGING_ADOBE);
        wallItem(ModBlocks.MOSSY_AGING_ADOBE_WALL, ModBlocks.MOSSY_AGING_ADOBE);
        wallItem(ModBlocks.SANDY_AGING_ADOBE_WALL, ModBlocks.SANDY_AGING_ADOBE);
        wallItem(ModBlocks.AGING_ADOBE_WALL, ModBlocks.AGING_ADOBE);
        wallItem(ModBlocks.RAW_IRONSTONE_WALL, ModBlocks.RAW_IRONSTONE);
        wallItem(ModBlocks.POLISHED_IRONSTONE_WALL, ModBlocks.POLISHED_IRONSTONE);
        wallItem(ModBlocks.IRONSTONE_BRICK_WALL, ModBlocks.IRONSTONE_BRICKS);
        wallItem(ModBlocks.MOSSY_IRONSTONE_BRICK_WALL, ModBlocks.MOSSY_IRONSTONE_BRICKS);
        wallItem(ModBlocks.CRACKED_IRONSTONE_BRICK_WALL, ModBlocks.CRACKED_IRONSTONE_BRICKS);
        wallItem(ModBlocks.IRONSTONE_TILE_WALL, ModBlocks.IRONSTONE_TILES);
        wallItem(ModBlocks.FORGED_BRICK_WALL, ModBlocks.FORGED_BRICKS);
        wallItem(ModBlocks.CRACKED_FORGED_BRICK_WALL, ModBlocks.CRACKED_FORGED_BRICKS);
        wallItem(ModBlocks.LINED_FORGED_BRICK_WALL, ModBlocks.LINED_FORGED_BRICKS);
        wallItem(ModBlocks.FORGED_TILE_WALL, ModBlocks.FORGED_TILES);
        wallItem(ModBlocks.LAVAROCK_WALL, ModBlocks.LAVAROCK);
        wallItem(ModBlocks.LAVAROCK_BRICK_WALL, ModBlocks.LAVAROCK_BRICKS);
        wallItem(ModBlocks.CRACKED_LAVAROCK_BRICK_WALL, ModBlocks.CRACKED_LAVAROCK_BRICKS);
        wallItem(ModBlocks.CHARRED_LAVAROCK_BRICK_WALL, ModBlocks.CHARRED_LAVAROCK_BRICKS);
        wallItem(ModBlocks.POLISHED_LAVAROCK_WALL, ModBlocks.POLISHED_LAVAROCK);
        wallItem(ModBlocks.SHINGLE_WALL, ModBlocks.SHINGLES);
        wallItem(ModBlocks.RUINED_SHINGLE_WALL, ModBlocks.RUINED_SHINGLES);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnD.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DnD.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(DnD.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));

    }
}