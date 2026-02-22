package dk.mosberg.data.block;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VPRBlockData {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    LOGGER.info("Registering blocks...");
  }
}
