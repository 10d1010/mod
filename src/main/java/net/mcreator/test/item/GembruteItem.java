
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GembruteItem extends Item {
	public GembruteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
