package com.thescar.dnd.item.client.armor;

import com.thescar.dnd.item.MithrilArmorItem;
import com.thescar.dnd.item.SteelArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MithrilArmorRenderer extends GeoArmorRenderer<MithrilArmorItem> {
    public MithrilArmorRenderer() {
        super(new MithrilArmorModel());
    }
}