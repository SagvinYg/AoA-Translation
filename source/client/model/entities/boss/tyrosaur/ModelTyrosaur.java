/*
 * Decompiled with CFR 0_128.
 *
 * Could not load the following classes:
 *  net.minecraft.client.model.ModelBase
 *  net.minecraft.client.model.ModelRenderer
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.MathHelper
 */
package net.tslat.aoa3.client.model.entities.boss.tyrosaur;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelTyrosaur extends ModelBase {
	ModelRenderer head;
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
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
	ModelRenderer head18;
	ModelRenderer head19;
	ModelRenderer leg4p2;
	ModelRenderer leg2p2;
	ModelRenderer leg3p2;
	ModelRenderer leg1p2;
	ModelRenderer body3;
	ModelRenderer body2;
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
	ModelRenderer body14;
	ModelRenderer body15;
	ModelRenderer body16;
	ModelRenderer body17;
	ModelRenderer body18;
	ModelRenderer head20;
	ModelRenderer head21;
	ModelRenderer head22;
	ModelRenderer head23;
	ModelRenderer head24;
	ModelRenderer head25;

	public ModelTyrosaur() {
		textureWidth = 128;
		textureHeight = 64;
		head = new ModelRenderer(this, 99, 0);
		head.addBox(-0.5f, -11.0f, 3.0f, 1, 4, 1);
		head.setRotationPoint(0.0f, 5.0f, -8.0f);
		head.setTextureSize(128, 64);
		head.mirror = true;
		setRotation(head, -0.3490659f, 0.0f, 0.0f);
		body = new ModelRenderer(this, 59, 27);
		body.addBox(-8.0f, 8.0f, -4.0f, 1, 6, 4);
		body.setRotationPoint(14.0f, 3.0f, 8.0f);
		body.setTextureSize(128, 64);
		body.mirror = true;
		setRotation(body, 2.094395f, 0.0f, 0.0f);
		leg1 = new ModelRenderer(this, 26, 19);
		leg1.addBox(-3.0f, 6.0f, -4.0f, 4, 3, 1);
		leg1.setRotationPoint(-4.0f, 15.0f, 18.0f);
		leg1.setTextureSize(128, 64);
		leg1.mirror = true;
		setRotation(leg1, 0.0f, 0.0f, 0.0f);
		leg2 = new ModelRenderer(this, 26, 19);
		leg2.addBox(-1.0f, 6.0f, -4.0f, 4, 3, 1);
		leg2.setRotationPoint(4.0f, 15.0f, 18.0f);
		leg2.setTextureSize(128, 64);
		leg2.mirror = true;
		setRotation(leg2, 0.0f, 0.0f, 0.0f);
		leg3 = new ModelRenderer(this, 26, 19);
		leg3.addBox(-3.0f, 6.0f, -5.0f, 4, 3, 1);
		leg3.setRotationPoint(-4.0f, 15.0f, -1.0f);
		leg3.setTextureSize(128, 64);
		leg3.mirror = true;
		setRotation(leg3, 0.0f, 0.0f, 0.0f);
		leg4 = new ModelRenderer(this, 26, 19);
		leg4.addBox(-1.0f, 6.0f, -5.0f, 4, 3, 1);
		leg4.setRotationPoint(4.0f, 15.0f, -1.0f);
		leg4.setTextureSize(128, 64);
		leg4.mirror = true;
		setRotation(leg4, 0.0f, 0.0f, 0.0f);
		head2 = new ModelRenderer(this, 38, 14);
		head2.addBox(-1.5f, 6.0f, -5.0f, 1, 2, 1);
		head2.setRotationPoint(0.0f, 5.0f, -8.0f);
		head2.setTextureSize(128, 64);
		head2.mirror = true;
		setRotation(head2, 0.0f, 0.0f, 0.0f);
		head3 = new ModelRenderer(this, 88, 7);
		head3.addBox(4.5f, 0.5f, 6.0f, 1, 1, 6);
		head3.setRotationPoint(0.0f, 5.0f, -8.0f);
		head3.setTextureSize(128, 64);
		head3.mirror = true;
		setRotation(head3, 0.4363323f, 0.0f, 0.0f);
		head4 = new ModelRenderer(this, 38, 14);
		head4.addBox(-5.0f, 8.0f, -5.0f, 10, 1, 9);
		head4.setRotationPoint(0.0f, 5.0f, -8.0f);
		head4.setTextureSize(128, 64);
		head4.mirror = true;
		setRotation(head4, 0.0f, 0.0f, 0.0f);
		head5 = new ModelRenderer(this, 38, 14);
		head5.addBox(-5.0f, 6.0f, 1.0f, 1, 2, 1);
		head5.setRotationPoint(0.0f, 5.0f, -8.0f);
		head5.setTextureSize(128, 64);
		head5.mirror = true;
		setRotation(head5, 0.0f, 0.0f, 0.0f);
		head6 = new ModelRenderer(this, 38, 14);
		head6.addBox(-3.0f, 6.0f, -5.0f, 1, 2, 1);
		head6.setRotationPoint(0.0f, 5.0f, -8.0f);
		head6.setTextureSize(128, 64);
		head6.mirror = true;
		setRotation(head6, 0.0f, 0.0f, 0.0f);
		head7 = new ModelRenderer(this, 38, 14);
		head7.addBox(4.0f, 6.0f, 1.0f, 1, 2, 1);
		head7.setRotationPoint(0.0f, 5.0f, -8.0f);
		head7.setTextureSize(128, 64);
		head7.mirror = true;
		setRotation(head7, 0.0f, 0.0f, 0.0f);
		head8 = new ModelRenderer(this, 38, 14);
		head8.addBox(2.0f, 6.0f, -5.0f, 1, 2, 1);
		head8.setRotationPoint(0.0f, 5.0f, -8.0f);
		head8.setTextureSize(128, 64);
		head8.mirror = true;
		setRotation(head8, 0.0f, 0.0f, 0.0f);
		head9 = new ModelRenderer(this, 38, 14);
		head9.addBox(0.5f, 6.0f, -5.0f, 1, 2, 1);
		head9.setRotationPoint(0.0f, 5.0f, -8.0f);
		head9.setTextureSize(128, 64);
		head9.mirror = true;
		setRotation(head9, 0.0f, 0.0f, 0.0f);
		head10 = new ModelRenderer(this, 38, 14);
		head10.addBox(4.0f, 6.0f, -5.0f, 1, 2, 1);
		head10.setRotationPoint(0.0f, 5.0f, -8.0f);
		head10.setTextureSize(128, 64);
		head10.mirror = true;
		setRotation(head10, 0.0f, 0.0f, 0.0f);
		head11 = new ModelRenderer(this, 38, 14);
		head11.addBox(-5.0f, 6.0f, -5.0f, 1, 2, 1);
		head11.setRotationPoint(0.0f, 5.0f, -8.0f);
		head11.setTextureSize(128, 64);
		head11.mirror = true;
		setRotation(head11, 0.0f, 0.0f, 0.0f);
		head12 = new ModelRenderer(this, 38, 14);
		head12.addBox(4.0f, 6.0f, -3.0f, 1, 2, 1);
		head12.setRotationPoint(0.0f, 5.0f, -8.0f);
		head12.setTextureSize(128, 64);
		head12.mirror = true;
		setRotation(head12, 0.0f, 0.0f, 0.0f);
		head13 = new ModelRenderer(this, 38, 14);
		head13.addBox(-5.0f, 6.0f, -3.0f, 1, 2, 1);
		head13.setRotationPoint(0.0f, 5.0f, -8.0f);
		head13.setTextureSize(128, 64);
		head13.mirror = true;
		setRotation(head13, 0.0f, 0.0f, 0.0f);
		head14 = new ModelRenderer(this, 38, 14);
		head14.addBox(4.0f, 6.0f, -1.0f, 1, 2, 1);
		head14.setRotationPoint(0.0f, 5.0f, -8.0f);
		head14.setTextureSize(128, 64);
		head14.mirror = true;
		setRotation(head14, 0.0f, 0.0f, 0.0f);
		head15 = new ModelRenderer(this, 38, 14);
		head15.addBox(-5.0f, 6.0f, -1.0f, 1, 2, 1);
		head15.setRotationPoint(0.0f, 5.0f, -8.0f);
		head15.setTextureSize(128, 64);
		head15.mirror = true;
		setRotation(head15, 0.0f, 0.0f, 0.0f);
		head16 = new ModelRenderer(this, 0, 0);
		head16.addBox(-4.0f, 0.0f, -4.0f, 8, 7, 10);
		head16.setRotationPoint(0.0f, 5.0f, -8.0f);
		head16.setTextureSize(128, 64);
		head16.mirror = true;
		setRotation(head16, 0.0f, 0.0f, 0.0f);
		head17 = new ModelRenderer(this, 88, 7);
		head17.addBox(-5.5f, 0.5f, 6.0f, 1, 1, 6);
		head17.setRotationPoint(0.0f, 5.0f, -8.0f);
		head17.setTextureSize(128, 64);
		head17.mirror = true;
		setRotation(head17, 0.4363323f, 0.0f, 0.0f);
		head18 = new ModelRenderer(this, 67, 0);
		head18.addBox(4.0f, 0.0f, -2.0f, 2, 2, 8);
		head18.setRotationPoint(0.0f, 5.0f, -8.0f);
		head18.setTextureSize(128, 64);
		head18.mirror = true;
		setRotation(head18, 0.4363323f, 0.0f, 0.0f);
		head19 = new ModelRenderer(this, 67, 0);
		head19.addBox(-6.0f, 0.0f, -2.0f, 2, 2, 8);
		head19.setRotationPoint(0.0f, 5.0f, -8.0f);
		head19.setTextureSize(128, 64);
		head19.mirror = true;
		setRotation(head19, 0.4363323f, 0.0f, 0.0f);
		leg4p2 = new ModelRenderer(this, 0, 18);
		leg4p2.addBox(-2.0f, 0.0f, -4.0f, 6, 9, 6);
		leg4p2.setRotationPoint(4.0f, 15.0f, -1.0f);
		leg4p2.setTextureSize(128, 64);
		leg4p2.mirror = true;
		setRotation(leg4p2, 0.0f, 0.0f, 0.0f);
		leg2p2 = new ModelRenderer(this, 0, 18);
		leg2p2.addBox(-2.0f, 0.0f, -3.0f, 6, 9, 6);
		leg2p2.setRotationPoint(4.0f, 15.0f, 18.0f);
		leg2p2.setTextureSize(128, 64);
		leg2p2.mirror = true;
		setRotation(leg2p2, 0.0f, 0.0f, 0.0f);
		leg3p2 = new ModelRenderer(this, 0, 18);
		leg3p2.addBox(-4.0f, 0.0f, -4.0f, 6, 9, 6);
		leg3p2.setRotationPoint(-4.0f, 15.0f, -1.0f);
		leg3p2.setTextureSize(128, 64);
		leg3p2.mirror = true;
		setRotation(leg3p2, 0.0f, 0.0f, 0.0f);
		leg1p2 = new ModelRenderer(this, 0, 18);
		leg1p2.addBox(-4.0f, 0.0f, -3.0f, 6, 9, 6);
		leg1p2.setRotationPoint(-4.0f, 15.0f, 18.0f);
		leg1p2.setTextureSize(128, 64);
		leg1p2.mirror = true;
		setRotation(leg1p2, 0.0f, 0.0f, 0.0f);
		body3 = new ModelRenderer(this, 86, 34);
		body3.addBox(2.0f, 5.0f, 3.0f, 1, 7, 2);
		body3.setRotationPoint(0.0f, 8.0f, 6.0f);
		body3.setTextureSize(128, 64);
		body3.mirror = true;
		setRotation(body3, 1.570796f, 0.0f, 0.0f);
		body2 = new ModelRenderer(this, 59, 27);
		body2.addBox(-8.0f, 8.0f, -4.0f, 1, 6, 4);
		body2.setRotationPoint(1.0f, 3.0f, 8.0f);
		body2.setTextureSize(128, 64);
		body2.mirror = true;
		setRotation(body2, 2.094395f, 0.0f, 0.0f);
		body4 = new ModelRenderer(this, 48, 33);
		body4.addBox(-8.0f, -12.0f, -7.0f, 1, 20, 7);
		body4.setRotationPoint(14.0f, 3.0f, 8.0f);
		body4.setTextureSize(128, 64);
		body4.mirror = true;
		setRotation(body4, 2.094395f, 0.0f, 0.0f);
		body5 = new ModelRenderer(this, 48, 33);
		body5.addBox(-8.0f, -12.0f, -7.0f, 1, 20, 7);
		body5.setRotationPoint(1.0f, 3.0f, 8.0f);
		body5.setTextureSize(128, 64);
		body5.mirror = true;
		setRotation(body5, 2.094395f, 0.0f, 0.0f);
		body6 = new ModelRenderer(this, 121, 36);
		body6.addBox(8.0f, 6.0f, -4.0f, 1, 4, 1);
		body6.setRotationPoint(0.0f, 8.0f, 6.0f);
		body6.setTextureSize(128, 64);
		body6.mirror = true;
		setRotation(body6, 1.570796f, 0.0f, 0.0f);
		body7 = new ModelRenderer(this, 85, 56);
		body7.addBox(-3.0f, 18.0f, -6.0f, 6, 4, 3);
		body7.setRotationPoint(0.0f, 8.0f, 6.0f);
		body7.setTextureSize(128, 64);
		body7.mirror = true;
		setRotation(body7, 1.570796f, 0.0f, 0.0f);
		body8 = new ModelRenderer(this, 86, 34);
		body8.addBox(-3.0f, 5.0f, 3.0f, 1, 7, 2);
		body8.setRotationPoint(0.0f, 8.0f, 6.0f);
		body8.setTextureSize(128, 64);
		body8.mirror = true;
		setRotation(body8, 1.570796f, 0.0f, 0.0f);
		body9 = new ModelRenderer(this, 86, 34);
		body9.addBox(2.0f, -5.0f, 3.0f, 1, 7, 2);
		body9.setRotationPoint(0.0f, 8.0f, 6.0f);
		body9.setTextureSize(128, 64);
		body9.mirror = true;
		setRotation(body9, 1.570796f, 0.0f, 0.0f);
		body10 = new ModelRenderer(this, 86, 34);
		body10.addBox(-3.0f, -5.0f, 3.0f, 1, 7, 2);
		body10.setRotationPoint(0.0f, 8.0f, 6.0f);
		body10.setTextureSize(128, 64);
		body10.mirror = true;
		setRotation(body10, 1.570796f, 0.0f, 0.0f);
		body11 = new ModelRenderer(this, 66, 39);
		body11.addBox(-3.0f, -7.0f, 0.0f, 6, 21, 3);
		body11.setRotationPoint(0.0f, 8.0f, 6.0f);
		body11.setTextureSize(128, 64);
		body11.mirror = true;
		setRotation(body11, 1.570796f, 0.0f, 0.0f);
		body12 = new ModelRenderer(this, 85, 45);
		body12.addBox(-3.0f, 14.0f, -6.0f, 6, 4, 5);
		body12.setRotationPoint(0.0f, 8.0f, 6.0f);
		body12.setTextureSize(128, 64);
		body12.mirror = true;
		setRotation(body12, 1.570796f, 0.0f, 0.0f);
		body13 = new ModelRenderer(this, 1, 33);
		body13.addBox(-8.0f, -10.0f, -7.0f, 16, 24, 7);
		body13.setRotationPoint(0.0f, 8.0f, 6.0f);
		body13.setTextureSize(128, 64);
		body13.mirror = true;
		setRotation(body13, 1.570796f, 0.0f, 0.0f);
		body14 = new ModelRenderer(this, 109, 42);
		body14.addBox(8.0f, -7.0f, -5.0f, 1, 12, 4);
		body14.setRotationPoint(0.0f, 8.0f, 6.0f);
		body14.setTextureSize(128, 64);
		body14.mirror = true;
		setRotation(body14, 1.570796f, 0.0f, 0.0f);
		body15 = new ModelRenderer(this, 121, 36);
		body15.addBox(8.0f, 6.0f, -2.0f, 1, 4, 1);
		body15.setRotationPoint(0.0f, 8.0f, 6.0f);
		body15.setTextureSize(128, 64);
		body15.mirror = true;
		setRotation(body15, 1.570796f, 0.0f, 0.0f);
		body16 = new ModelRenderer(this, 121, 36);
		body16.addBox(-9.0f, 6.0f, -4.0f, 1, 4, 1);
		body16.setRotationPoint(0.0f, 8.0f, 6.0f);
		body16.setTextureSize(128, 64);
		body16.mirror = true;
		setRotation(body16, 1.570796f, 0.0f, 0.0f);
		body17 = new ModelRenderer(this, 109, 42);
		body17.addBox(-9.0f, -7.0f, -5.0f, 1, 12, 4);
		body17.setRotationPoint(0.0f, 8.0f, 6.0f);
		body17.setTextureSize(128, 64);
		body17.mirror = true;
		setRotation(body17, 1.570796f, 0.0f, 0.0f);
		body18 = new ModelRenderer(this, 121, 36);
		body18.addBox(-9.0f, 6.0f, -2.0f, 1, 4, 1);
		body18.setRotationPoint(0.0f, 8.0f, 6.0f);
		body18.setTextureSize(128, 64);
		body18.mirror = true;
		setRotation(body18, 1.570796f, 0.0f, 0.0f);
		head20 = new ModelRenderer(this, 38, 0);
		head20.addBox(-2.0f, -2.0f, -4.0f, 4, 2, 10);
		head20.setRotationPoint(0.0f, 5.0f, -8.0f);
		head20.setTextureSize(128, 64);
		head20.mirror = true;
		setRotation(head20, 0.0f, 0.0f, 0.0f);
		head21 = new ModelRenderer(this, 89, 0);
		head21.addBox(-1.0f, -7.0f, 2.5f, 2, 4, 2);
		head21.setRotationPoint(0.0f, 5.0f, -8.0f);
		head21.setTextureSize(128, 64);
		head21.mirror = true;
		setRotation(head21, -0.3490659f, 0.0f, 0.0f);
		head22 = new ModelRenderer(this, 99, 0);
		head22.addBox(-0.5f, -8.0f, -3.0f, 1, 4, 1);
		head22.setRotationPoint(0.0f, 5.0f, -8.0f);
		head22.setTextureSize(128, 64);
		head22.mirror = true;
		setRotation(head22, -0.3490659f, 0.0f, 0.0f);
		head23 = new ModelRenderer(this, 89, 0);
		head23.addBox(-1.0f, -4.0f, -3.5f, 2, 4, 2);
		head23.setRotationPoint(0.0f, 5.0f, -8.0f);
		head23.setTextureSize(128, 64);
		head23.mirror = true;
		setRotation(head23, -0.3490659f, 0.0f, 0.0f);
		head24 = new ModelRenderer(this, 99, 0);
		head24.addBox(-0.5f, -10.0f, 0.0f, 1, 4, 1);
		head24.setRotationPoint(0.0f, 5.0f, -8.0f);
		head24.setTextureSize(128, 64);
		head24.mirror = true;
		setRotation(head24, -0.3490659f, 0.0f, 0.0f);
		head25 = new ModelRenderer(this, 89, 0);
		head25.addBox(-1.0f, -6.0f, -0.5f, 2, 4, 2);
		head25.setRotationPoint(0.0f, 5.0f, -8.0f);
		head25.setTextureSize(128, 64);
		head25.mirror = true;
		setRotation(head25, -0.3490659f, 0.0f, 0.0f);
	}

	public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		head.render(par7);
		body.render(par7);
		leg1.render(par7);
		leg2.render(par7);
		leg3.render(par7);
		leg4.render(par7);
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
		head18.render(par7);
		head19.render(par7);
		leg4p2.render(par7);
		leg2p2.render(par7);
		leg3p2.render(par7);
		leg1p2.render(par7);
		body3.render(par7);
		body2.render(par7);
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
		body14.render(par7);
		body15.render(par7);
		body16.render(par7);
		body17.render(par7);
		body18.render(par7);
		head20.render(par7);
		head21.render(par7);
		head22.render(par7);
		head23.render(par7);
		head24.render(par7);
		head25.render(par7);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
		leg1.rotateAngleX = MathHelper.cos((par1 * 0.6662f)) * 1.4f * par2;
		leg1.rotateAngleY = 0.0f;
		leg3.rotateAngleX = MathHelper.cos((par1 * 0.6662f)) * 1.4f * par2;
		leg3.rotateAngleY = 0.0f;
		leg2.rotateAngleX = MathHelper.cos((par1 * 0.6662f + 3.1415927f)) * 1.4f * par2;
		leg4.rotateAngleX = MathHelper.cos((par1 * 0.6662f + 3.1415927f)) * 1.4f * par2;
		leg1p2.rotateAngleX = MathHelper.cos((par1 * 0.6662f)) * 1.4f * par2;
		leg1p2.rotateAngleY = 0.0f;
		leg3p2.rotateAngleX = MathHelper.cos((par1 * 0.6662f)) * 1.4f * par2;
		leg3p2.rotateAngleY = 0.0f;
		leg2p2.rotateAngleX = MathHelper.cos((par1 * 0.6662f + 3.1415927f)) * 1.4f * par2;
		leg4p2.rotateAngleX = MathHelper.cos((par1 * 0.6662f + 3.1415927f)) * 1.4f * par2;
	}
}

