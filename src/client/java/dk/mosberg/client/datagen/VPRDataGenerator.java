package dk.mosberg.client.datagen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class VPRDataGenerator implements DataGeneratorEntrypoint {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {

  }

  public static void register() {

    LOGGER.info("VPR Data Generator initialized!");
  }
}
