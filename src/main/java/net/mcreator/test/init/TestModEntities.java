
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.test.entity.TestEntity;
import net.mcreator.test.entity.RoicreeperEntity;
import net.mcreator.test.entity.FirefishEntity;
import net.mcreator.test.TestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TestMod.MODID);
	public static final RegistryObject<EntityType<TestEntity>> TEST = register("test",
			EntityType.Builder.<TestEntity>of(TestEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TestEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<FirefishEntity>> FIREFISH = register("firefish",
			EntityType.Builder.<FirefishEntity>of(FirefishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FirefishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<RoicreeperEntity>> ROICREEPER = register("roicreeper", EntityType.Builder.<RoicreeperEntity>of(RoicreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(RoicreeperEntity::new).fireImmune().sized(0.6f, 1.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TestEntity.init();
			FirefishEntity.init();
			RoicreeperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TEST.get(), TestEntity.createAttributes().build());
		event.put(FIREFISH.get(), FirefishEntity.createAttributes().build());
		event.put(ROICREEPER.get(), RoicreeperEntity.createAttributes().build());
	}
}
