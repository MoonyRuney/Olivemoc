package net.moonyruney.olivemod;

import net.fabricmc.api.ModInitializer;
import net.moonyruney.olivemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OliveMod implements ModInitializer {
	public static final String MOD_ID = "olivemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
