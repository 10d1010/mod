
package net.mcreator.test.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.test.entity.RoicreeperEntity;

public class RoicreeperRenderer extends MobRenderer<RoicreeperEntity, CreeperModel<RoicreeperEntity>> {
	public RoicreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoicreeperEntity entity) {
		return new ResourceLocation("test:textures/entities/telechargement.png");
	}
}
