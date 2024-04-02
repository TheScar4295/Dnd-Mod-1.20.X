package com.thescar.dnd.item;

import com.thescar.dnd.DnD;
import com.thescar.dnd.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DnD.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DND_TAB = CREATIVE_MODE_TABS.register("dnd_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.dnd_tab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.WARG_SPAWN_EGG.get());

                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.WYVERN_STINGER.get());
                        pOutput.accept(ModItems.RAW_ADAMANTITE.get());
                        pOutput.accept(ModItems.DWARVEN_INGOT.get());
                        pOutput.accept(ModItems.OLDFORGED_INGOT.get());
                        pOutput.accept(ModItems.BLANK_OBELISK.get());
                        pOutput.accept(ModItems.GOLD_COINS.get());
                        pOutput.accept(ModItems.LOOT_BAG.get());
                        pOutput.accept(ModItems.MAGE_LOOT.get());

                        pOutput.accept(ModItems.LANCE.get());
                        pOutput.accept(ModItems.CRYSTAL_CLEAVER.get());
                        pOutput.accept(ModItems.DRAUGR_AXE.get());
                        pOutput.accept(ModItems.DANE_AXE.get());
                        pOutput.accept(ModItems.WARTORN_DANE_AXE.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.STEEL_SWORD.get());
                        pOutput.accept(ModItems.STEEL_AXE.get());
                        pOutput.accept(ModItems.STEEL_PICKAXE.get());
                        pOutput.accept(ModItems.STEEL_SHOVEL.get());
                        pOutput.accept(ModItems.STEEL_HOE.get());
                        pOutput.accept(ModItems.MITHRIL_INGOT.get());
                        pOutput.accept(ModItems.MITHRIL_SWORD.get());
                        pOutput.accept(ModItems.MITHRIL_AXE.get());
                        pOutput.accept(ModItems.MITHRIL_PICKAXE.get());
                        pOutput.accept(ModItems.MITHRIL_SHOVEL.get());
                        pOutput.accept(ModItems.MITHRIL_HOE.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_INGOT.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_SWORD.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_AXE.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_PICKAXE.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_SHOVEL.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_HOE.get());
                        pOutput.accept(ModItems.DRAGONBONE.get());
                        pOutput.accept(ModItems.DRAGONBONE_SWORD.get());
                        pOutput.accept(ModItems.DRAGONBONE_AXE.get());
                        pOutput.accept(ModItems.DRAGONBONE_PICKAXE.get());
                        pOutput.accept(ModItems.DRAGONBONE_SHOVEL.get());
                        pOutput.accept(ModItems.DRAGONBONE_HOE.get());

                        pOutput.accept(ModItems.STEEL_HELMET.get());
                        pOutput.accept(ModItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(ModItems.STEEL_LEGGINGS.get());
                        pOutput.accept(ModItems.STEEL_BOOTS.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_HELMET.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_CHESTPLATE.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_LEGGINGS.get());
                        pOutput.accept(ModItems.ELVEN_BRASS_BOOTS.get());
                        pOutput.accept(ModItems.MITHRIL_HELMET.get());
                        pOutput.accept(ModItems.MITHRIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.MITHRIL_LEGGINGS.get());
                        pOutput.accept(ModItems.MITHRIL_BOOTS.get());
                        pOutput.accept(ModItems.DRAGONBONE_HELMET.get());
                        pOutput.accept(ModItems.DRAGONBONE_CHESTPLATE.get());
                        pOutput.accept(ModItems.DRAGONBONE_LEGGINGS.get());
                        pOutput.accept(ModItems.DRAGONBONE_BOOTS.get());

                        pOutput.accept(ModBlocks.ADAMANTITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());
                        pOutput.accept(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RUBBLE.get());
                        pOutput.accept(ModBlocks.CHUNKY_RUBBLE.get());
                        pOutput.accept(ModBlocks.SHINGLES.get());
                        pOutput.accept(ModBlocks.SHINGLE_WALL.get());
                        pOutput.accept(ModBlocks.SHINGLE_STAIRS.get());
                        pOutput.accept(ModBlocks.SHINGLE_SLAB.get());
                        pOutput.accept(ModBlocks.RUINED_SHINGLES.get());
                        pOutput.accept(ModBlocks.RUINED_SHINGLE_WALL.get());
                        pOutput.accept(ModBlocks.RUINED_SHINGLE_STAIRS.get());
                        pOutput.accept(ModBlocks.RUINED_SHINGLE_SLAB.get());

                        pOutput.accept(ModBlocks.SHALE.get());
                        pOutput.accept(ModBlocks.SHALE_WALL.get());
                        pOutput.accept(ModBlocks.SHALE_STAIRS.get());
                        pOutput.accept(ModBlocks.SHALE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_SHALE.get());
                        pOutput.accept(ModBlocks.POLISHED_SHALE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_SHALE_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_SHALE_SLAB.get());
                        pOutput.accept(ModBlocks.SHALE_BRICKS.get());
                        pOutput.accept(ModBlocks.SHALE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.SHALE_SHINGLE_STAIRS.get());
                        pOutput.accept(ModBlocks.SHALE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.SHALE_PILLAR.get());
                        pOutput.accept(ModBlocks.SHALE_SHINGLES.get());
                        pOutput.accept(ModBlocks.SHALE_SHINGLE_WALL.get());
                        pOutput.accept(ModBlocks.SHALE_SHINGLE_STAIRS.get());
                        pOutput.accept(ModBlocks.SHALE_SHINGLE_SLAB.get());
                        pOutput.accept(ModBlocks.SHALE_TILES.get());
                        pOutput.accept(ModBlocks.SHALE_TILE_WALL.get());
                        pOutput.accept(ModBlocks.SHALE_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.SHALE_TILE_STAIRS.get());

                        pOutput.accept(ModBlocks.GREENSCHIST.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_WALL.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_STAIRS.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_GREENSCHIST.get());
                        pOutput.accept(ModBlocks.POLISHED_GREENSCHIST_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_GREENSCHIST_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_GREENSCHIST_SLAB.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_BRICKS.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.GREENSCHIST_PILLAR.get());
                        pOutput.accept(ModBlocks.CHISELED_GREENSCHIST.get());
                        pOutput.accept(ModBlocks.ALGAL_GREENSCHIST_BRICKS.get());
                        pOutput.accept(ModBlocks.ALGAL_GREENSCHIST_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.ALGAL_GREENSCHIST_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.ALGAL_GREENSCHIST_BRICK_SLAB.get());

                        pOutput.accept(ModBlocks.AGING_ADOBE.get());
                        pOutput.accept(ModBlocks.AGING_ADOBE_WALL.get());
                        pOutput.accept(ModBlocks.AGING_ADOBE_SLAB.get());
                        pOutput.accept(ModBlocks.AGING_ADOBE_STAIRS.get());
                        pOutput.accept(ModBlocks.AGING_ADOBE_PILLAR.get());
                        pOutput.accept(ModBlocks.CHISELED_AGING_ADOBE.get());
                        pOutput.accept(ModBlocks.CRACKED_AGING_ADOBE.get());
                        pOutput.accept(ModBlocks.CRACKED_AGING_ADOBE_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_AGING_ADOBE_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_AGING_ADOBE_STAIRS.get());
                        pOutput.accept(ModBlocks.MOSSY_AGING_ADOBE.get());
                        pOutput.accept(ModBlocks.MOSSY_AGING_ADOBE_WALL.get());
                        pOutput.accept(ModBlocks.MOSSY_AGING_ADOBE_SLAB.get());
                        pOutput.accept(ModBlocks.MOSSY_AGING_ADOBE_STAIRS.get());
                        pOutput.accept(ModBlocks.PAINTED_AGING_ADOBE.get());
                        pOutput.accept(ModBlocks.SANDY_AGING_ADOBE.get());
                        pOutput.accept(ModBlocks.SANDY_AGING_ADOBE_WALL.get());
                        pOutput.accept(ModBlocks.SANDY_AGING_ADOBE_SLAB.get());
                        pOutput.accept(ModBlocks.SANDY_AGING_ADOBE_STAIRS.get());

                        pOutput.accept(ModBlocks.RAW_IRONSTONE.get());
                        pOutput.accept(ModBlocks.RAW_IRONSTONE_WALL.get());
                        pOutput.accept(ModBlocks.RAW_IRONSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.RAW_IRONSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.IRONSTONE_PILLAR.get());
                        pOutput.accept(ModBlocks.POLISHED_IRONSTONE.get());
                        pOutput.accept(ModBlocks.POLISHED_IRONSTONE_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_IRONSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_IRONSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.IRONSTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.IRONSTONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.IRONSTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.IRONSTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MOSSY_IRONSTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.MOSSY_IRONSTONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.MOSSY_IRONSTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.MOSSY_IRONSTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_IRONSTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_IRONSTONE_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_IRONSTONE_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_IRONSTONE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CHISELED_IRONSTONE.get());
                        pOutput.accept(ModBlocks.IRONSTONE_TILES.get());
                        pOutput.accept(ModBlocks.IRONSTONE_TILE_WALL.get());
                        pOutput.accept(ModBlocks.IRONSTONE_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.IRONSTONE_TILE_STAIRS.get());
                        pOutput.accept(ModBlocks.IRONSTONE_BATTLEMENT.get());

                        pOutput.accept(ModBlocks.FORGED_BRICKS.get());
                        pOutput.accept(ModBlocks.FORGED_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.FORGED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.FORGED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_FORGED_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_FORGED_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_FORGED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_FORGED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.LINED_FORGED_BRICKS.get());
                        pOutput.accept(ModBlocks.LINED_FORGED_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.LINED_FORGED_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LINED_FORGED_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.FORGED_PILLAR.get());
                        pOutput.accept(ModBlocks.FORGED_TILES.get());
                        pOutput.accept(ModBlocks.FORGED_TILE_WALL.get());
                        pOutput.accept(ModBlocks.FORGED_TILE_SLAB.get());
                        pOutput.accept(ModBlocks.FORGED_TILE_STAIRS.get());

                        pOutput.accept(ModBlocks.LAVAROCK.get());
                        pOutput.accept(ModBlocks.LAVAROCK_WALL.get());
                        pOutput.accept(ModBlocks.LAVAROCK_SLAB.get());
                        pOutput.accept(ModBlocks.LAVAROCK_STAIRS.get());
                        pOutput.accept(ModBlocks.LAVAROCK_BRICKS.get());
                        pOutput.accept(ModBlocks.LAVAROCK_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.LAVAROCK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.LAVAROCK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_LAVAROCK_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_LAVAROCK_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CRACKED_LAVAROCK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_LAVAROCK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CHARRED_LAVAROCK_BRICKS.get());
                        pOutput.accept(ModBlocks.CHARRED_LAVAROCK_BRICK_WALL.get());
                        pOutput.accept(ModBlocks.CHARRED_LAVAROCK_BRICK_SLAB.get());
                        pOutput.accept(ModBlocks.CHARRED_LAVAROCK_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.POLISHED_LAVAROCK.get());
                        pOutput.accept(ModBlocks.POLISHED_LAVAROCK_WALL.get());
                        pOutput.accept(ModBlocks.POLISHED_LAVAROCK_SLAB.get());
                        pOutput.accept(ModBlocks.POLISHED_LAVAROCK_STAIRS.get());
                        pOutput.accept(ModBlocks.CHISELED_LAVAROCK.get());
                        pOutput.accept(ModBlocks.LAVAROCK_PILLAR.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}