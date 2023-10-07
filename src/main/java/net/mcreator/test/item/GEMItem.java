
package net.mcreator.test.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GEMItem extends Item {
	public GEMItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
