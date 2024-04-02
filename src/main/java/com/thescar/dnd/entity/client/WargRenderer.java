package com.thescar.dnd.entity.client;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.thescar.dnd.DnD;
import com.thescar.dnd.entity.custom.WargEntity;
import com.thescar.dnd.entity.layers.ModModelLayers;
import com.thescar.dnd.entity.variant.WargVariant;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;

public class WargRenderer extends MobRenderer<WargEntity, WargModel<WargEntity>> {
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

    public WargRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new WargModel<>(pContext.bakeLayer(ModModelLayers.WARG_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(WargEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(WargEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        if(pEntity.getVariant().getId() == 9) {
            pMatrixStack.scale(1f, 1f, 1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
