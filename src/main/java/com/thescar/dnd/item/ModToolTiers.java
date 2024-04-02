package com.thescar.dnd.item;

import com.thescar.dnd.DnD;
import com.thescar.dnd.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier LANCE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 350, 6, 2f, 12,
                    ModTags.Blocks.NEEDS_LANCE_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(DnD.MOD_ID, "lance"), List.of(Tiers.IRON), List.of());

    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 800, 6, 2f, 12,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(DnD.MOD_ID, "steel_ingot"), List.of(Tiers.IRON), List.of());

    public static final Tier ELVEN_BRASS = TierSortingRegistry.registerTier(
            new ForgeTier(3, 910, 8, 3f, 14,
                    ModTags.Blocks.NEEDS_ELVEN_BRASS_TOOL, () -> Ingredient.of(ModItems.ELVEN_BRASS_INGOT.get())),
            new ResourceLocation(DnD.MOD_ID, "elven_brass_ingot"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1800, 9, 4f, 10,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(DnD.MOD_ID, "mithril_ingot"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier DRAGONBONE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2064, 9.5f, 4.5f, 15,
                    ModTags.Blocks.NEEDS_DRAGONBONE_TOOL, () -> Ingredient.of(ModItems.DRAGONBONE.get())),
            new ResourceLocation(DnD.MOD_ID, "dragonbone"), List.of(Tiers.IRON), List.of());
}