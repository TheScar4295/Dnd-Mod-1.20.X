package com.thescar.dnd.item;

import com.thescar.dnd.DnD;
import com.thescar.dnd.entity.ModEntities;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DnD.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_STINGER = ITEMS.register("wyvern_stinger", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLANK_OBELISK = ITEMS.register("blank_obelisk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_COINS = ITEMS.register("gold_coins", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOOT_BAG = ITEMS.register("loot_bag", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGE_LOOT = ITEMS.register("mage_loot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WARG_SPAWN_EGG = ITEMS.register("warg_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.WARG, 0x9F9A96, 0xB0AAA7, new Item.Properties()));

    public static final RegistryObject<Item> DRAGONBONE = ITEMS.register("dragonbone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANTITE = ITEMS.register("raw_adamantite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DWARVEN_INGOT = ITEMS.register("dwarven_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_INGOT = ITEMS.register("elven_brass_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OLDFORGED_INGOT = ITEMS.register("oldforged_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LANCE = ITEMS.register("lance", () -> new SwordItem(Tiers.IRON, 6, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> CRYSTAL_CLEAVER = ITEMS.register("crystal_cleaver", () -> new SwordItem(Tiers.IRON, 6, -2.2f, new Item.Properties()));
    public static final RegistryObject<Item> DRAUGR_AXE = ITEMS.register("draugr_axe", () -> new AxeItem(ModToolTiers.STEEL, 7, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> DANE_AXE = ITEMS.register("dane_axe", () -> new AxeItem(ModToolTiers.STEEL, 6, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> WARTORN_DANE_AXE = ITEMS.register("wartorn_dane_axe", () -> new AxeItem(ModToolTiers.STEEL, 7, -3.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModToolTiers.STEEL, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModToolTiers.STEEL, 5, -3, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModToolTiers.STEEL, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModToolTiers.STEEL, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModToolTiers.STEEL, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModToolTiers.ELVEN_BRASS, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModToolTiers.ELVEN_BRASS, 6, -3, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModToolTiers.ELVEN_BRASS, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModToolTiers.ELVEN_BRASS, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModToolTiers.ELVEN_BRASS, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_SWORD = ITEMS.register("elven_brass_sword", () -> new SwordItem(ModToolTiers.ELVEN_BRASS, 5, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_AXE = ITEMS.register("elven_brass_axe", () -> new AxeItem(ModToolTiers.ELVEN_BRASS, 6, -3, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_PICKAXE = ITEMS.register("elven_brass_pickaxe", () -> new PickaxeItem(ModToolTiers.ELVEN_BRASS, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_SHOVEL = ITEMS.register("elven_brass_shovel", () -> new ShovelItem(ModToolTiers.ELVEN_BRASS, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_HOE = ITEMS.register("elven_brass_hoe", () -> new HoeItem(ModToolTiers.ELVEN_BRASS, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_SWORD = ITEMS.register("dragonbone_sword", () -> new SwordItem(ModToolTiers.STEEL, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_AXE = ITEMS.register("dragonbone_axe", () -> new AxeItem(ModToolTiers.STEEL, 5, -3, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_PICKAXE = ITEMS.register("dragonbone_pickaxe", () -> new PickaxeItem(ModToolTiers.STEEL, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_SHOVEL = ITEMS.register("dragonbone_shovel", () -> new ShovelItem(ModToolTiers.STEEL, 0, -3f, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_HOE = ITEMS.register("dragonbone_hoe", () -> new HoeItem(ModToolTiers.STEEL, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new
            SteelArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new
            SteelArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new
            SteelArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new
            SteelArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_HELMET = ITEMS.register("elven_brass_helmet", () -> new
            ElvenArmorItem(ModArmorMaterials.ELVEN_BRASS, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_CHESTPLATE = ITEMS.register("elven_brass_chestplate", () -> new
            ElvenArmorItem(ModArmorMaterials.ELVEN_BRASS, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_LEGGINGS = ITEMS.register("elven_brass_leggings", () -> new
            ElvenArmorItem(ModArmorMaterials.ELVEN_BRASS, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ELVEN_BRASS_BOOTS = ITEMS.register("elven_brass_boots", () -> new
            ElvenArmorItem(ModArmorMaterials.ELVEN_BRASS, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new
            MithrilArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new
            MithrilArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new
            MithrilArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new
            MithrilArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_HELMET = ITEMS.register("dragonbone_helmet", () -> new
            DragonPlateArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_CHESTPLATE = ITEMS.register("dragonbone_chestplate", () -> new
            DragonPlateArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_LEGGINGS = ITEMS.register("dragonbone_leggings", () -> new
            DragonPlateArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONBONE_BOOTS = ITEMS.register("dragonbone_boots", () -> new
            DragonPlateArmorItem(ModArmorMaterials.DRAGONBONE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}