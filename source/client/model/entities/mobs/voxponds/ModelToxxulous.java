package net.tslat.aoa3.client.model.entities.mobs.voxponds;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelToxxulous extends ModelBase {
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer head;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer head8;
	ModelRenderer head9;
	ModelRenderer head10;
	ModelRenderer head11;
	ModelRenderer head12;
	ModelRenderer head13;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;

	public ModelToxxulous() {
		textureWidth = 128;
		textureHeight = 32;
		(body = new ModelRenderer(this, 65, 19)).addBox(6.0f, 0.0f, -4.0f, 1, 6, 6);
		body.setRotationPoint(0.0f, 9.0f, 8.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 1.570796f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -2.0f, 4, 8, 4);
		leg1.setRotationPoint(-3.0f, 16.0f, 13.0f);
		leg1.setTextureSize(128, 32);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -2.0f, 4, 8, 4);
		leg2.setRotationPoint(3.0f, 16.0f, 13.0f);
		leg2.setTextureSize(128, 32);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-3.0f, 0.0f, -3.0f, 4, 8, 4);
		leg3.setRotationPoint(-3.0f, 16.0f, 1.0f);
		leg3.setTextureSize(128, 32);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-1.0f, 0.0f, -3.0f, 4, 8, 4);
		leg4.setRotationPoint(3.0f, 16.0f, 1.0f);
		leg4.setTextureSize(128, 32);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 65, 4)).addBox(-1.0f, 0.0f, -9.0f, 3, 3, 9);
		head.setRotationPoint(4.5f, 11.5f, -2.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.1745329f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 114, 15)).addBox(-4.0f, -12.0f, -12.5f, 1, 10, 3);
		head2.setRotationPoint(1.5f, 8.0f, -5.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, -2.268928f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 81, 20)).addBox(-3.0f, -8.0f, -4.0f, 4, 8, 4);
		head3.setRotationPoint(1.0f, 8.0f, -5.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, -0.7853982f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 99, 21)).addBox(-3.0f, -11.0f, -8.5f, 3, 8, 3);
		head4.setRotationPoint(1.5f, 8.0f, -5.0f);
		head4.setTextureSize(128, 32);
		head4.mirror = true;
		setRotation(head4, -1.570796f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 114, 15)).addBox(0.0f, -12.0f, -12.5f, 1, 10, 3);
		head5.setRotationPoint(1.5f, 8.0f, -5.0f);
		head5.setTextureSize(128, 32);
		head5.mirror = true;
		setRotation(head5, -2.268928f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 6);
		head6.setRotationPoint(0.0f, 8.0f, -2.0f);
		head6.setTextureSize(128, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 65, 4)).addBox(-5.0f, 0.0f, -9.0f, 3, 3, 9);
		head7.setRotationPoint(-1.5f, 11.5f, -2.0f);
		head7.setTextureSize(128, 32);
		head7.mirror = true;
		setRotation(head7, 0.1745329f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 91, 10)).addBox(0.0f, -4.0f, -8.0f, 2, 2, 8);
		head8.setRotationPoint(4.0f, 11.0f, -2.0f);
		head8.setTextureSize(128, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 91, 10)).addBox(-4.0f, -4.0f, -8.0f, 2, 2, 8);
		head9.setRotationPoint(-2.0f, 11.0f, -2.0f);
		head9.setTextureSize(128, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 100, 2)).addBox(0.0f, -9.0f, -6.0f, 1, 1, 5);
		head10.setRotationPoint(4.5f, 11.5f, -2.0f);
		head10.setTextureSize(128, 32);
		head10.mirror = true;
		setRotation(head10, 0.9599311f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 100, 2)).addBox(-4.0f, -9.0f, -6.0f, 1, 1, 5);
		head11.setRotationPoint(-1.5f, 11.5f, -2.0f);
		head11.setTextureSize(128, 32);
		head11.mirror = true;
		setRotation(head11, 0.9599311f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 84, 2)).addBox(0.0f, -9.0f, 3.0f, 2, 2, 5);
		head12.setRotationPoint(4.0f, 11.0f, -2.0f);
		head12.setTextureSize(128, 32);
		head12.mirror = true;
		setRotation(head12, 2.356194f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 84, 2)).addBox(-4.0f, -9.0f, 3.0f, 2, 2, 5);
		head13.setRotationPoint(-2.0f, 11.0f, -2.0f);
		head13.setTextureSize(128, 32);
		head13.mirror = true;
		setRotation(head13, 2.356194f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 18, 4)).addBox(-6.0f, -10.0f, -7.0f, 12, 18, 10);
		body2.setRotationPoint(0.0f, 9.0f, 8.0f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 1.570796f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 65, 19)).addBox(6.0f, -8.0f, -5.0f, 1, 6, 6);
		body3.setRotationPoint(0.0f, 9.0f, 8.0f);
		body3.setTextureSize(128, 32);
		body3.mirror = true;
		setRotation(body3, 1.570796f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 65, 19)).addBox(-7.0f, 0.0f, -4.0f, 1, 6, 6);
		body4.setRotationPoint(0.0f, 9.0f, 8.0f);
		body4.setTextureSize(128, 32);
		body4.mirror = true;
		setRotation(body4, 1.570796f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 65, 19)).addBox(-7.0f, -8.0f, -5.0f, 1, 6, 6);
		body5.setRotationPoint(0.0f, 9.0f, 8.0f);
		body5.setTextureSize(128, 32);
		body5.mirror = true;
		setRotation(body5, 1.570796f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		head.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		head6.render(par7);
		head7.render(par7);
		head8.render(par7);
		head9.render(par7);
		head10.render(par7);
		head11.render(par7);
		head12.render(par7);
		head13.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
