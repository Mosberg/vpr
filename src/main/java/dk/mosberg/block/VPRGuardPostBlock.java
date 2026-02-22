package dk.mosberg.block;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.block.Block;

public class VPRGuardPostBlock {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
  public static Block GUARD_POST;

  public static void register() {

    LOGGER.info("Registering Guard Post Block");
  }
}
