package com.marshall.GreekFantasy.entity.client.armor;

import com.marshall.GreekFantasy.item.custom.CelestialBronzeArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class CelestialBronzeArmorRenderer extends GeoArmorRenderer<CelestialBronzeArmorItem> {
    public CelestialBronzeArmorRenderer() {
        super(new CelestialBronzeArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.leftLegBone = "armorRightLeg";
        this.rightLegBone = "armorLeftLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";

    }
}
