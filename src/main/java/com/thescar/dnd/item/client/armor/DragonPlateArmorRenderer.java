package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.item.DragonPlateArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DragonPlateArmorRenderer extends GeoArmorRenderer<DragonPlateArmorItem> {
    public DragonPlateArmorRenderer() {
        super(new DragonPlateArmorModel());
    }
}