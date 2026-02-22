package dk.mosberg.registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.block.VPRGuardPostBlock;
import dk.mosberg.block.VPRWarriorPostBlock;

public class VPRBlocks {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  private VPRBlocks() {
    // Private constructor to prevent instantiation
  }

  public static void register() {

    VPRGuardPostBlock.register();
    VPRWarriorPostBlock.register();

    LOGGER.info("Registering blocks for " + MOD_ID);
  }
}
