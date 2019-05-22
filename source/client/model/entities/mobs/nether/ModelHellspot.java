package net.tslat.aoa3.client.model.entities.mobs.nether;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelHellspot extends ModelBase {
	ModelRenderer body;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer body10;
	ModelRenderer body11;
	ModelRenderer body12;
	ModelRenderer body13;
	ModelRenderer head2;
	ModelRenderer leg4p2;
	ModelRenderer leg3p2;
	ModelRenderer leg4p3;
	ModelRenderer leg3p3;
	ModelRenderer leg4p4;
	ModelRenderer leg4p5;
	ModelRenderer leg3p5;
	ModelRenderer leg3p4;
	ModelRenderer head;
	ModelRenderer body14;
	ModelRenderer body15;

	public ModelHellspot() {
		textureWidth = 64;
		textureHeight = 64;
		(body = new ModelRenderer(this, 39, 43)).addBox(3.0f, -5.0f, 9.0f, 3, 16, 3);
		body.setRotationPoint(0.0f, 13.0f, -1.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 32)).addBox(1.0f, 7.0f, -5.0f, 1, 3, 1);
		leg3.setRotationPoint(-3.0f, 14.0f, -5.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 32)).addBox(3.0f, 7.0f, -5.0f, 1, 3, 1);
		leg4.setRotationPoint(3.0f, 14.0f, -5.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 18, 15)).addBox(6.0f, -12.0f, -7.0f, 0, 4, 19);
		body2.setRotationPoint(0.0f, 13.0f, -1.0f);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 39, 43)).addBox(-1.5f, -5.0f, 9.0f, 3, 16, 3);
		body3.setRotationPoint(0.0f, 13.0f, -1.0f);
		body3.setTextureSize(64, 64);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 39, 43)).addBox(-6.0f, -5.0f, 9.0f, 3, 16, 3);
		body4.setRotationPoint(0.0f, 13.0f, -1.0f);
		body4.setTextureSize(64, 64);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 39, 43)).addBox(-1.5f, -8.0f, 3.0f, 3, 3, 9);
		body5.setRotationPoint(0.0f, 13.0f, -1.0f);
		body5.setTextureSize(64, 64);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 39, 43)).addBox(3.0f, -8.0f, 3.0f, 3, 3, 9);
		body6.setRotationPoint(0.0f, 13.0f, -1.0f);
		body6.setTextureSize(64, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 39, 43)).addBox(-6.0f, -8.0f, 3.0f, 3, 3, 9);
		body7.setRotationPoint(0.0f, 13.0f, -1.0f);
		body7.setTextureSize(64, 64);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 39, 43)).addBox(-1.5f, -2.0f, 3.0f, 3, 3, 5);
		body8.setRotationPoint(0.0f, 13.0f, -1.0f);
		body8.setTextureSize(64, 64);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 39, 43)).addBox(3.0f, -2.0f, 3.0f, 3, 3, 5);
		body9.setRotationPoint(0.0f, 13.0f, -1.0f);
		body9.setTextureSize(64, 64);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(body10 = new ModelRenderer(this, 39, 43)).addBox(-6.0f, -2.0f, 3.0f, 3, 3, 5);
		body10.setRotationPoint(0.0f, 13.0f, -1.0f);
		body10.setTextureSize(64, 64);
		body10.mirror = true;
		setRotation(body10, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 39, 43)).addBox(-1.5f, 1.0f, 5.0f, 3, 10, 3);
		body11.setRotationPoint(0.0f, 13.0f, -1.0f);
		body11.setTextureSize(64, 64);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 39, 43)).addBox(3.0f, 1.0f, 5.0f, 3, 10, 3);
		body12.setRotationPoint(0.0f, 13.0f, -1.0f);
		body12.setTextureSize(64, 64);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, 0.0f);
		(body13 = new ModelRenderer(this, 39, 43)).addBox(-6.0f, 1.0f, 5.0f, 3, 10, 3);
		body13.setRotationPoint(0.0f, 13.0f, -1.0f);
		body13.setTextureSize(64, 64);
		body13.mirror = true;
		setRotation(body13, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-5.0f, -4.0f, -2.0f, 10, 12, 2);
		head2.setRotationPoint(0.0f, 4.0f, -8.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 10, 4);
		leg4p2.setRotationPoint(3.0f, 14.0f, -5.0f);
		leg4p2.setTextureSize(64, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 10, 4);
		leg3p2.setRotationPoint(-3.0f, 14.0f, -5.0f);
		leg3p2.setTextureSize(64, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		(leg4p3 = new ModelRenderer(this, 0, 32)).addBox(-2.0f, 7.0f, -5.0f, 1, 3, 1);
		leg4p3.setRotationPoint(3.0f, 14.0f, -5.0f);
		leg4p3.setTextureSize(64, 64);
		leg4p3.mirror = true;
		setRotation(leg4p3, 0.0f, 0.0f, 0.0f);
		(leg3p3 = new ModelRenderer(this, 0, 32)).addBox(-4.0f, 7.0f, -5.0f, 1, 3, 1);
		leg3p3.setRotationPoint(-3.0f, 14.0f, -5.0f);
		leg3p3.setTextureSize(64, 64);
		leg3p3.mirror = true;
		setRotation(leg3p3, 0.0f, 0.0f, 0.0f);
		(leg4p4 = new ModelRenderer(this, 0, 32)).addBox(-2.0f, 6.0f, -5.0f, 1, 1, 6);
		leg4p4.setRotationPoint(3.0f, 14.0f, -5.0f);
		leg4p4.setTextureSize(64, 64);
		leg4p4.mirror = true;
		setRotation(leg4p4, 0.0f, 0.0f, 0.0f);
		(leg4p5 = new ModelRenderer(this, 0, 32)).addBox(3.0f, 6.0f, -5.0f, 1, 1, 6);
		leg4p5.setRotationPoint(3.0f, 14.0f, -5.0f);
		leg4p5.setTextureSize(64, 64);
		leg4p5.mirror = true;
		setRotation(leg4p5, 0.0f, 0.0f, 0.0f);
		(leg3p5 = new ModelRenderer(this, 0, 32)).addBox(1.0f, 6.0f, -5.0f, 1, 1, 6);
		leg3p5.setRotationPoint(-3.0f, 14.0f, -5.0f);
		leg3p5.setTextureSize(64, 64);
		leg3p5.mirror = true;
		setRotation(leg3p5, 0.0f, 0.0f, 0.0f);
		(leg3p4 = new ModelRenderer(this, 0, 32)).addBox(-4.0f, 6.0f, -5.0f, 1, 1, 6);
		leg3p4.setRotationPoint(-3.0f, 14.0f, -5.0f);
		leg3p4.setTextureSize(64, 64);
		leg3p4.mirror = true;
		setRotation(leg3p4, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 41)).addBox(-9.0f, -8.0f, -1.0f, 18, 21, 0);
		head.setRotationPoint(0.0f, 4.0f, -8.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 18, 6)).addBox(-6.0f, -8.0f, -7.0f, 12, 9, 10);
		body14.setRotationPoint(0.0f, 13.0f, -1.0f);
		body14.setTextureSize(64, 64);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 18, 15)).addBox(-6.0f, -12.0f, -7.0f, 0, 4, 19);
		body15.setRotationPoint(0.0f, 13.0f, -1.0f);
		body15.setTextureSize(64, 64);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		body10.render(par7);
		body11.render(par7);
		body12.render(par7);
		body13.render(par7);
		head2.render(par7);
		leg4p2.render(par7);
		leg3p2.render(par7);
		leg4p3.render(par7);
		leg3p3.render(par7);
		leg4p4.render(par7);
		leg4p5.render(par7);
		leg3p5.render(par7);
		leg3p4.render(par7);
		head.render(par7);
		body14.render(par7);
		body15.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p2.rotateAngleY = 0.0f;
		leg3p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p3.rotateAngleY = 0.0f;
		leg3p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p4.rotateAngleY = 0.0f;
		leg3p5.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p5.rotateAngleY = 0.0f;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4p5.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
