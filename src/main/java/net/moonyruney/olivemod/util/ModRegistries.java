package net.moonyruney.olivemod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.moonyruney.olivemod.OliveMod;
import net.moonyruney.olivemod.item.ModItems;

public class ModRegistries {
    public static void registerModStuffs() {


    }

    private static void registerFuels() {

        OliveMod.LOGGER.info("Registering Fuels for "+ OliveMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.OLIVE, 400);
        registry.add(ModItems.OLIVE_OIL, 6400);
    }

}
