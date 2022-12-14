package com.touhou.yukkuri.entity.renderer;

import com.touhou.yukkuri.entity.models.SakuyaModel;
import com.touhou.yukkuri.entity.characters.SakuyaEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SakuyaRenderer extends GeoEntityRenderer<SakuyaEntity> {
    public SakuyaRenderer(EntityRendererFactory.Context context) {
        super(context, new SakuyaModel());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(SakuyaEntity entity) {
        return this.getTextureResource(entity);
    }
}
