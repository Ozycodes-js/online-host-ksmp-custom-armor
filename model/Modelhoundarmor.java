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

public class Modelhoundarmor<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("relda", "modelhoundarmor"), "main");
   public final ModelPart head;
   public final ModelPart body;
   public final ModelPart left_arm;
   public final ModelPart right_arm;

   public Modelhoundarmor(ModelPart root) {
      this.head = root.m_171324_("head");
      this.body = root.m_171324_("body");
      this.left_arm = root.m_171324_("left_arm");
      this.right_arm = root.m_171324_("right_arm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(92, 110).m_171488_(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(0, 124).m_171488_(-3.0F, -2.5F, -7.25F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).m_171514_(76, 122).m_171488_(-2.0F, -6.5F, -8.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(72, 116).m_171488_(-1.0855F, -8.0537F, 2.3833F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -6.3675F, -2.4472F, -0.2618F, 0.0F, -1.0036F));
      head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(72, 116).m_171488_(0.0855F, -8.0537F, 2.3833F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -6.3675F, -2.4472F, -0.2618F, 0.0F, 1.0036F));
      head.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(85, 119).m_171488_(-1.0F, -2.3105F, -5.8992F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -6.3675F, -2.4472F, 0.4363F, 0.0F, 0.0F));
      head.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(32, 121).m_171488_(-3.0F, 0.5886F, -5.3347F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -6.3675F, -2.4472F, 0.0873F, 0.0F, 0.0F));
      head.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(54, 121).m_171488_(-3.0F, -0.25F, -0.25F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -0.5F, -7.0F, 0.2182F, 0.0F, 0.0F));
      PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(0, 27).m_171488_(-4.5F, -0.5F, -2.5F, 9.0F, 16.0F, 5.0F, new CubeDeformation(0.0F)).m_171514_(0, 0).m_171488_(-5.0F, -1.0F, -3.0F, 10.0F, 21.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(26, 21).m_171488_(-5.0F, 10.5F, -3.0F, 10.0F, 2.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      body.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(26, 0).m_171488_(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.0F, 11.5F, -3.0F, 0.0F, 0.0F, 1.309F));
      body.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(2, 0).m_171488_(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.25F, 17.25F, -3.5F, -0.0436F, 0.0F, 0.0F));
      body.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.0F, -2.5F, 0.25F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 14.0F, -3.5F, -0.1302F, -0.0076F, -0.1744F));
      body.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(45, 52).m_171488_(-3.5F, -3.5F, -3.25F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.0869F, 0.0872F, 0.7835F));
      PartDefinition left_arm = partdefinition.m_171599_("left_arm", CubeListBuilder.m_171558_().m_171514_(32, 0).m_171488_(-1.5F, -2.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
      left_arm.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(52, 0).m_171488_(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, 8.5F, 0.0F, 0.0F, 0.0F, 0.1745F));
      left_arm.m_171599_("left_arm_r1", CubeListBuilder.m_171558_().m_171514_(46, 12).m_171488_(-1.5F, -2.0F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.5F, 2.5F, 0.0F, 0.0F, 0.0F, -0.1309F));
      left_arm.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(21, 47).m_171488_(-0.5F, -3.5F, -3.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
      PartDefinition right_arm = partdefinition.m_171599_("right_arm", CubeListBuilder.m_171558_().m_171514_(28, 29).m_171488_(-3.5F, -2.5F, -2.5F, 5.0F, 13.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
      right_arm.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(48, 29).m_171488_(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.0F, 8.5F, 0.0F, 0.0F, 0.0F, -0.2182F));
      right_arm.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(41, 40).m_171488_(-2.75F, -2.0F, -3.5F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.1745F));
      right_arm.m_171599_("right_arm_r1", CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-1.5F, -1.0F, -3.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.5F, 2.0F, 0.0F, 0.0F, 0.0F, 0.1309F));
      return LayerDefinition.m_171565_(meshdefinition, 128, 128);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.head.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.left_arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.right_arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
