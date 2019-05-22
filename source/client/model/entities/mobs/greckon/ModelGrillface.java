package net.tslat.aoa3.client.model.entities.mobs.greckon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelGrillface extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer rightarm;
	ModelRenderer rightleg;
	ModelRenderer leftleg;
	ModelRenderer leftarm;
	ModelRenderer head2;
	ModelRenderer head3;
	ModelRenderer head4;
	ModelRenderer head5;
	ModelRenderer leftarm2;
	ModelRenderer rightarm2;
	ModelRenderer rightarm3;
	ModelRenderer leftarm3;
	ModelRenderer head6;
	ModelRenderer head7;
	ModelRenderer head8;
	ModelRenderer head9;
	ModelRenderer head10;
	ModelRenderer head11;
	ModelRenderer head12;
	ModelRenderer head13;
	ModelRenderer head14;
	ModelRenderer body2;
	ModelRenderer body3;
	ModelRenderer body4;
	ModelRenderer body5;
	ModelRenderer body6;

	public ModelGrillface() {
		textureWidth = 128;
		textureHeight = 64;
		(head = new ModelRenderer(this, 0, 13)).addBox(-2.0f, -6.0f, -12.0f, 4, 4, 8);
		head.setRotationPoint(0.0f, -4.0f, 6.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, 0.0f, 0.0f, 0.0f);
		(body = new ModelRenderer(this, 48, 38)).addBox(-0.5f, 14.0f, 8.5f, 1, 6, 1);
		body.setRotationPoint(0.0f, 4.0f, 6.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 0.0872665f, 0.0f, 0.0f);
		(rightarm = new ModelRenderer(this, 40, 16)).addBox(1.0f, -2.0f, -2.0f, 2, 3, 4);
		rightarm.setRotationPoint(-7.0f, -2.0f, 6.0f);
		rightarm.setTextureSize(128, 64);
		rightarm.mirror = true;
		setRotation(rightarm, 0.0f, 0.0f, 0.0f);
		(rightleg = new ModelRenderer(this, 0, 38)).addBox(-2.0f, 0.0f, -2.0f, 4, 16, 4);
		rightleg.setRotationPoint(-4.0f, 8.0f, 6.0f);
		rightleg.setTextureSize(128, 64);
		rightleg.mirror = true;
		setRotation(rightleg, 0.0f, 0.0f, 0.0f);
		(leftleg = new ModelRenderer(this, 0, 38)).addBox(-2.0f, 0.0f, -2.0f, 4, 16, 4);
		leftleg.setRotationPoint(4.0f, 8.0f, 6.0f);
		leftleg.setTextureSize(128, 64);
		leftleg.mirror = true;
		setRotation(leftleg, 0.0f, 0.0f, 0.0f);
		(leftarm = new ModelRenderer(this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 2, 3, 4);
		leftarm.setRotationPoint(7.0f, -2.0f, 6.0f);
		leftarm.setTextureSize(128, 64);
		leftarm.mirror = true;
		setRotation(leftarm, 0.0f, 0.0f, 0.0f);
		(head2 = new ModelRenderer(this, 0, 0)).addBox(-4.0f, -6.0f, -14.0f, 8, 3, 2);
		head2.setRotationPoint(0.0f, -4.0f, 6.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		(head3 = new ModelRenderer(this, 66, 54)).addBox(5.0f, -15.5f, -8.0f, 2, 2, 6);
		head3.setRotationPoint(0.0f, -4.0f, 6.0f);
		head3.setTextureSize(128, 64);
		head3.mirror = true;
		setRotation(head3, 0.5205006f, 0.0f, 0.0f);
		(head4 = new ModelRenderer(this, 56, 28)).addBox(-4.0f, -8.0f, -20.0f, 8, 2, 8);
		head4.setRotationPoint(0.0f, -4.0f, 6.0f);
		head4.setTextureSize(128, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		(head5 = new ModelRenderer(this, 98, 36)).addBox(-4.0f, -6.0f, -20.0f, 8, 3, 0);
		head5.setRotationPoint(0.0f, -4.0f, 6.0f);
		head5.setTextureSize(128, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		(leftarm2 = new ModelRenderer(this, 100, 12)).addBox(0.0f, 8.0f, -1.0f, 2, 16, 2);
		leftarm2.setRotationPoint(7.0f, -2.0f, 6.0f);
		leftarm2.setTextureSize(128, 64);
		leftarm2.mirror = true;
		setRotation(leftarm2, 0.0f, 0.0f, 0.0f);
		(rightarm2 = new ModelRenderer(this, 100, 12)).addBox(-2.0f, 8.0f, -1.0f, 2, 16, 2);
		rightarm2.setRotationPoint(-7.0f, -2.0f, 6.0f);
		rightarm2.setTextureSize(128, 64);
		rightarm2.mirror = true;
		setRotation(rightarm2, 0.0f, 0.0f, 0.0f);
		(rightarm3 = new ModelRenderer(this, 109, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4);
		rightarm3.setRotationPoint(-7.0f, -2.0f, 6.0f);
		rightarm3.setTextureSize(128, 64);
		rightarm3.mirror = true;
		setRotation(rightarm3, 0.0f, 0.0f, 0.0f);
		(leftarm3 = new ModelRenderer(this, 109, 16)).addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4);
		leftarm3.setRotationPoint(7.0f, -2.0f, 6.0f);
		leftarm3.setTextureSize(128, 64);
		leftarm3.mirror = true;
		setRotation(leftarm3, 0.0f, 0.0f, 0.0f);
		(head6 = new ModelRenderer(this, 56, 41)).addBox(-4.0f, -3.0f, -20.0f, 8, 2, 8);
		head6.setRotationPoint(0.0f, -4.0f, 6.0f);
		head6.setTextureSize(128, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		(head7 = new ModelRenderer(this, 98, 46)).addBox(-4.0f, -6.0f, -20.0f, 0, 3, 6);
		head7.setRotationPoint(0.0f, -4.0f, 6.0f);
		head7.setTextureSize(128, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		(head8 = new ModelRenderer(this, 98, 46)).addBox(4.0f, -6.0f, -20.0f, 0, 3, 6);
		head8.setRotationPoint(0.0f, -4.0f, 6.0f);
		head8.setTextureSize(128, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		(head9 = new ModelRenderer(this, 53, 1)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8);
		head9.setRotationPoint(0.0f, -4.0f, 6.0f);
		head9.setTextureSize(128, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		(head10 = new ModelRenderer(this, 17, 51)).addBox(4.0f, -8.0f, -11.0f, 4, 4, 8);
		head10.setRotationPoint(0.0f, -4.0f, 6.0f);
		head10.setTextureSize(128, 64);
		head10.mirror = true;
		setRotation(head10, -0.6108652f, 0.0f, 0.0f);
		(head11 = new ModelRenderer(this, 45, 54)).addBox(4.5f, -12.5f, -10.0f, 3, 3, 6);
		head11.setRotationPoint(0.0f, -4.0f, 6.0f);
		head11.setTextureSize(128, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		(head12 = new ModelRenderer(this, 66, 54)).addBox(-7.0f, -15.5f, -8.0f, 2, 2, 6);
		head12.setRotationPoint(0.0f, -4.0f, 6.0f);
		head12.setTextureSize(128, 64);
		head12.mirror = true;
		setRotation(head12, 0.5205006f, 0.0f, 0.0f);
		(head13 = new ModelRenderer(this, 45, 54)).addBox(-7.5f, -12.5f, -10.0f, 3, 3, 6);
		head13.setRotationPoint(0.0f, -4.0f, 6.0f);
		head13.setTextureSize(128, 64);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		(head14 = new ModelRenderer(this, 17, 51)).addBox(-8.0f, -8.0f, -11.0f, 4, 4, 8);
		head14.setRotationPoint(0.0f, -4.0f, 6.0f);
		head14.setTextureSize(128, 64);
		head14.mirror = true;
		setRotation(head14, -0.6108652f, 0.0f, 0.0f);
		(body2 = new ModelRenderer(this, 19, 29)).addBox(-3.0f, 1.0f, -4.0f, 6, 10, 8);
		body2.setRotationPoint(0.0f, -4.0f, 6.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 0.0f, 0.0f, 0.0f);
		(body3 = new ModelRenderer(this, 25, 0)).addBox(-3.5f, 0.0f, -3.0f, 7, 8, 6);
		body3.setRotationPoint(0.0f, 4.0f, 6.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 1.308997f, 0.0f, 0.0f);
		(body4 = new ModelRenderer(this, 24, 14)).addBox(-2.0f, 3.0f, 4.0f, 4, 8, 4);
		body4.setRotationPoint(0.0f, 4.0f, 6.0f);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 0.4363323f, 0.0f, 0.0f);
		(body5 = new ModelRenderer(this, 46, 25)).addBox(-1.0f, 7.0f, 8.0f, 2, 8, 2);
		body5.setRotationPoint(0.0f, 4.0f, 6.0f);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 0.0872665f, 0.0f, 0.0f);
		(body6 = new ModelRenderer(this, 22, 32)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4);
		body6.setRotationPoint(0.0f, -4.0f, 6.0f);
		body6.setTextureSize(128, 64);
		body6.mirror = true;
		setRotation(body6, 0.0f, 0.0f, 0.0f);
	}

	public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		rightarm.render(par7);
		rightleg.render(par7);
		leftleg.render(par7);
		leftarm.render(par7);
		head2.render(par7);
		head3.render(par7);
		head4.render(par7);
		head5.render(par7);
		leftarm2.render(par7);
		rightarm2.render(par7);
		rightarm3.render(par7);
		leftarm3.render(par7);
		head6.render(par7);
		head7.render(par7);
		head8.render(par7);
		head9.render(par7);
		head10.render(par7);
		head11.render(par7);
		head12.render(par7);
		head13.render(par7);
		head14.render(par7);
		body2.render(par7);
		body3.render(par7);
		body4.render(par7);
		body5.render(par7);
		body6.render(par7);
	}

	private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity par7Entity) {
		rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm.rotateAngleZ = 0.0f;
		rightarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm2.rotateAngleZ = 0.0f;
		rightarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
		rightarm3.rotateAngleZ = 0.0f;
		leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm.rotateAngleZ = 0.0f;
		leftarm2.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm2.rotateAngleZ = 0.0f;
		leftarm3.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
		leftarm3.rotateAngleZ = 0.0f;
		rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
		rightleg.rotateAngleY = 0.0f;
		leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
	}
}
