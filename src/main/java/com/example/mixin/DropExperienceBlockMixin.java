package com.example.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.DropExperienceBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(DropExperienceBlock.class)
public class DropExperienceBlockMixin {
    /**
     * @author YourName
     * @reason Remove all XP from ores
     */
    @Overwrite
    public int getExperienceDrop(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack, boolean dropExperience) {
        return 0;
    }
}
