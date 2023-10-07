
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BurgerItem extends Item {
	public BurgerItem() {
		super(new Item.Properties().stacksTo(32).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(10).saturationMod(0.3f).meat().build()));
	}
}
