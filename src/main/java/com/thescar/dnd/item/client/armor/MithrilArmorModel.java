package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.DnD;
import com.thescar.dnd.item.MithrilArmorItem;
import com.thescar.dnd.item.SteelArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MithrilArmorModel extends GeoModel<MithrilArmorItem> {
    @Override
    public ResourceLocation getModelResource(MithrilArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "geo/mithril_armor_model.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MithrilArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "textures/armor/mithril_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MithrilArmorItem animatable) {
        return new ResourceLocation(DnD.MOD_ID, "animations/mithril_armor.animation.json");
    }
}