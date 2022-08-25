package com.marshall.GreekFantasy.item;

import com.marshall.GreekFantasy.GreekFantasy;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab GREEK_FANTASY_TAB = new CreativeModeTab("greek_fantasy_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CELESTIAL_BRONZE_SHIELD.get());
        }
    };
}
