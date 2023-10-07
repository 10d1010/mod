
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.test.item.GembruteItem;
import net.mcreator.test.item.GEMarmorArmorItem;
import net.mcreator.test.item.GEMItem;
import net.mcreator.test.item.CutstonItem;
import net.mcreator.test.item.BurgerItem;
import net.mcreator.test.item.AquaItem;
import net.mcreator.test.item.AmeItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> AME = REGISTRY.register("ame", () -> new AmeItem());
	public static final RegistryObject<Item> BLOCKAQUA = block(TestModBlocks.BLOCKAQUA);
	public static final RegistryObject<Item> AQUA = REGISTRY.register("aqua", () -> new AquaItem());
	public static final RegistryObject<Item> CUTSTON = REGISTRY.register("cutston", () -> new CutstonItem());
	public static final RegistryObject<Item> GEM = REGISTRY.register("gem", () -> new GEMItem());
	public static final RegistryObject<Item> GEMBRUTE = REGISTRY.register("gembrute", () -> new GembruteItem());
	public static final RegistryObject<Item> GE_MARMOR_ARMOR_HELMET = REGISTRY.register("ge_marmor_armor_helmet", () -> new GEMarmorArmorItem.Helmet());
	public static final RegistryObject<Item> GE_MARMOR_ARMOR_CHESTPLATE = REGISTRY.register("ge_marmor_armor_chestplate", () -> new GEMarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> GE_MARMOR_ARMOR_LEGGINGS = REGISTRY.register("ge_marmor_armor_leggings", () -> new GEMarmorArmorItem.Leggings());
	public static final RegistryObject<Item> GE_MARMOR_ARMOR_BOOTS = REGISTRY.register("ge_marmor_armor_boots", () -> new GEMarmorArmorItem.Boots());
	public static final RegistryObject<Item> BURGER = REGISTRY.register("burger", () -> new BurgerItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
