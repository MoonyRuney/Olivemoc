package net.moonyruney.olivemod.util;

import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.moonyruney.olivemod.OliveMod;
import net.moonyruney.olivemod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
import net.minecraft.loot.entry.ItemEntry;

public class ModLootTableModifiers {


    public static void modifyLootTables() {

        OliveMod.LOGGER.info("Modifying Loot Tables for " + OliveMod.MOD_ID);

        //Azalea Leaves loot table
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (Blocks.AZALEA_LEAVES.getLootTableId().equals(id) && source.isBuiltin()) {
                LootPool.Builder pool = LootPool.builder()
                        // Add diamonds...
                        .with(ItemEntry.builder(ModItems.OLIVE))
                        //10% drop rate
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        // ...only if the block would survive a potential explosion.
                        .conditionally(SurvivesExplosionLootCondition.builder());

                tableBuilder.pool(pool);
            }
        });

    };
}
