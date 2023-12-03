package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class CustomSword extends SwordItem {
    public CustomSword() {
        super(Tiers.DIAMOND, 362, 235F, new Item.Properties());
    }
}
