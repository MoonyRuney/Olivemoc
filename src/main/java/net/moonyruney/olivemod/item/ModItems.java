package net.moonyruney.olivemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moonyruney.olivemod.OliveMod;
import net.moonyruney.olivemod.item.Custom.IronBrewItem;
import net.moonyruney.olivemod.item.Custom.ModArmorItem;
import net.moonyruney.olivemod.item.Custom.OliveOilItem;
import net.moonyruney.olivemod.item.Custom.RedSauceItem;

public class ModItems {

    //FOOD
    public static final Item OLIVE = registerItem("olive",new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.OLIVE)));
    public static final Item OLIVE_OIL = registerItem("oliveoil", new OliveOilItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.OLIVE_OIL)));
    public static final Item IRON_BREW = registerItem("ironbrew",new IronBrewItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.IRON_BREW)));
    public static final Item BUNGER = registerItem("bunger", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BUNGER)));
    public static final Item RED_SAUCE = registerItem("redsauce", new RedSauceItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.REDSAUCE)));

    //TROLLIUM
    public static final Item TROLLIUM_INGOT = registerItem("trollium_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item RAW_TROLLIUM = registerItem("raw_trollium", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item TROLLIUM_NUGGET = registerItem("trollium_nugget", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));


    public static final Item TROLLIUM_HELMET = registerItem("trollium_helmet", new ArmorItem(ModArmorMaterials.TROLLIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TROLLIUM_CHESTPLATE = registerItem("trollium_chestplate", new ArmorItem(ModArmorMaterials.TROLLIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TROLLIUM_LEGGINGS = registerItem("trollium_leggings", new ArmorItem(ModArmorMaterials.TROLLIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item TROLLIUM_BOOTS = registerItem("trollium_boots", new ArmorItem(ModArmorMaterials.TROLLIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));



    //DECEIUM
    public static final Item DECEIUM_INGOT = registerItem("deceium_ingot", new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //public static final Item DECEIUM_HELMET = registerItem("deceium_helmet", new ArmorItem(ModArmorMaterials.DECEIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.COMBAT)));
    //public static final Item DECEIUM_CHESTPLATE = registerItem("deceium_chestplate", new ArmorItem(ModArmorMaterials.DECEIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT)));
    //public static final Item DECEIUM_LEGGINGS = registerItem("deceium_leggings", new ArmorItem(ModArmorMaterials.DECEIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT)));
    //public static final Item DECEIUM_BOOTS = registerItem("deceium_boots", new ArmorItem(ModArmorMaterials.DECEIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT)));



    //METHODS
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OliveMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OliveMod.LOGGER.info("Registering Mod Items for " + OliveMod.MOD_ID);

    }

}
