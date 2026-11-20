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

public class ModelRougegear<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("relda", "model_rougegear"), "main");
   public final ModelPart body;
   public final ModelPart left_arm;
   public final ModelPart right_arm;

   public ModelRougegear(ModelPart root) {
      this.body = root.m_171324_("body");
      this.left_arm = root.m_171324_("left_arm");
      this.right_arm = root.m_171324_("right_arm");
   }

   public static LayerDefinition createBodyLayer() {
      MeshDefinition meshdefinition = new MeshDefinition();
      PartDefinition partdefinition = meshdefinition.m_171576_();
      PartDefinition body = partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(0, 25).m_171488_(-4.5F, -0.5F, -2.5F, 9.0F, 15.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      body.m_171599_("cube_r1", CubeListBuilder.m_171558_().m_171514_(14, 1).m_171488_(-5.0F, -5.25F, 0.0F, 6.0F, 9.5F, -0.5F, new CubeDeformation(-1.0F)), PartPose.m_171423_(1.693F, 8.2419F, -2.25F, 0.123F, 0.025F, 0.175F));
      body.m_171599_("cube_r2", CubeListBuilder.m_171558_().m_171514_(24, 0).m_171488_(-4.5F, -5.25F, 0.0F, 5.0F, 9.5F, 0.0F, new CubeDeformation(-1.0F)), PartPose.m_171423_(3.4154F, 11.2192F, -2.25F, 0.0418F, 0.0013F, 0.3775F));
      body.m_171599_("cube_r3", CubeListBuilder.m_171558_().m_171514_(2, 0).m_171488_(-1.5F, -1.75F, -0.5F, 2.0F, 3.5F, 0.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.0F, 5.25F, -3.0F, -0.1308F, 0.0038F, 0.0435F));
      body.m_171599_("cube_r4", CubeListBuilder.m_171558_().m_171514_(7, 1).m_171488_(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-2.5F, 3.0F, -3.0F, 0.0F, 0.0F, -0.3054F));
      body.m_171599_("body_r1", CubeListBuilder.m_171558_().m_171514_(0, 17).m_171488_(-5.75F, 2.5F, -3.0F, 9.5F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(5.1607F, 8.109F, 0.0F, 0.0F, 0.0F, 0.9163F));
      body.m_171599_("body_r2", CubeListBuilder.m_171558_().m_171514_(0, 17).m_171488_(-1.25F, 2.5F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(-0.25F, -1.0F, 0.0F, 0.0F, 0.0F, 1.1345F));
      partdefinition.m_171599_("left_arm", CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-1.5F, -2.5F, -2.5F, 5.0F, 5.5F, 5.0F, new CubeDeformation(0.0F)).m_171514_(43, 46).m_171488_(-1.5F, 6.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
      partdefinition.m_171599_("right_arm", CubeListBuilder.m_171558_().m_171514_(0, 46).m_171488_(-3.5F, -2.5F, -2.5F, 5.0F, 5.5F, 5.0F, new CubeDeformation(0.0F)).m_171514_(45, 35).m_171488_(-4.0F, 6.0F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
      return LayerDefinition.m_171565_(meshdefinition, 128, 128);
   }

   public void m_6973_(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
   }

   public void m_7695_(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
      this.body.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.left_arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
      this.right_arm.m_104306_(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
   }
}
