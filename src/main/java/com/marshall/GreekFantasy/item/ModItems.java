package com.marshall.GreekFantasy.item;

import com.marshall.GreekFantasy.GreekFantasy;
import com.marshall.GreekFantasy.item.custom.CelestialBronzeSwordItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.item.BannerItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShieldItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GreekFantasy.MOD_ID);

    public static final RegistryObject<Item> CELESTIAL_BRONZE_INGOT = ITEMS.register("celestial_bronze_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static final RegistryObject<Item> CELESTIAL_BRONZE_SWORD = ITEMS.register("celestial_bronze_sword",
            () -> new CelestialBronzeSwordItem(ModTiers.CELESTIAL_BRONZE, 7, 100f,
                    new Item.Properties().tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static final RegistryObject<Item> CELESTIAL_BRONZE_SHIELD = ITEMS.register("celestial_bronze_shield",
            () -> new ShieldItem(new Item.Properties().tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}
}
