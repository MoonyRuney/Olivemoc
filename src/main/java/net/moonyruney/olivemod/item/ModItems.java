package net.moonyruney.olivemod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moonyruney.olivemod.OliveMod;

public class ModItems {

    public static final Item OLIVE = registerItem("olive",new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.OLIVE)));
    public static final Item OLIVE_OIL = registerItem("oliveoil", new Item(new FabricItemSettings(). group(ItemGroup.FOOD).food(ModFoodComponents.OLIVE_OIL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OliveMod.MOD_ID, name), item);
    };

    public static void registerModItems() {
        OliveMod.LOGGER.info("Registering mod items for " + OliveMod.MOD_ID);

    }

}
