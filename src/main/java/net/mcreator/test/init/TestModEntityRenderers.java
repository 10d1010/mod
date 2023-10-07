
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.test.client.renderer.TestRenderer;
import net.mcreator.test.client.renderer.RoicreeperRenderer;
import net.mcreator.test.client.renderer.FirefishRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TestModEntities.TEST.get(), TestRenderer::new);
		event.registerEntityRenderer(TestModEntities.FIREFISH.get(), FirefishRenderer::new);
		event.registerEntityRenderer(TestModEntities.ROICREEPER.get(), RoicreeperRenderer::new);
	}
}
