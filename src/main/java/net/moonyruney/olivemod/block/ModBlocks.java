package net.moonyruney.olivemod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moonyruney.olivemod.OliveMod;

public class ModBlocks {

    public static final Block TROLLIUM_ORE = registerBlock("trollium_ore", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f).luminance(4)), ItemGroup.MISC);
    public static final Block DEEPSLATE_TROLLIUM_ORE = registerBlock("deepslate_trollium_ore", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.5f, 3.0f)), ItemGroup.MISC);




    public static final Block DECEIUM_ORE = registerBlock("deceium_ore", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f)), ItemGroup.MISC);
    public static final Block DEEPSLATE_DECEIUM_ORE = registerBlock("deepslate_deceium_ore", new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.5f, 3.0f)), ItemGroup.MISC);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(OliveMod.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(OliveMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        OliveMod.LOGGER.info("Registering Mod Blocks for " + OliveMod.MOD_ID);

    }
}
