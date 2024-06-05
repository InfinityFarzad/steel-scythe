package net.farzad.steel_scythe.mixin;

import net.farzad.steel_scythe.SteelScythe;
import net.farzad.steel_scythe.item.ModItems;
import net.farzad.steel_scythe.SteelScythe;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.model.ModelLoader;
import net.minecraft.client.util.ModelIdentifier;
import net.minecraft.item.Item;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.profiler.Profiler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelLoader.class)
public abstract class ModelLoaderMixin {
    @Shadow
    protected abstract void addModel(ModelIdentifier modelId);

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/model/ModelLoader;addModel(Lnet/minecraft/client/util/ModelIdentifier;)V", ordinal = 3, shift = At.Shift.AFTER))
    public void addBigItemModels(ResourceManager resourceManager, BlockColors blockColors, Profiler profiler, int mipmapLevel, CallbackInfo ci) {

        for (Item item : ModItems.bigItems){
            this.addModel(new ModelIdentifier(SteelScythe.MOD_ID, item.getTranslationKey().replace("item.steel_scythe.", "") + "_big", "inventory"));
        }
    }
}
