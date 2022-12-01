package com.touhou.yukkuri.yukkuri.entity.renderer;

import com.touhou.yukkuri.yukkuri.entity.characters.%String%Entity;
import com.touhou.yukkuri.yukkuri.entity.models.%String%Model;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class %String%Renderer extends GeoEntityRenderer<%String%Entity> {
    public %String%Renderer(EntityRendererFactory.Context context) {
        super(context, new %string%Model());
        this.shadowOpacity = 1f;
    }

    @Override
    public Identifier getTextureResource(%String%Entity entity) {
        return this.getTextureResource(entity);
    }
}
