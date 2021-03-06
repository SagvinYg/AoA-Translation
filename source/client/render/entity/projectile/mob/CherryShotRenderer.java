package net.tslat.aoa3.client.render.entity.projectile.mob;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.tslat.aoa3.client.render.entity.projectile.ParticleProjectileRenderer;
import net.tslat.aoa3.common.registration.AoAParticleTypes;
import net.tslat.aoa3.entity.projectile.mob.CherryShotEntity;
import net.tslat.aoa3.library.misc.CustomisableParticleType;
import net.tslat.aoa3.util.NumberUtil;

public class CherryShotRenderer extends ParticleProjectileRenderer<CherryShotEntity> {
	public CherryShotRenderer(final EntityRendererManager manager) {
		super(manager);
	}

	@Override
	protected void addParticles(CherryShotEntity entity, float partialTicks) {
		entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SWIRLY.get(), 1, 3, NumberUtil.RGB(255, 0, 0)), entity.getPosX(), entity.getPosY() + 0.2f, entity.getPosZ(), 0, 0, 0);
		entity.world.addParticle(new CustomisableParticleType.Data(AoAParticleTypes.SWIRLY.get(), 1, 3, NumberUtil.RGB(0, 255, 0)), entity.getPosX(), entity.getPosY() - 0.2f, entity.getPosZ(), 0, 0, 0);
	}
}
