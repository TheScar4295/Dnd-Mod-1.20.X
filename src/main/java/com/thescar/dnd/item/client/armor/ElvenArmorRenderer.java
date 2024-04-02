package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.item.ElvenArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ElvenArmorRenderer extends GeoArmorRenderer<ElvenArmorItem> {
    public ElvenArmorRenderer() {
        super(new ElvenArmorModel());
    }
}