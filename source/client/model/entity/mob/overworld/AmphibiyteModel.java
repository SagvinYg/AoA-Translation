package net.tslat.aoa3.client.model.entity.mob.overworld;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.math.MathHelper;

public class AmphibiyteModel extends EntityModel<MobEntity> {
	private final ModelRenderer head;
	private final ModelRenderer body1;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg4;
	private final ModelRenderer body2;
	private final ModelRenderer leg3;
	private final ModelRenderer body3;
	private final ModelRenderer body4;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer body7;
	private final ModelRenderer head2;
	private final ModelRenderer head3;

	public AmphibiyteModel() {
		textureWidth = 128;
		textureHeight = 32;
		(head = new ModelRenderer(this, 89, 21)).addBox(3.0f, -6.0f, -8.0f, 0, 2, 8);
		head.setRotationPoint(0.0f, 14.0f, -8.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body1 = new ModelRenderer(this, 34, 0)).addBox(-5.0f, -10.0f, -4.0f, 10, 10, 4);
		body1.setRotationPoint(0.0f, 11.0f, 11.0f);
		body1.setTextureSize(128, 32);
		body1.mirror = true;
		setRotation(body1, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		leg1.setRotationPoint(-3.0f, 15.0f, 9.0f);
		leg1.setTextureSize(128, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 9, 4);
		leg2.setRotationPoint(3.0f, 15.0f, 9.0f);
		leg2.setTextureSize(128, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 68, 22)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leg4.setRotationPoint(-3.0f, 18.0f, -7.0f);
		leg4.setTextureSize(128, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 64, 5)).addBox(-7.0f, -6.0f, -2.0f, 7, 12, 2);
		body2.setRotationPoint(-5.0f, 12.0f, 0.0f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 68, 22)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leg3.setRotationPoint(3.0f, 18.0f, -7.0f);
		leg3.setTextureSize(128, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 116, 8)).addBox(0.0f, -9.0f, 0.0f, 0, 19, 4);
		body3.setRotationPoint(0.0f, 11.0f, 1.0f);
		body3.setTextureSize(128, 32);
		body3.mirror = true;
		setRotation(body3, 1.570796f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 102, 8)).addBox(-10.0f, -6.0f, 0.0f, 3, 12, 0);
		body4.setRotationPoint(-5.0f, 12.0f, 0.0f);
		body4.setTextureSize(128, 32);
		body4.mirror = true;
		setRotation(body4, 1.570796f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 83, 5)).addBox(0.0f, -6.0f, -2.0f, 7, 12, 2);
		body5.setRotationPoint(5.0f, 12.0f, 0.0f);
		body5.setTextureSize(128, 32);
		body5.mirror = true;
		setRotation(body5, 1.570796f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 109, 8)).addBox(7.0f, -6.0f, 0.0f, 3, 12, 0);
		body6.setRotationPoint(5.0f, 12.0f, 0.0f);
		body6.setTextureSize(128, 32);
		body6.mirror = true;
		setRotation(body6, 1.570796f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 28, 15)).addBox(-5.0f, -10.0f, -7.0f, 10, 10, 7);
		body7.setRotationPoint(0.0f, 11.0f, 1.0f);
		body7.setTextureSize(128, 32);
		body7.mirror = true;
		setRotation(body7, 1.570796f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -8.0f, 8, 5, 8);
		head2.setRotationPoint(0.0f, 14.0f, -8.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 89, 21)).addBox(-3.0f, -6.0f, -8.0f, 0, 2, 8);
		head3.setRotationPoint(0.0f, 14.0f, -8.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f) * 1.4f * limbSwingAmount;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662f + 3.1415927f) * 1.4f * limbSwingAmount;
		body4.rotateAngleZ = MathHelper.cos(ageInTicks * 0.1f) * 3.1415927f * 0.15f;
		body2.rotateAngleZ = MathHelper.cos(ageInTicks * 0.1f) * 3.1415927f * 0.15f;
		body5.rotateAngleZ = -body4.rotateAngleZ;
		body6.rotateAngleZ = -body4.rotateAngleZ;
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		head.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		leg3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		body7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		head3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
