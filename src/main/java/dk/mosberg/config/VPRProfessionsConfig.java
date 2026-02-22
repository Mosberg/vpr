package dk.mosberg.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VPRProfessionsConfig {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    LOGGER.info("Registering professions config...");
  }
}
