package com.marshall.GreekFantasy.item;

import com.marshall.GreekFantasy.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers
{
    public static final ForgeTier CELESTIAL_BRONZE = new ForgeTier(10, 3031, 20.0f,
            10.0f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.CELESTIAL_BRONZE_INGOT.get()));
}
