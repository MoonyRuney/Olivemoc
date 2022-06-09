package net.moonyruney.olivemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.moonyruney.olivemod.item.ModItems;
import net.moonyruney.olivemod.util.ModLootTableModifiers;
import net.moonyruney.olivemod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OliveMod implements ModInitializer {
	public static final String MOD_ID = "olivemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


		ModRegistries.registerModStuffs();
		ModLootTableModifiers.modifyLootTables();



		LOGGER.info("Olive Mod READY");
	}
}
