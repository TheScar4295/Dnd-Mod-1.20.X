package com.thescar.dnd.util;

import com.thescar.dnd.DnD;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");
        public static final TagKey<Block> NEEDS_ELVEN_BRASS_TOOL = tag("needs_elven_brass_tool");
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = tag("needs_mithril_tool");
        public static final TagKey<Block> NEEDS_DRAGONBONE_TOOL = tag("needs_dragonbone_tool");

        public static final TagKey<Block> NEEDS_LANCE_TOOL = tag("needs_lance_tool");
        public static final TagKey<Block> NEEDS_WARTORN_DANE_AXE_TOOL = tag("needs_wartorn_dane_axe_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DnD.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DnD.MOD_ID, name));
        }
    }
}
