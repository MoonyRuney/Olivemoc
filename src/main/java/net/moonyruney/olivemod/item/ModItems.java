package net.moonyruney.olivemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moonyruney.olivemod.OliveMod;
import net.moonyruney.olivemod.item.Custom.IronBrewItem;
import net.moonyruney.olivemod.item.Custom.OliveOilItem;
import net.moonyruney.olivemod.item.Custom.RedSauceItem;

public class ModItems {

    public static final Item OLIVE = registerItem("olive",new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.OLIVE)));
    public static final Item OLIVE_OIL = registerItem("oliveoil", new OliveOilItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.OLIVE_OIL)));
    public static final Item IRON_BREW = registerItem("ironbrew",new IronBrewItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.IRON_BREW)));
    public static final Item BUNGER = registerItem("bunger", new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BUNGER)));
    public static final Item RED_SAUCE = registerItem("redsauce", new RedSauceItem(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.REDSAUCE)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OliveMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OliveMod.LOGGER.info("Registering Mod Items for " + OliveMod.MOD_ID);

    }

}
