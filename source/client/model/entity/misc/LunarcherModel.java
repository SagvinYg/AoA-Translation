package net.tslat.aoa3.client.model.entity.misc;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class LunarcherModel<T extends FlyingEntity> extends BipedModel<FlyingEntity> {
	public LunarcherModel() {
		super(0f, 0f, 64, 32);
	}

	@Override
	public void setLivingAnimations(FlyingEntity entity, float limbSwing, float limbSwingAmount, float partialTickTime) {
		this.rightArmPose = ArmPose.EMPTY;
		this.leftArmPose = ArmPose.EMPTY;
		ItemStack itemstack = entity.getHeldItem(Hand.MAIN_HAND);

		if (itemstack.getItem() instanceof BowItem && entity.isAggressive()) {
			if (entity.getPrimaryHand() == HandSide.RIGHT) {
				this.rightArmPose = ArmPose.BOW_AND_ARROW;
			}
			else {
				this.leftArmPose = ArmPose.BOW_AND_ARROW;
			}
		}

		super.setLivingAnimations(entity, limbSwing, limbSwingAmount, partialTickTime);
	}

	@Override
	public void setRotationAngles(FlyingEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		super.setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);

		ItemStack itemstack = entity.getHeldItemMainhand();

		if (entity.isAggressive() && (itemstack.isEmpty() || !(itemstack.getItem() instanceof BowItem))) {
			float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
			float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
			this.bipedRightArm.rotateAngleZ = 0.0F;
			this.bipedLeftArm.rotateAngleZ = 0.0F;
			this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
			this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
			this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F);
			this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F);
			this.bipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
			this.bipedLeftArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
			this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
			this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
			this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
			this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
		}
	}

	@Override
	public void translateHand(HandSide sideIn, MatrixStack matrixStackIn) {
		float rot = sideIn == HandSide.RIGHT ? 1.0F : -1.0F;
		ModelRenderer modelrenderer = this.getArmForSide(sideIn);
		modelrenderer.rotationPointX += rot;
		modelrenderer.translateRotate(matrixStackIn);
		modelrenderer.rotationPointX -= rot;
	}
}
