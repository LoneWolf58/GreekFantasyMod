package com.marshall.GreekFantasy.event;

import com.marshall.GreekFantasy.GreekFantasy;
import com.marshall.GreekFantasy.entity.client.armor.CelestialBronzeArmorRenderer;
import com.marshall.GreekFantasy.item.custom.CelestialBronzeArmorItem;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = GreekFantasy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {


    @SubscribeEvent
    public static void registerRecipeTypes(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(CelestialBronzeArmorItem.class, new CelestialBronzeArmorRenderer());
    }
}