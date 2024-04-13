package com.thescar.dnd.entity.client;

import com.thescar.dnd.DnD;
import com.thescar.dnd.entity.custom.WargEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;


public class WargModel extends GeoModel<WargEntity> {
    @Override
    public ResourceLocation getModelResource(WargEntity animatable) {
        return new ResourceLocation(DnD.MOD_ID, "geo/warg.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WargEntity animatable) {
        return null;
    }

    @Override
    public ResourceLocation getAnimationResource(WargEntity animatable) {
        return new ResourceLocation(DnD.MOD_ID, "animations/warg.animation.json");
    }

    @Override
    public void setCustomAnimations(WargEntity animatable, long instanceId, AnimationState<WargEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
