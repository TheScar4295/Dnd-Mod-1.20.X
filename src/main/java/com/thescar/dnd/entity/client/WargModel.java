package com.thescar.dnd.entity.client;
// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.thescar.dnd.entity.custom.WargEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class WargModel<T extends WargEntity> extends HierarchicalModel<T> {
	private final ModelPart warg;
	private final ModelPart Head;


	public WargModel(ModelPart root) {
		this.warg = root.getChild("warg");
		this.Head = warg.getChild("Head").getChild("LowerJaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("warg", CubeListBuilder.create().texOffs(44, 18).addBox(-6.0F, -6.0F, 2.0F, 12.0F, 13.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(42, 0).addBox(-6.0F, 7.0F, 2.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.0F, -9.0F, -12.0F, 14.0F, 16.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 30).addBox(-7.0F, 7.0F, -12.0F, 14.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, -1.0F));

		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create().texOffs(24, 58).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -2.0F, 14.0F));

		PartDefinition FLeg1 = Body.addOrReplaceChild("FLeg1", CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 7.0F, -7.0F));

		PartDefinition FLeg2 = Body.addOrReplaceChild("FLeg2", CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 7.0F, -7.0F));

		PartDefinition HLeg1 = Body.addOrReplaceChild("HLeg1", CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 7.0F, 9.0F));

		PartDefinition HLeg2 = Body.addOrReplaceChild("HLeg2", CubeListBuilder.create().texOffs(0, 58).addBox(-3.0F, -2.0F, -3.0F, 6.0F, 16.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 7.0F, 9.0F));

		PartDefinition Head = Body.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(46, 43).addBox(-5.0F, -3.0F, -9.0F, 10.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(71, 69).addBox(-3.0F, 0.0F, -16.0F, 6.0F, 5.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-5.0F, 8.0F, -9.0F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(41, 76).addBox(-3.0F, 5.0F, -16.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -11.5F));

		PartDefinition LowerJaw = Head.addOrReplaceChild("LowerJaw", CubeListBuilder.create().texOffs(48, 64).addBox(-3.0F, 0.0F, -10.0F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.05F))
		.texOffs(76, 43).addBox(-3.0F, -2.1F, -10.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.05F)), PartPose.offset(0.0F, 5.0F, -6.0F));

		PartDefinition Ear1 = Head.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, -3.0F, -5.0F));

		PartDefinition Ear2 = Head.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-1.5F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-3.5F, -3.0F, -5.0F));

		PartDefinition Mane = Body.addOrReplaceChild("Mane", CubeListBuilder.create().texOffs(29, 35).addBox(0.0F, -3.0F, -3.0F, 0.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -9.0F, -9.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(WargEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

	}

	private void applyHeadRotation(WargEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);


		this.Head.yRot = pNetHeadYaw * 0.017453292F;
		this.Head.xRot = pHeadPitch * 0.017453292F;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		warg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return warg;
	}
}