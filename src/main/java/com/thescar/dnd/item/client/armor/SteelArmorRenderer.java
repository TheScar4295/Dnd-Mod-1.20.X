package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.item.SteelArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class SteelArmorRenderer extends GeoArmorRenderer<SteelArmorItem> {
    public SteelArmorRenderer() {
        super(new SteelArmorModel());
    }
}