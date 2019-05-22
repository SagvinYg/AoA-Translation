package net.tslat.aoa3.client.model.entities.mobs.creeponia;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelKingCreeper extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer leg1;
	ModelRenderer leg2;
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
	ModelRenderer head14;
	ModelRenderer head15;
	ModelRenderer head16;
	ModelRenderer head17;

	public ModelKingCreeper() {
		textureWidth = 64;
		textureHeight = 64;
		(head = new ModelRenderer(this, 33, 7)).addBox(3.5f, -13.0f, 2.0f, 1, 2, 1);
		head.setRotationPoint(0.0f, 6.0f, 0.0f);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body.setRotationPoint(0.0f, 6.0f, 0.0f);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0.0f, 0.0f, 0.0f);
		(leg3 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leg3.setRotationPoint(-2.0f, 18.0f, -4.0f);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		(leg4 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leg4.setRotationPoint(2.0f, 18.0f, -4.0f);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		(leg1 = new ModelRenderer(this, 0, 16)).addBox(0.0f, 0.0f, -2.0f, 4, 6, 4);
		leg1.setRotationPoint(-4.0f, 18.0f, 4.0f);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		(leg2 = new ModelRenderer(this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 6, 4);
		leg2.setRotationPoint(2.0f, 18.0f, 4.0f);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head2.setRotationPoint(0.0f, 6.0f, 0.0f);
		head2.setTextureSize(64, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 26, 0)).addBox(-4.0f, -11.0f, -4.0f, 8, 3, 1);
		head3.setRotationPoint(0.0f, 6.0f, -0.5f);
		head3.setTextureSize(64, 64);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 26, 0)).addBox(-4.0f, -11.0f, 3.5f, 8, 3, 1);
		head4.setRotationPoint(0.0f, 6.0f, 0.0f);
		head4.setTextureSize(64, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 33, 7)).addBox(-4.5f, -13.0f, 2.0f, 1, 2, 1);
		head5.setRotationPoint(0.0f, 6.0f, 0.0f);
		head5.setTextureSize(64, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 41, 0)).addBox(3.5f, -11.0f, -3.0f, 1, 3, 6);
		head6.setRotationPoint(0.0f, 6.0f, 0.0f);
		head6.setTextureSize(64, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 41, 0)).addBox(-4.5f, -11.0f, -3.0f, 1, 3, 6);
		head7.setRotationPoint(0.0f, 6.0f, 0.0f);
		head7.setTextureSize(64, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 33, 7)).addBox(3.5f, -13.0f, -1.0f, 1, 2, 2);
		head8.setRotationPoint(0.0f, 6.0f, 0.0f);
		head8.setTextureSize(64, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 33, 7)).addBox(-4.5f, -13.0f, -1.0f, 1, 2, 2);
		head9.setRotationPoint(0.0f, 6.0f, 0.0f);
		head9.setTextureSize(64, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 33, 7)).addBox(-1.0f, -13.0f, 3.5f, 2, 2, 1);
		head10.setRotationPoint(0.0f, 6.0f, 0.0f);
		head10.setTextureSize(64, 64);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 33, 7)).addBox(-4.5f, -13.0f, -3.0f, 1, 2, 1);
		head11.setRotationPoint(0.0f, 6.0f, 0.0f);
		head11.setTextureSize(64, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 33, 7)).addBox(3.5f, -13.0f, -3.0f, 1, 2, 1);
		head12.setRotationPoint(0.0f, 6.0f, 0.0f);
		head12.setTextureSize(64, 64);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 33, 7)).addBox(2.0f, -13.0f, 3.5f, 1, 2, 1);
		head13.setRotationPoint(0.0f, 6.0f, 0.0f);
		head13.setTextureSize(64, 64);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 33, 7)).addBox(-3.0f, -13.0f, 3.5f, 1, 2, 1);
		head14.setRotationPoint(0.0f, 6.0f, 0.0f);
		head14.setTextureSize(64, 64);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		(head15 = new ModelRenderer(this, 33, 7)).addBox(-3.0f, -13.0f, -4.0f, 1, 2, 1);
		head15.setRotationPoint(0.0f, 6.0f, -0.5f);
		head15.setTextureSize(64, 64);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		(head16 = new ModelRenderer(this, 33, 7)).addBox(-1.0f, -13.0f, -4.0f, 2, 2, 1);
		head16.setRotationPoint(0.0f, 6.0f, -0.5f);
		head16.setTextureSize(64, 64);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		(head17 = new ModelRenderer(this, 33, 7)).addBox(2.0f, -13.0f, -4.0f, 1, 2, 1);
		head17.setRotationPoint(0.0f, 6.0f, -0.5f);
		head17.setTextureSize(64, 64);
		head17.mirror = true;
		setRotation(head17, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg3.render(par7);
		leg4.render(par7);
		leg1.render(par7);
		leg2.render(par7);
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
		head14.render(par7);
		head15.render(par7);
		head16.render(par7);
		head17.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 57.295776f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 57.295776f;
		head3.rotateAngleY = par4 / 57.295776f;
		head3.rotateAngleX = par5 / 57.295776f;
		head4.rotateAngleY = par4 / 57.295776f;
		head4.rotateAngleX = par5 / 57.295776f;
		head5.rotateAngleY = par4 / 57.295776f;
		head5.rotateAngleX = par5 / 57.295776f;
		head6.rotateAngleY = par4 / 57.295776f;
		head6.rotateAngleX = par5 / 57.295776f;
		head7.rotateAngleY = par4 / 57.295776f;
		head7.rotateAngleX = par5 / 57.295776f;
		head8.rotateAngleY = par4 / 57.295776f;
		head8.rotateAngleX = par5 / 57.295776f;
		head9.rotateAngleY = par4 / 57.295776f;
		head9.rotateAngleX = par5 / 57.295776f;
		head10.rotateAngleY = par4 / 57.295776f;
		head10.rotateAngleX = par5 / 57.295776f;
		head11.rotateAngleY = par4 / 57.295776f;
		head11.rotateAngleX = par5 / 57.295776f;
		head12.rotateAngleY = par4 / 57.295776f;
		head12.rotateAngleX = par5 / 57.295776f;
		head13.rotateAngleY = par4 / 57.295776f;
		head13.rotateAngleX = par5 / 57.295776f;
		head14.rotateAngleY = par4 / 57.295776f;
		head14.rotateAngleX = par5 / 57.295776f;
		head15.rotateAngleY = par4 / 57.295776f;
		head15.rotateAngleX = par5 / 57.295776f;
		head16.rotateAngleY = par4 / 57.295776f;
		head16.rotateAngleX = par5 / 57.295776f;
		head17.rotateAngleY = par4 / 57.295776f;
		head17.rotateAngleX = par5 / 57.295776f;
		leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
	}
}
