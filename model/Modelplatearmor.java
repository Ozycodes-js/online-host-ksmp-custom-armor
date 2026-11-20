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

public class Modelplatearmor<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("relda", "modelplatearmor"), "main");
   public final ModelPart head;
   public final ModelPart body;
   public final ModelPart left_arm;
   public final ModelPart right_arm;

   public Modelplatearmor(ModelPart root) {
      this.head = root.m_171324_("head");
      this.body = root.m_171324_("body");
      this.left_arm = root.m_171324_("left_arm");
      this.right_arm = root.m_171324_("right_arm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_().m_171514_(92, 110).m_171488_(-4.5F, -8.5F, -4.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).m_171514_(6, 111).m_171488_(-1.5F, -9.0F, -5.0F, 3.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      head.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(44, 123).m_171488_(-5.9001F, -4.8254F, -0.5585F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, -4.0F, -4.5F, -0.7273F, -0.6898F, 0.1253F));
      head.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(56, 123).m_171488_(-0.0999F, -4.7914F, -0.6308F, 6.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, -4.0F, -4.5F, -0.8146F, 0.6898F, -0.1253F));
      head.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(80, 122).m_171488_(-6.1516F, -3.1245F, 0.3451F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(4.0F, -1.5F, -3.5F, 0.6771F, -0.6516F, -0.0668F));
      head.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(68, 122).m_171488_(0.1516F, -3.1245F, 0.3451F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-4.0F, -1.5F, -3.5F, 0.6771F, 0.6516F, 0.0668F));
      PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-4.5F, -0.5F, -3.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 14).m_171488_(-4.5F, 9.5F, -3.0F, 9.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(30, 0).m_171488_(-4.5F, 7.0F, -3.0F, 9.0F, 3.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      body.m_171599_("body_r1", CubeListBuilder.m_171558_().m_171514_(0, 48).m_171488_(-3.5F, -3.5F, -0.5F, 7.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, 3.5F, -3.0F, 0.1309F, 0.0F, 0.0F));
      PartDefinition left_arm = partdefinition.m_171599_("left_arm", CubeListBuilder.m_171558_().m_171514_(34, 39).m_171488_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).m_171514_(0, 40).m_171488_(0.5F, 7.0F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
      left_arm.m_171599_("cube_r5", CubeListBuilder.m_171558_().m_171514_(39, 18).m_171488_(-0.5F, 0.0F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.1309F));
      left_arm.m_171599_("cube_r6", CubeListBuilder.m_171558_().m_171514_(60, 8).m_171488_(-1.0F, -2.0F, -2.4F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(2.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
      left_arm.m_171599_("cube_r7", CubeListBuilder.m_171558_().m_171514_(0, 3).m_171488_(-1.5F, -1.5F, -0.5F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.2287F, -0.0261F, -2.7294F, 0.0253F, -0.2309F, 0.8245F));
      left_arm.m_171599_("cube_r8", CubeListBuilder.m_171558_().m_171514_(0, 26).m_171488_(2.5F, -4.5F, -5.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.0F, -3.5F, 0.5F, 0.3717F, 0.5313F, 0.4849F));
      left_arm.m_171599_("cube_r9", CubeListBuilder.m_171558_().m_171514_(34, 9).m_171488_(-5.0F, 0.0F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(3.5F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0873F));
      PartDefinition right_arm = partdefinition.m_171599_("right_arm", CubeListBuilder.m_171558_().m_171514_(18, 39).m_171488_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
      right_arm.m_171599_("cube_r10", CubeListBuilder.m_171558_().m_171514_(39, 18).m_171488_(-1.2437F, -2.9319F, -2.5F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.7563F, -1.0681F, 0.0F, 0.0F, 0.0F, -3.0107F));
      right_arm.m_171599_("cube_r11", CubeListBuilder.m_171558_().m_171514_(60, 0).m_171488_(-2.5932F, -1.2771F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-3.4068F, 5.7771F, 0.0062F, 3.1416F, 0.0F, 2.7489F));
      right_arm.m_171599_("cube_r12", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-0.2443F, -0.885F, 0.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.2557F, -0.615F, -3.227F, -2.8616F, -0.1031F, 0.5445F));
      right_arm.m_171599_("cube_r13", CubeListBuilder.m_171558_().m_171514_(0, 40).m_171488_(-0.5F, -1.5F, -2.5F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-3.0F, 8.5F, 0.0F));
      right_arm.m_171599_("cube_r14", CubeListBuilder.m_171558_().m_171514_(34, 9).m_171488_(-2.7264F, -2.201F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-1.2736F, -2.299F, 0.0F, 0.0F, 0.0F, 3.0543F));
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
