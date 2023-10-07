
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

import net.mcreator.test.item.CutstonItem;
import net.mcreator.test.item.AquaItem;
import net.mcreator.test.item.AmeItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> AME = REGISTRY.register("ame", () -> new AmeItem());
	public static final RegistryObject<Item> BLOCKAQUA = block(TestModBlocks.BLOCKAQUA);
	public static final RegistryObject<Item> AQUA = REGISTRY.register("aqua", () -> new AquaItem());
	public static final RegistryObject<Item> CUTSTON = REGISTRY.register("cutston", () -> new CutstonItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
