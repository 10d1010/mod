
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.test.TestMod;

public class TestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TestMod.MODID);
	public static final RegistryObject<SoundEvent> ONEPIECE = REGISTRY.register("onepiece", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("test", "onepiece")));
}
