package com.marshall.GreekFantasy.item;

import com.marshall.GreekFantasy.GreekFantasy;
import com.marshall.GreekFantasy.item.custom.CelestialBronzeArmorItem;
import com.marshall.GreekFantasy.item.custom.CelestialBronzeSwordItem;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> CELESTIAL_BRONZE_SPEAR = ITEMS.register("celestial_bronze_spear",
            () -> new TridentItem(new Item.Properties().tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static final RegistryObject<Item> CELESTIAL_BRONZE_HELMET = ITEMS.register("celestial_bronze_helmet",
            () -> new CelestialBronzeArmorItem( ModArmorMaterials.CELESTIAL_BRONZE,  EquipmentSlot.HEAD, new Item.Properties()
                    .tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static final RegistryObject<Item> CELESTIAL_BRONZE_CHESTPLATE = ITEMS.register("celestial_bronze_chestplate",
            () -> new CelestialBronzeArmorItem( ModArmorMaterials.CELESTIAL_BRONZE,  EquipmentSlot.CHEST, new Item.Properties()
                    .tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static final RegistryObject<Item> CELESTIAL_BRONZE_LEGGINGS = ITEMS.register("celestial_bronze_leggings",
            () -> new CelestialBronzeArmorItem( ModArmorMaterials.CELESTIAL_BRONZE,  EquipmentSlot.LEGS, new Item.Properties()
                    .tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static final RegistryObject<Item> CELESTIAL_BRONZE_BOOTS = ITEMS.register("celestial_bronze_boots",
            () -> new CelestialBronzeArmorItem( ModArmorMaterials.CELESTIAL_BRONZE,  EquipmentSlot.FEET, new Item.Properties()
                    .tab(ModCreativeModeTab.GREEK_FANTASY_TAB)));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}
}
