package dk.mosberg.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dk.mosberg.data.block.VPRBlockData;
import dk.mosberg.data.profession.VPRProfessionData;

public class VPRJsonDataLoader {
  public static final String MOD_ID = "vpr";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  public static void loadJsonData() {
    // This method can be used to load any JSON data you need for your mod.
    // For example, you might want to load custom block or profession data from JSON
    // files.
    // You can use a library like Gson to parse the JSON files and create your data
    // objects.

    LOGGER.info("VPR JSON data loaded!");
  }

  public static void register() {
    VPRBlockData.register();
    VPRProfessionData.register();

    LOGGER.info("VPR JSON data registered!");
  }
}
