package net.tslat.aoa3.client.render.entities.projectiles.mob;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.tslat.aoa3.client.fx.FXFluffyTrail;
import net.tslat.aoa3.entity.projectiles.mob.EntityBlueGuardianShot;
import net.tslat.aoa3.library.Enums;

import javax.annotation.Nullable;

public class BlueGuardianShotRenderer extends Render<EntityBlueGuardianShot> {
	private final ResourceLocation texture;

	public BlueGuardianShotRenderer(final RenderManager manager, final ResourceLocation textureResource) {
		super(manager);
		texture = textureResource;
	}

	@Override
	public void doRender(EntityBlueGuardianShot entity, double x, double y, double z, float entityYaw, float partialTicks) {
		new FXFluffyTrail(entity.world, entity.posX, entity.posY, entity.posZ, 0, 0, 0, Enums.RGBIntegers.BLUE, 5).create();
	}

	@Nullable
	@Override
	protected ResourceLocation getEntityTexture(EntityBlueGuardianShot entity) {
		return texture;
	}
}
