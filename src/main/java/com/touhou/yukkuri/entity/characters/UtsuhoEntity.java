package com.touhou.yukkuri.entity.characters;

import com.touhou.yukkuri.entity.EntityRegistry;
import com.touhou.yukkuri.sounds.SoundRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.world.World;

public class UtsuhoEntity extends DefaultYukkuri {
    public UtsuhoEntity(EntityType<? extends PassiveEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return EntityRegistry.UTSUHO_YUKKURI_TYPE.create(world);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundRegistry.ENTITY_UTSUHO_UNYU;
    }

    @Override
    public void playAmbientSound() {
        if (!world.isClient) {
            this.playSound(getAmbientSound(), 1, 1);
        }
    }
}
