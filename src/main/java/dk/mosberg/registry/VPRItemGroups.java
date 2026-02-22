package dk.mosberg.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VPRItemGroups {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    LOGGER.info("Registering item groups for " + MOD_ID);
  }
}
