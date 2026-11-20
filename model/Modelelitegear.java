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

public class Modelelitegear<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("relda", "modelelitegear"), "main");
   public final ModelPart head;
   public final ModelPart body;
   public final ModelPart left_arm;
   public final ModelPart right_arm;

   public Modelelitegear(ModelPart root) {
      this.head = root.m_171324_("head");
      this.body = root.m_171324_("body");
      this.left_arm = root.m_171324_("left_arm");
      this.right_arm = root.m_171324_("right_arm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(92, 110).m_171488_(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      PartDefinition cube_r1 = head.m_171599_("cube_r1", CubeListBuilder.m_171558_(), PartPose.m_171423_(1.3312F, -7.4612F, -5.4748F, -0.7273F, -0.6898F, 0.1253F));
      cube_r1.m_171599_("cube_r1_r1", CubeListBuilder.m_171558_().m_171514_(44, 123).m_171488_(-3.4189F, -2.1321F, 0.4131F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 0.0F, 0.0F, -0.0119F, 0.0808F, -0.1148F));
      PartDefinition cube_r2 = head.m_171599_("cube_r2", CubeListBuilder.m_171558_(), PartPose.m_171423_(-4.0F, -4.0F, -4.5F, -0.8146F, 0.6898F, -0.1253F));
      cube_r2.m_171599_("cube_r2_r1", CubeListBuilder.m_171558_().m_171514_(56, 123).m_171488_(-2.5811F, -2.1934F, 0.4778F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.9965F, -3.0301F, -1.298F, -0.0122F, -0.0905F, 0.1073F));
      PartDefinition cube_r3 = head.m_171599_("cube_r3", CubeListBuilder.m_171558_(), PartPose.m_171423_(4.0F, -1.5F, -3.5F, 0.6771F, -0.6516F, -0.0668F));
      cube_r3.m_171599_("cube_r3_r1", CubeListBuilder.m_171558_().m_171514_(80, 122).m_171488_(-3.3032F, -3.1604F, -0.3638F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.1516F, -0.1245F, 0.3451F, -0.2618F, 0.0F, 0.0F));
      PartDefinition cube_r4 = head.m_171599_("cube_r4", CubeListBuilder.m_171558_(), PartPose.m_171423_(-4.0F, -1.5F, -3.5F, 0.6771F, 0.6516F, 0.0668F));
      cube_r4.m_171599_("cube_r4_r1", CubeListBuilder.m_171558_().m_171514_(68, 122).m_171488_(-2.6968F, -3.1761F, -0.3564F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.1516F, -0.1245F, 0.3451F, -0.2182F, 0.0F, 0.0F));
      PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.5F, -0.5F, -3.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(30, 0).m_171488_(-4.5F, 7.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      body.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(18, 23).m_171488_(-0.25F, -2.25F, 0.5F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.1924F, 14.6734F, -4.569F, -0.0835F, 0.045F, -0.0058F));
      body.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(16, 23).m_171488_(-1.5F, 0.5F, -0.45F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.75F, 8.5F, -2.5F, -0.2618F, 0.0F, -0.1745F));
      body.m_171599_("cube_r15", CubeListBuilder.m_171558_().m_171514_(22, 23).m_171488_(-3.0F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.5F, 8.5F, -2.5F, 0.0F, 0.0F, 0.2618F));
      body.m_171599_("body_r1", CubeListBuilder.m_171558_().m_171514_(50, 38).m_171488_(-4.25F, -0.25F, -3.0F, 4.5F, 10.5F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.25F, 9.25F, 0.0F, 0.0F, 0.0F, -0.1745F));
      body.m_171599_("body_r2", CubeListBuilder.m_171558_().m_171514_(71, 38).m_171488_(-0.25F, -0.25F, -3.0F, 4.5F, 10.5F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.25F, 9.25F, 0.0F, 0.0F, 0.0F, 0.1745F));
      body.m_171599_("body_r3", CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-3.5F, -3.0F, -0.5F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 3.5F, -3.0F, -0.0436F, 0.0F, 0.0F));
      PartDefinition left_arm = partdefinition.m_171599_("left_arm", CubeListBuilder.m_171558_().m_171514_(34, 39).m_171488_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).m_171514_(0, 26).m_171488_(0.5F, 7.0F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
      left_arm.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(39, 18).m_171488_(-0.5F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
      left_arm.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(60, 8).m_171488_(-1.0F, -2.0F, -2.4F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
      left_arm.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(0, 3).m_171488_(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.2287F, -0.0261F, -2.7294F, 0.0253F, -0.2309F, 0.8245F));
      left_arm.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(34, 9).m_171488_(-5.0F, 0.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0873F));
      PartDefinition right_arm = partdefinition.m_171599_("right_arm", CubeListBuilder.m_171558_().m_171514_(18, 39).m_171488_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
      right_arm.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(39, 18).m_171488_(-1.2437F, -3.4319F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.7563F, -1.0681F, 0.0F, 0.0F, 0.0F, -3.0107F));
      right_arm.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(60, 0).m_171488_(-2.5932F, -1.2771F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.4068F, 5.7771F, 0.0062F, 3.1416F, 0.0F, 2.7489F));
      right_arm.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(0, 18).m_171488_(-0.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-3.0F, 8.5F, 0.0F));
      PartDefinition cube_r14 = right_arm.m_171599_("cube_r14", CubeListBuilder.m_171558_(), PartPose.m_171423_(-1.2736F, -2.299F, 0.0F, 0.0F, 0.0F, 3.0543F));
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
