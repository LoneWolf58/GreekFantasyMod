package com.marshall.GreekFantasy.entity.client.armor;

import com.marshall.GreekFantasy.GreekFantasy;
import com.marshall.GreekFantasy.item.custom.CelestialBronzeArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CelestialBronzeArmorModel extends AnimatedGeoModel<CelestialBronzeArmorItem>
{

    @Override
    public ResourceLocation getModelLocation(CelestialBronzeArmorItem object) {
        return new ResourceLocation(GreekFantasy.MOD_ID, "geo/celestial_bronze_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CelestialBronzeArmorItem object) {
        return new ResourceLocation(GreekFantasy.MOD_ID, "textures/models/armor/celestial_bronze_armor.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CelestialBronzeArmorItem animatable) {
        return new ResourceLocation(GreekFantasy.MOD_ID, "animations/armor_animations.json");
    }
}
