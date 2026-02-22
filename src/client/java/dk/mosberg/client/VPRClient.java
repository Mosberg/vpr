package dk.mosberg.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.client.datagen.VPRDataGenerator;
import net.fabricmc.api.ClientModInitializer;

public class VPRClient implements ClientModInitializer {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitializeClient() {
    // This entrypoint is suitable for setting up client-specific logic, such as
    // rendering.

    VPRDataGenerator.register();

    // Example: Add custom rendering or tooltips for Guard and Warrior profession
    // blocks
    // TODO: Implement custom block rendering and UI features for GuardPostBlock and
    // WarriorPostBlock

    LOGGER.info("VPR Client initialized!");
  }
}