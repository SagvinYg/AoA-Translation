package net.tslat.aoa3.client.model.entities.mobs.nether;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelNethengeicBeast extends ModelBase {
	ModelRenderer body;
	ModelRenderer leg1p1;
	ModelRenderer leg2p1;
	ModelRenderer leg3p1;
	ModelRenderer leg4p1;
	ModelRenderer leg3p2;
	ModelRenderer leg4p2;
	ModelRenderer leg1p2;
	ModelRenderer leg2p2;
	ModelRenderer head1;
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

	public ModelNethengeicBeast() {
		textureWidth = 128;
		textureHeight = 32;
		(body = new ModelRenderer(this, 33, 8)).addBox(-5.0f, -10.0f, -7.0f, 10, 16, 8);
		body.setRotationPoint(0.0f, 8.0f, 2.0f);
		body.setTextureSize(128, 32);
		body.mirror = true;
		setRotation(body, 1.745329f, 0.0f, 0.0f);
		(leg1p1 = new ModelRenderer(this, 113, 16)).addBox(-1.6f, 5.0f, -4.0f, 3, 5, 4);
		leg1p1.setRotationPoint(-3.0f, 14.0f, 7.0f);
		leg1p1.setTextureSize(128, 32);
		leg1p1.mirror = true;
		setRotation(leg1p1, 0.2094395f, 0.0f, 0.0f);
		(leg2p1 = new ModelRenderer(this, 113, 16)).addBox(-1.4f, 5.0f, -4.0f, 3, 5, 4);
		leg2p1.setRotationPoint(3.0f, 14.0f, 7.0f);
		leg2p1.setTextureSize(128, 32);
		leg2p1.mirror = true;
		setRotation(leg2p1, 0.2094395f, 0.0f, 0.0f);
		(leg3p1 = new ModelRenderer(this, 97, 16)).addBox(-1.6f, 5.0f, -4.0f, 3, 4, 4);
		leg3p1.setRotationPoint(-3.0f, 15.0f, -5.0f);
		leg3p1.setTextureSize(128, 32);
		leg3p1.mirror = true;
		setRotation(leg3p1, 0.2094395f, 0.0f, 0.0f);
		(leg4p1 = new ModelRenderer(this, 97, 16)).addBox(-1.4f, 5.0f, -4.0f, 3, 4, 4);
		leg4p1.setRotationPoint(3.0f, 15.0f, -5.0f);
		leg4p1.setTextureSize(128, 32);
		leg4p1.mirror = true;
		setRotation(leg4p1, 0.2094395f, 0.0f, 0.0f);
		(leg3p2 = new ModelRenderer(this, 71, 16)).addBox(-2.1f, 0.0f, -2.0f, 4, 6, 4);
		leg3p2.setRotationPoint(-3.0f, 15.0f, -5.0f);
		leg3p2.setTextureSize(128, 32);
		leg3p2.mirror = true;
		setRotation(leg3p2, -0.2094395f, 0.0f, 0.0f);
		(leg4p2 = new ModelRenderer(this, 71, 16)).addBox(-1.9f, 0.0f, -2.0f, 4, 6, 4);
		leg4p2.setRotationPoint(3.0f, 15.0f, -5.0f);
		leg4p2.setTextureSize(128, 32);
		leg4p2.mirror = true;
		setRotation(leg4p2, -0.2094395f, 0.0f, 0.0f);
		(leg1p2 = new ModelRenderer(this, 71, 16)).addBox(-2.1f, 0.0f, -2.0f, 4, 6, 4);
		leg1p2.setRotationPoint(-3.0f, 14.0f, 7.0f);
		leg1p2.setTextureSize(128, 32);
		leg1p2.mirror = true;
		setRotation(leg1p2, -0.2094395f, 0.0f, 0.0f);
		(leg2p2 = new ModelRenderer(this, 71, 16)).addBox(-1.9f, 0.0f, -2.0f, 4, 6, 4);
		leg2p2.setRotationPoint(3.0f, 14.0f, 7.0f);
		leg2p2.setTextureSize(128, 32);
		leg2p2.mirror = true;
		setRotation(leg2p2, -0.2094395f, 0.0f, 0.0f);
		(head1 = new ModelRenderer(this, 71, 0)).addBox(-3.0f, -3.0f, -11.0f, 6, 5, 4);
		head1.setRotationPoint(0.0f, 12.0f, -6.0f);
		head1.setTextureSize(128, 32);
		head1.mirror = true;
		setRotation(head1, 0.2268928f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 17)).addBox(-2.0f, -1.5f, -9.0f, 4, 2, 7);
		head2.setRotationPoint(0.0f, 10.0f, -6.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, -0.1745329f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 14, 27)).addBox(-3.0f, -3.1f, -10.0f, 6, 2, 2);
		head3.setRotationPoint(0.0f, 10.0f, -6.0f);
		head3.setTextureSize(128, 32);
		head3.mirror = true;
		setRotation(head3, 0.0f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 0, 27)).addBox(6.0f, -3.5f, -12.0f, 3, 2, 2);
		head4.setRotationPoint(0.0f, 10.0f, -6.0f);
		head4.setTextureSize(128, 32);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 62, 0)).addBox(1.0f, -8.0f, -12.0f, 2, 4, 1);
		head5.setRotationPoint(0.0f, 10.0f, -6.0f);
		head5.setTextureSize(128, 32);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 20, 16)).addBox(-9.0f, -3.5f, -12.0f, 3, 2, 2);
		head6.setRotationPoint(0.0f, 10.0f, -6.0f);
		head6.setTextureSize(128, 32);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 94, 0)).addBox(-6.0f, -4.0f, -13.0f, 12, 3, 4);
		head7.setRotationPoint(0.0f, 10.0f, -6.0f);
		head7.setTextureSize(128, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 37, 0)).addBox(-12.0f, -4.0f, -12.0f, 3, 3, 3);
		head8.setRotationPoint(0.0f, 10.0f, -6.0f);
		head8.setTextureSize(128, 32);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 37, 0)).addBox(9.0f, -4.0f, -12.0f, 3, 3, 3);
		head9.setRotationPoint(0.0f, 10.0f, -6.0f);
		head9.setTextureSize(128, 32);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 54, 0)).addBox(4.0f, -7.0f, -12.0f, 2, 3, 1);
		head10.setRotationPoint(0.0f, 10.0f, -6.0f);
		head10.setTextureSize(128, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 54, 0)).addBox(-6.0f, -7.0f, -12.0f, 2, 3, 1);
		head11.setRotationPoint(0.0f, 10.0f, -6.0f);
		head11.setTextureSize(128, 32);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 62, 0)).addBox(-3.0f, -8.0f, -12.0f, 2, 4, 1);
		head12.setRotationPoint(0.0f, 10.0f, -6.0f);
		head12.setTextureSize(128, 32);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -4.0f, -8.0f, 8, 7, 8);
		head13.setRotationPoint(0.0f, 12.0f, -6.0f);
		head13.setTextureSize(128, 32);
		head13.mirror = true;
		setRotation(head13, 0.1745329f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		body.render(par7);
		leg1p1.render(par7);
		leg2p1.render(par7);
		leg3p1.render(par7);
		leg4p1.render(par7);
		leg3p2.render(par7);
		leg4p2.render(par7);
		leg1p2.render(par7);
		leg2p2.render(par7);
		head1.render(par7);
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
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		leg1p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2 + 0.2094f;
		leg1p1.rotateAngleY = 0.2094f;
		leg1p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2 - 0.2094f;
		leg1p2.rotateAngleY = 0.0f;
		leg3p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		leg3p1.rotateAngleY = 0.2094f;
		leg3p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2 - 0.2094f;
		leg3p2.rotateAngleY = 0.0f;
		leg2p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2 + 0.2094f;
		leg2p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2 - 0.2094f;
		leg4p1.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2 + 0.2094f;
		leg4p2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2 - 0.2094f;
	}
}
