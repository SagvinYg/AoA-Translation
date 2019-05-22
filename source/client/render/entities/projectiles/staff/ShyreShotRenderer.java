package net.tslat.aoa3.client.render.entities.projectiles.staff;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.fx.FXFlickeringFluffyTrail;
import net.tslat.aoa3.entity.projectiles.staff.EntityShyreShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class ShyreShotRenderer extends Render<EntityShyreShot> {
	private final ResourceLocation texture;

	public ShyreShotRenderer(final RenderManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void doRender(EntityShyreShot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		for (int i = 0; i < 3; i++) {
			new FXFlickeringFluffyTrail(entity.world, entity.posX, entity.posY + 0.25d, entity.posZ, 0, 0, 0, Enums.RGBIntegers.CYAN, 3).create();
		}
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityShyreShot entity) {
		return texture;
	}
}
