package net.tslat.aoa3.client.model.entities.boss.nethengeicwither;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelNethengeicWither extends ModelBase {
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer head1;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;
	ModelRenderer body7;
	ModelRenderer body8;
	ModelRenderer body9;
	ModelRenderer head10;
	ModelRenderer head;
	ModelRenderer head2;
	ModelRenderer body11;
	ModelRenderer body12;
	ModelRenderer body13;
	ModelRenderer body14;
	ModelRenderer head7;
	ModelRenderer body15;

	public ModelNethengeicWither() {
		textureWidth = 128;
		textureHeight = 32;
		(body1 = new ModelRenderer(this, 3, 21)).addBox(-1.5f, 0.0f, -2.0f, 3, 9, 2);
		body1.setRotationPoint(3.0f, 14.0f, 0.0f);
		body1.setTextureSize(128, 32);
		body1.mirror = true;
		setRotation(body1, 0.2617994f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 34, 25)).addBox(-2.0f, 0.0f, -2.0f, 8, 3, 2);
		body2.setRotationPoint(-13.0f, -2.0f, 2.0f);
		body2.setTextureSize(128, 32);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, -1.570796f);
		(body3 = new ModelRenderer(this, 1, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 2);
		body3.setRotationPoint(-7.0f, 12.0f, 0.0f);
		body3.setTextureSize(128, 32);
		body3.mirror = true;
		setRotation(body3, 0.0f, 0.0f, 0.0f);
		(head1 = new ModelRenderer(this, 34, 0)).addBox(-3.0f, -6.0f, -3.0f, 6, 6, 6);
		head1.setRotationPoint(11.0f, 4.0f, -3.0f);
		head1.setTextureSize(128, 32);
		head1.mirror = true;
		setRotation(head1, 0.0f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 59, 1)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 2);
		body4.setRotationPoint(3.0f, 4.0f, 0.0f);
		body4.setTextureSize(128, 32);
		body4.mirror = true;
		setRotation(body4, 0.0f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 2);
		body5.setRotationPoint(7.0f, 12.0f, 0.0f);
		body5.setTextureSize(128, 32);
		body5.mirror = true;
		setRotation(body5, 0.0f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 1, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 2);
		body6.setRotationPoint(-7.0f, 6.0f, 0.0f);
		body6.setTextureSize(128, 32);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
		(body7 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 2);
		body7.setRotationPoint(7.0f, 6.0f, 0.0f);
		body7.setTextureSize(128, 32);
		body7.mirror = true;
		setRotation(body7, 0.0f, 0.0f, 0.0f);
		(body8 = new ModelRenderer(this, 1, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 2);
		body8.setRotationPoint(-7.0f, 9.0f, 0.0f);
		body8.setTextureSize(128, 32);
		body8.mirror = true;
		setRotation(body8, 0.0f, 0.0f, 0.0f);
		(body9 = new ModelRenderer(this, 16, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 2, 2);
		body9.setRotationPoint(7.0f, 9.0f, 0.0f);
		body9.setTextureSize(128, 32);
		body9.mirror = true;
		setRotation(body9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 34, 0)).addBox(-3.0f, -6.0f, -3.0f, 6, 6, 6);
		head10.setRotationPoint(-11.0f, 4.0f, -3.0f);
		head10.setTextureSize(128, 32);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		(head = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -8.0f, -5.0f, 8, 8, 8);
		head.setRotationPoint(0.0f, 1.0f, -1.0f);
		head.setTextureSize(128, 32);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 75, 0)).addBox(-4.0f, -8.0f, -5.0f, 8, 8, 8);
		head2.setRotationPoint(-9.0f, -3.0f, 3.0f);
		head2.setTextureSize(128, 32);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(body11 = new ModelRenderer(this, 34, 25)).addBox(-2.0f, 0.0f, -2.0f, 8, 3, 2);
		body11.setRotationPoint(2.0f, 1.0f, 0.0f);
		body11.setTextureSize(128, 32);
		body11.mirror = true;
		setRotation(body11, 0.0f, 0.0f, 0.0f);
		(body12 = new ModelRenderer(this, 34, 25)).addBox(-2.0f, 0.0f, -2.0f, 8, 3, 2);
		body12.setRotationPoint(9.0f, -2.0f, 2.0f);
		body12.setTextureSize(128, 32);
		body12.mirror = true;
		setRotation(body12, 0.0f, 0.0f, -1.570796f);
		(body13 = new ModelRenderer(this, 3, 21)).addBox(-1.5f, 0.0f, -2.0f, 3, 9, 2);
		body13.setRotationPoint(-3.0f, 14.0f, 0.0f);
		body13.setTextureSize(128, 32);
		body13.mirror = true;
		setRotation(body13, 0.2617994f, 0.0f, 0.0f);
		(body14 = new ModelRenderer(this, 59, 1)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 2);
		body14.setRotationPoint(-3.0f, 4.0f, 0.0f);
		body14.setTextureSize(128, 32);
		body14.mirror = true;
		setRotation(body14, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 75, 0)).addBox(-4.0f, -8.0f, -5.0f, 8, 8, 8);
		head7.setRotationPoint(9.0f, -3.0f, 3.0f);
		head7.setTextureSize(128, 32);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(body15 = new ModelRenderer(this, 37, 17)).addBox(0.0f, 0.0f, -2.0f, 8, 3, 2);
		body15.setRotationPoint(-8.0f, 1.0f, 0.0f);
		body15.setTextureSize(128, 32);
		body15.mirror = true;
		setRotation(body15, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		GL11.glPushMatrix();
		GL11.glTranslatef(0f, 1.5F - 1.5F * 1.5F, 0f);
		GL11.glScalef(1.5F, 1.5F, 1.5F);
		body1.render(par7);
		body2.render(par7);
		body3.render(par7);
		head1.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
		body7.render(par7);
		body8.render(par7);
		body9.render(par7);
		head10.render(par7);
		head.render(par7);
		head2.render(par7);
		body11.render(par7);
		body12.render(par7);
		body13.render(par7);
		body14.render(par7);
		head7.render(par7);
		body15.render(par7);
		GL11.glPopMatrix();
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		head.rotateAngleY = par4 / 57.295776f;
		head.rotateAngleX = par5 / 54.11268f;
		head2.rotateAngleY = par4 / 57.295776f;
		head2.rotateAngleX = par5 / 54.11268f;
		head7.rotateAngleY = par4 / 57.295776f;
		head7.rotateAngleX = par5 / 54.11268f;
	}
}
