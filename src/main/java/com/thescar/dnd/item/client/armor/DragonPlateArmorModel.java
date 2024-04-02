package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.DnD;
import com.thescar.dnd.item.DragonPlateArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class DragonPlateArmorModel extends GeoModel<DragonPlateArmorItem> {
    @Override
    public ResourceLocation getModelResource(DragonPlateArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "geo/dragon_plate_model.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DragonPlateArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "textures/armor/dragon_plate_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DragonPlateArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "animations/dragon_plate_armor.animation.json");
    }
}