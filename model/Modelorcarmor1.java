package net.mcreator.relda.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class Modelorcarmor1<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("relda", "modelorcarmor_1"), "main");
   public final ModelPart head;
   public final ModelPart body;
   public final ModelPart left_arm;
   public final ModelPart right_arm;
   public final ModelPart left_leg;
   public final ModelPart right_leg;

   public Modelorcarmor1(ModelPart root) {
      this.head = root.m_171324_("head");
      this.body = root.m_171324_("body");
      this.left_arm = root.m_171324_("left_arm");
      this.right_arm = root.m_171324_("right_arm");
      this.left_leg = root.m_171324_("left_leg");
      this.right_leg = root.m_171324_("right_leg");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(92, 110).m_171488_(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(51, 123).m_171488_(-5.5F, -6.0F, -0.5F, 11.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -8.5F, 4.0F, -0.6109F, 0.0F, 0.0F));
      head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(74, 123).m_171488_(-4.0F, -2.5F, -0.5F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -8.5F, 4.0F, -0.4363F, 0.0F, 0.0F));
      partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(0, 18).m_171488_(-4.5F, -0.5F, -2.5F, 9.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(28, 18).m_171488_(-5.0F, 6.5F, -3.0F, 10.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(50, 42).m_171488_(-3.0F, 13.5F, -3.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).m_171514_(49, 36).m_171488_(-3.0F, 13.5F, 3.0F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      partdefinition.m_171599_("left_arm", CubeListBuilder.m_171558_().m_171514_(36, 9).m_171488_(-1.5F, 5.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 48).m_171488_(-0.5F, -3.0F, -2.5F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
      PartDefinition right_arm = partdefinition.m_171599_("right_arm", CubeListBuilder.m_171558_().m_171514_(35, 43).m_171488_(-3.5F, 5.0F, -2.5F, 5.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
      right_arm.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(21, 31).m_171488_(-4.5F, 1.5F, -3.5F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, -2.5F, 0.0F, 0.0F, 0.0F, -1.0472F));
      right_arm.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(27, 0).m_171488_(-1.0F, 0.0F, -2.5F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, -2.5F, 0.0F, 0.0F, 0.0F, -0.2182F));
      partdefinition.m_171599_("left_leg", CubeListBuilder.m_171558_().m_171514_(15, 43).m_171488_(-2.5F, 7.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
      partdefinition.m_171599_("right_leg", CubeListBuilder.m_171558_().m_171514_(0, 36).m_171488_(-2.5F, 7.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 128, 128);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.left_arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.right_arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.left_leg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.right_leg.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
