
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MODID);
	public static final RegistryObject<CreativeModeTab> CELESTE = REGISTRY.register("celeste",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.test.celeste")).icon(() -> new ItemStack(TestModBlocks.BLOCKCELESTE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TestModBlocks.BLOCKCELESTE.get().asItem());
				tabData.accept(TestModBlocks.PORTAILCELESTE.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(TestModItems.GE_MARMOR_ARMOR_HELMET.get());
			tabData.accept(TestModItems.GE_MARMOR_ARMOR_CHESTPLATE.get());
			tabData.accept(TestModItems.GE_MARMOR_ARMOR_LEGGINGS.get());
			tabData.accept(TestModItems.GE_MARMOR_ARMOR_BOOTS.get());
			tabData.accept(TestModItems.EPEECHARGER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TestModItems.TEST_SPAWN_EGG.get());
			tabData.accept(TestModItems.FIREFISH_SPAWN_EGG.get());
			tabData.accept(TestModBlocks.OEUFDETST.get().asItem());
			tabData.accept(TestModItems.ROICREEPER_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TestModItems.AME.get());
			tabData.accept(TestModItems.GEM.get());
			tabData.accept(TestModItems.GEMBRUTE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TestModItems.AQUA.get());
			tabData.accept(TestModItems.CUTSTON.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TestModItems.BURGER.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TestModBlocks.BRAISE_LEAVES.get().asItem());
			tabData.accept(TestModBlocks.GEMORE.get().asItem());
		}
	}
}
