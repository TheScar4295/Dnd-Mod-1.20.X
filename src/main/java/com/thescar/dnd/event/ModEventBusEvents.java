package com.thescar.dnd.event;

import com.thescar.dnd.DnD;
import com.thescar.dnd.entity.ModEntities;
import com.thescar.dnd.entity.client.WargModel;
import com.thescar.dnd.entity.custom.WargEntity;
import com.thescar.dnd.entity.layers.ModModelLayers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DnD.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.WARG_LAYER, WargModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.WARG.get(), WargEntity.createAttributes().build());
    }
}
