package net.tslat.aoa3.client.model.entity.mob.shyrelands;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.MobEntity;

public class OmnilightModel extends EntityModel<MobEntity> {
	private final ModelRenderer r1;
	private final ModelRenderer Eye;
	private final ModelRenderer r5;
	private final ModelRenderer r3;
	private final ModelRenderer r4;
	private final ModelRenderer r2;
	private final ModelRenderer r6;
	private final ModelRenderer r7;
	private final ModelRenderer r8;

	public OmnilightModel() {
		textureWidth = 64;
		textureHeight = 64;

		r1 = new ModelRenderer(this, 7, 19);
		r1.addBox(6.0F, -7.0F, -1.0F, 1, 14, 2);
		r1.setRotationPoint(0.0F, 16.0F, 0.0F);
		r1.setTextureSize(64, 32);
		r1.mirror = true;
		setRotation(r1, 0.0F, 0.0F, 0.0F);
		Eye = new ModelRenderer(this, 0, 0);
		Eye.addBox(-2.0F, -2.0F, -2.0F, 4, 4, 4);
		Eye.setRotationPoint(0.0F, 16.0F, 0.0F);
		Eye.setTextureSize(64, 32);
		Eye.mirror = true;
		setRotation(Eye, 0.0F, 0.0F, 0.0F);
		r5 = new ModelRenderer(this, 36, 25);
		r5.addBox(-1.0F, -4.0F, 4.0F, 2, 8, 1);
		r5.setRotationPoint(0.0F, 16.0F, 0.0F);
		r5.setTextureSize(64, 32);
		r5.mirror = true;
		setRotation(r5, 0.0F, 0.0F, 0.0F);
		r3 = new ModelRenderer(this, 0, 15);
		r3.addBox(-6.0F, 6.0F, -1.0F, 12, 1, 2);
		r3.setRotationPoint(0.0F, 16.0F, 0.0F);
		r3.setTextureSize(64, 32);
		r3.mirror = true;
		setRotation(r3, 0.0F, 0.0F, 0.0F);
		r4 = new ModelRenderer(this, 0, 19);
		r4.addBox(-7.0F, -7.0F, -1.0F, 1, 14, 2);
		r4.setRotationPoint(0.0F, 16.0F, 0.0F);
		r4.setTextureSize(64, 32);
		r4.mirror = true;
		setRotation(r4, 0.0F, 0.0F, 0.0F);
		r2 = new ModelRenderer(this, 0, 10);
		r2.addBox(-6.0F, -7.0F, -1.0F, 12, 1, 2);
		r2.setRotationPoint(0.0F, 16.0F, 0.0F);
		r2.setTextureSize(64, 32);
		r2.mirror = true;
		setRotation(r2, 0.0F, 0.0F, 0.0F);
		r6 = new ModelRenderer(this, 29, 1);
		r6.addBox(-1.0F, -5.0F, -5.0F, 2, 1, 10);
		r6.setRotationPoint(0.0F, 16.0F, 0.0F);
		r6.setTextureSize(64, 32);
		r6.mirror = true;
		setRotation(r6, 0.0F, 0.0F, 0.0F);
		r7 = new ModelRenderer(this, 29, 13);
		r7.addBox(-1.0F, 4.0F, -5.0F, 2, 1, 10);
		r7.setRotationPoint(0.0F, 16.0F, 0.0F);
		r7.setTextureSize(64, 32);
		r7.mirror = true;
		setRotation(r7, 0.0F, 0.0F, 0.0F);
		r8 = new ModelRenderer(this, 29, 25);
		r8.addBox(-1.0F, -4.0F, -5.0F, 2, 8, 1);
		r8.setRotationPoint(0.0F, 16.0F, 0.0F);
		r8.setTextureSize(64, 32);
		r8.mirror = true;
		setRotation(r8, 0.0F, 0.0F, 0.0F);
	}

	@Override
	public void render(MatrixStack matrix, IVertexBuilder buffer, int light, int overlay, float red, float green, float blue, float alpha) {
		r1.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		Eye.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r5.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r3.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r4.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r2.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r6.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r7.render(matrix, buffer, light, overlay, red, green, blue, alpha);
		r8.render(matrix, buffer, light, overlay, red, green, blue, alpha);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void setRotationAngles(MobEntity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		r1.rotateAngleY = (ageInTicks * 0.067F * 1.25F);
		r2.rotateAngleY = (ageInTicks * 0.067F * 1.25F);
		r3.rotateAngleY = (ageInTicks * 0.067F * 1.25F);
		r4.rotateAngleY = (ageInTicks * 0.067F * 1.25F);
		r5.rotateAngleY = (ageInTicks * -0.167F * 1.25F);
		r6.rotateAngleY = (ageInTicks * -0.167F * 1.25F);
		r7.rotateAngleY = (ageInTicks * -0.167F * 1.25F);
		r8.rotateAngleY = (ageInTicks * -0.167F * 1.25F);
	}
}
