package me.brynview.navidrohim.fastghast.mixin;

import net.minecraft.world.entity.animal.HappyGhast;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(HappyGhast.class)
public class MixinFasterGhast {
    @ModifyArgs(
            method = "getRiddenInput",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/phys/Vec3;scale(D)Lnet/minecraft/world/phys/Vec3;"
            )
    )
    private void modifyScaleArg(Args args) { // We modify getRiddenInput because if we modify the FLYING_SPEED attribute, that will also change the idle flying speed for the Happy ghast.
        double originalScale = args.get(0); // get the scale passed into .scale()
        args.set(0, originalScale * 3.5D) ;
    }

}