package dk.mosberg.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.config.VPRProfessionsConfig;

public class VPRConfigs {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    VPRProfessionsConfig.register();

    LOGGER.info("Registering configs for " + MOD_ID);
  }
}
