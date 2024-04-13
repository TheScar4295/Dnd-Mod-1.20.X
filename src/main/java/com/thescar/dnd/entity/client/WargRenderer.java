package com.thescar.dnd.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.thescar.dnd.DnD;
import com.thescar.dnd.entity.custom.WargEntity;
import com.thescar.dnd.entity.variant.WargVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

import java.util.Map;

public class WargRenderer extends GeoEntityRenderer<WargEntity> {
    private static final Map<WargVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WargVariant.class), map -> {
                map.put(WargVariant.PALE,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/pale_warg.png"));
                map.put(WargVariant.SNOWY,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/snowy_warg.png"));
                map.put(WargVariant.BLACK,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/black_warg.png"));
                map.put(WargVariant.CHESTNUT,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/chestnut_warg.png"));
                map.put(WargVariant.STRIPED,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/striped_warg.png"));
                map.put(WargVariant.ASHEN,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/ashen_warg.png"));
                map.put(WargVariant.RUSTY,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/rusty_warg.png"));
                map.put(WargVariant.WOOD,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/wood_warg.png"));
                map.put(WargVariant.SPOTTED,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/spotted_warg.png"));
                map.put(WargVariant.ZARG,
                        new ResourceLocation(DnD.MOD_ID, "textures/entity/zarg_warg.png"));
            });


    public WargRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WargModel());
    }

    @Override
    public ResourceLocation getTextureLocation(WargEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(WargEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}