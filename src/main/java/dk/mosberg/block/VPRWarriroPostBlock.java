package dk.mosberg.block;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VPRWarriroPostBlock {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void register() {
    LOGGER.info("Registering Warrior Post Block");
  }
}
