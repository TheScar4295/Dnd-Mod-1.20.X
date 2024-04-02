package com.thescar.dnd.entity;

import com.thescar.dnd.DnD;
import com.thescar.dnd.entity.custom.WargEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
   public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
           DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DnD.MOD_ID);

   public static final RegistryObject<EntityType<WargEntity>> WARG =
           ENTITY_TYPES.register("warg", () -> EntityType.Builder.of(WargEntity::new, MobCategory.CREATURE)
                   .sized(1.3f, 1.7f).build("warg"));

   public static void register(IEventBus eventBus) {
       ENTITY_TYPES.register(eventBus);
   }
}
