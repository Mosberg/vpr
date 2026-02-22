package dk.mosberg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.registry.ModBlocks;
import dk.mosberg.registry.ModItemGroups;
import dk.mosberg.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class VPR implements ModInitializer {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    ModItems.initialize();
    ModBlocks.initialize();
    ModItemGroups.initialize();

    LOGGER.info("VPR initialized!");
  }
}