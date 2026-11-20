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

public class Modelgandalfgear<T extends Entity> extends EntityModel<T> {
   public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("relda", "modelgandalfgear"), "main");
   public final ModelPart head;
   public final ModelPart body;
   public final ModelPart left_arm;
   public final ModelPart right_arm;
   public final ModelPart left_leg;
   public final ModelPart right_leg;

   public Modelgandalfgear(ModelPart root) {
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
      PartDefinition head = partdefinition.m_171599_("head", CubeListBuilder.m_171558_(), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      head.m_171599_("bone2", CubeListBuilder.m_171558_().m_171514_(0, 15).m_171488_(-7.1082F, 0.4881F, -7.0F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -9.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
      head.m_171599_("bone", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(0.1082F, 0.4881F, -7.0F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
      PartDefinition bone7 = head.m_171599_("bone7", CubeListBuilder.m_171558_().m_171514_(28, 0).m_171488_(-4.5F, -2.5F, 0.0F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -8.0F, -4.5F, -0.1309F, 0.0F, 0.0F));
      PartDefinition bone3 = bone7.m_171599_("bone3", CubeListBuilder.m_171558_().m_171514_(0, 18).m_171488_(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -2.5F, 0.0F, -0.3927F, 0.0F, 0.0F));
      PartDefinition bone4 = bone3.m_171599_("bone4", CubeListBuilder.m_171558_().m_171514_(0, 20).m_171488_(-3.0F, -3.0F, 0.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -4.0F, 0.5F, -0.3491F, 0.0F, 0.0F));
      PartDefinition bone5 = bone4.m_171599_("bone5", CubeListBuilder.m_171558_().m_171514_(0, 19).m_171488_(-2.5F, -4.0F, 0.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -3.0F, 0.0F, -0.48F, 0.0F, 0.0F));
      bone5.m_171599_("bone6", CubeListBuilder.m_171558_().m_171514_(0, 0).m_171488_(-1.5F, -3.0F, 0.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.m_171423_(0.0F, -4.0F, 0.0F, -0.48F, 0.0F, 0.0F));
      partdefinition.m_171599_("body", CubeListBuilder.m_171558_().m_171514_(30, 30).m_171488_(-4.5F, -0.5F, -3.0F, 9.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(0, 36).m_171488_(-4.5F, 9.5F, -3.0F, 9.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).m_171514_(52, 12).m_171488_(-4.5F, 7.5F, -2.5F, 9.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(0.0F, 0.0F, 0.0F));
      partdefinition.m_171599_("left_arm", CubeListBuilder.m_171558_().m_171514_(30, 44).m_171488_(-1.5F, -2.5F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.m_171419_(5.0F, 2.0F, 0.0F));
      partdefinition.m_171599_("right_arm", CubeListBuilder.m_171558_().m_171514_(0, 50).m_171488_(-3.5F, -2.5F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.m_171419_(-5.0F, 2.0F, 0.0F));
      partdefinition.m_171599_("left_leg", CubeListBuilder.m_171558_().m_171514_(4, 30).m_171488_(-2.5F, -2.5F, -3.0F, 5.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(2.0F, 12.0F, 0.0F));
      partdefinition.m_171599_("right_leg", CubeListBuilder.m_171558_().m_171514_(4, 30).m_171488_(-2.5F, -2.5F, -3.0F, 5.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.m_171419_(-2.0F, 12.0F, 0.0F));
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
