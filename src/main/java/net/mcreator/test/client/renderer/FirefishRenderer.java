
package net.mcreator.test.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.test.entity.FirefishEntity;

public class FirefishRenderer extends MobRenderer<FirefishEntity, SilverfishModel<FirefishEntity>> {
	public FirefishRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FirefishEntity entity) {
		return new ResourceLocation("test:textures/entities/firefish.png");
	}
}
