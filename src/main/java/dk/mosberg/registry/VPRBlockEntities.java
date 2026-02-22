package dk.mosberg.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.block.entity.VPRGuardPostBlockEntity;
import dk.mosberg.block.entity.VPRWarriorPostBlockEntity;

public class VPRBlockEntities {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    VPRGuardPostBlockEntity.register();
    VPRWarriorPostBlockEntity.register();

    LOGGER.info("Registering block entities for " + MOD_ID);
  }
}
