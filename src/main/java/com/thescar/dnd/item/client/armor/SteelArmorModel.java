package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.DnD;
import com.thescar.dnd.item.ElvenArmorItem;
import com.thescar.dnd.item.SteelArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SteelArmorModel extends GeoModel<SteelArmorItem> {
    @Override
    public ResourceLocation getModelResource(SteelArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "geo/steel_armor_model.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SteelArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "textures/armor/steel_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SteelArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "animations/steel_armor.animation.json");
    }
}