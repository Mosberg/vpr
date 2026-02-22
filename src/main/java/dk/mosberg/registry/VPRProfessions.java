package dk.mosberg.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.profession.VPRGuard;
import dk.mosberg.profession.VPRWarrior;

public class VPRProfessions {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    VPRGuard.register();
    VPRWarrior.register();

    LOGGER.info("Registering professions...");
  }
}
