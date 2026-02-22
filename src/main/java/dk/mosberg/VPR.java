package dk.mosberg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.data.VPRJsonDataLoader;
import dk.mosberg.registry.VPRBlockEntities;
import dk.mosberg.registry.VPRBlocks;
import dk.mosberg.registry.VPRConfigs;
import dk.mosberg.registry.VPRItemGroups;
import dk.mosberg.registry.VPRItems;
import dk.mosberg.registry.VPRProfessions;
import net.fabricmc.api.ModInitializer;

public class VPR implements ModInitializer {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    VPRJsonDataLoader.loadJsonData();

    VPRItems.register();
    VPRBlocks.register();
    VPRBlockEntities.register();
    VPRProfessions.register();
    VPRConfigs.register();
    VPRItemGroups.register();

    LOGGER.info("VPR initialized!");
  }
}