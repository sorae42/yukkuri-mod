package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;

public class AliceEntity extends DefaultYukkuri implements IAnimatable {
    public AliceEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initCustomGoals() {
        this.goalSelector.add(0, new LookAtEntityGoal(this, MarisaEntity.class, 12f));
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.ALICE_YUKKURI_TYPE.create(world);
    }
}
