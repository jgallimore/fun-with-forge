package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class TheMutineer extends SwordItem {
    public TheMutineer() {
        super(Tiers.DIAMOND, 20000000, 200000000000000F, new Item.Properties());
    }
}