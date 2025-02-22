package com.github.alexthe666.iceandfire.entity.ai;

import com.github.alexthe666.iceandfire.entity.DragonUtils;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import com.github.alexthe666.iceandfire.entity.StoneEntityProperties;
import net.ilexiconn.llibrary.server.entity.EntityPropertiesHandler;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

public class DragonAIWaterTarget extends EntityAIBase {
    private final EntityIceDragon dragon;

    public DragonAIWaterTarget(EntityIceDragon dragon) {
        this.dragon = dragon;
        this.setMutexBits(1);
    }

    public boolean shouldExecute() {
        if (dragon != null) {
            if (dragon.isSleeping()) {
                return false;
            }
            if (!dragon.isInWater()) {
                return false;
            }
            if (dragon.isPlayerControlled()) {
                return false;
            }
            if (dragon.waterTarget != null && (dragon.isTargetBlocked(new Vec3d(dragon.waterTarget)))) {
                dragon.waterTarget = null;
            }

            if (dragon.waterTarget == null || dragon.isTargetBlocked(new Vec3d(dragon.waterTarget))) {
                EntityLivingBase attackTarget = dragon.getAttackTarget();
                if (attackTarget != null) {
                    dragon.waterTarget = new BlockPos(attackTarget.posX, attackTarget.posY, attackTarget.posZ);
                    return true;
                }
                BlockPos pos = this.getNearbyWaterTarget();
                if (pos == null) {
                    dragon.waterTarget = null;
                    return false;
                }
                Vec3d vec = new Vec3d(pos);
                dragon.waterTarget = new BlockPos(vec.x, vec.y, vec.z);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean shouldContinueExecuting() {
        if (!dragon.isInWater()) {
            return false;
        }
        if (dragon.isSleeping()) {
            return false;
        }
        StoneEntityProperties capability = EntityPropertiesHandler.INSTANCE.getProperties(dragon, StoneEntityProperties.class);
        if (capability != null && capability.isStone) {
            return false;
        }
        EntityLivingBase attackTarget = dragon.getAttackTarget();
        if (attackTarget != null) {
            dragon.waterTarget = new BlockPos(attackTarget.posX, attackTarget.posY, attackTarget.posZ);
        }
        if (dragon.waterTarget != null) {
            if (dragon.isTargetBlocked(new Vec3d(dragon.waterTarget))) {
                dragon.waterTarget = null;
                return false;
            }
            return true;
        }
        return false;
    }

    public BlockPos getNearbyWaterTarget() {
        if (dragon.getAttackTarget() == null) {
            BlockPos pos = DragonUtils.getWaterBlockInView(dragon);
            if (pos != null && dragon.world.getBlockState(pos).getMaterial() == Material.WATER) {
                return pos;
            }
        }
        return null;
    }

}