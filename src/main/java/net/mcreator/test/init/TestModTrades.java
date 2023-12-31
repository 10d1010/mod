
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class TestModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == TestModVillagerProfessions.CHAMANV.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(TestModItems.AME.get(), 10),

					new ItemStack(Items.EMERALD), 128, 1, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(TestModBlocks.OEUFDETST.get()), new ItemStack(Blocks.EMERALD_BLOCK, 30), new ItemStack(TestModItems.TEST_SPAWN_EGG.get()), 10, 5, 0.05f));
		}
	}
}
