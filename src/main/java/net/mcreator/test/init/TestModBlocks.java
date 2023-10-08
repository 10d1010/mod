
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.test.block.SoudeurBlock;
import net.mcreator.test.block.PortailcelesteBlock;
import net.mcreator.test.block.OeufdetstBlock;
import net.mcreator.test.block.GemoreBlock;
import net.mcreator.test.block.EtherPortalBlock;
import net.mcreator.test.block.BraiseLogBlock;
import net.mcreator.test.block.BraiseLeavesBlock;
import net.mcreator.test.block.BlockcelesteBlock;
import net.mcreator.test.block.BlockaquaBlock;
import net.mcreator.test.block.AquaPortalBlock;
import net.mcreator.test.TestMod;

public class TestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MODID);
	public static final RegistryObject<Block> BLOCKAQUA = REGISTRY.register("blockaqua", () -> new BlockaquaBlock());
	public static final RegistryObject<Block> AQUA_PORTAL = REGISTRY.register("aqua_portal", () -> new AquaPortalBlock());
	public static final RegistryObject<Block> OEUFDETST = REGISTRY.register("oeufdetst", () -> new OeufdetstBlock());
	public static final RegistryObject<Block> BRAISE_LOG = REGISTRY.register("braise_log", () -> new BraiseLogBlock());
	public static final RegistryObject<Block> BRAISE_LEAVES = REGISTRY.register("braise_leaves", () -> new BraiseLeavesBlock());
	public static final RegistryObject<Block> GEMORE = REGISTRY.register("gemore", () -> new GemoreBlock());
	public static final RegistryObject<Block> SOUDEUR = REGISTRY.register("soudeur", () -> new SoudeurBlock());
	public static final RegistryObject<Block> ETHER_PORTAL = REGISTRY.register("ether_portal", () -> new EtherPortalBlock());
	public static final RegistryObject<Block> BLOCKCELESTE = REGISTRY.register("blockceleste", () -> new BlockcelesteBlock());
	public static final RegistryObject<Block> PORTAILCELESTE = REGISTRY.register("portailceleste", () -> new PortailcelesteBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			BlockaquaBlock.blockColorLoad(event);
			OeufdetstBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			BlockaquaBlock.itemColorLoad(event);
			OeufdetstBlock.itemColorLoad(event);
		}
	}
}
