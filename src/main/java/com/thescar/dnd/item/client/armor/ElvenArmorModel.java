package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.DnD;
import com.thescar.dnd.item.DragonPlateArmorItem;
import com.thescar.dnd.item.ElvenArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ElvenArmorModel extends GeoModel<ElvenArmorItem> {
    @Override
    public ResourceLocation getModelResource(ElvenArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "geo/elven_armor_model.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ElvenArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "textures/armor/elven_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ElvenArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "animations/elven_armor.animation.json");
    }
}