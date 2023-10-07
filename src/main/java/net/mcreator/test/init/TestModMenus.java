
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.test.world.inventory.SoudureMenu;
import net.mcreator.test.world.inventory.EnderfishMenu;
import net.mcreator.test.TestMod;

public class TestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TestMod.MODID);
	public static final RegistryObject<MenuType<EnderfishMenu>> ENDERFISH = REGISTRY.register("enderfish", () -> IForgeMenuType.create(EnderfishMenu::new));
	public static final RegistryObject<MenuType<SoudureMenu>> SOUDURE = REGISTRY.register("soudure", () -> IForgeMenuType.create(SoudureMenu::new));
}
