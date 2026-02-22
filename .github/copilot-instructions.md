# Copilot Instructions for Villager Professions Reimagined (VPR)

## Project Overview

- **VPR** is a Minecraft Fabric mod that adds new villager professions (Guard, Warrior) and custom trades.
- The mod is **data-driven**: professions, trades, blocks, and loot tables are defined in JSON files under `src/main/resources/data/vpr/`.
- The main entrypoint is [src/main/java/dk/mosberg/VPR.java](src/main/java/dk/mosberg/VPR.java), which initializes all core registries and data loaders.

## Architecture & Patterns

- **Registries**: Each major component (items, blocks, professions, configs, block entities, item groups) has a registry class in [src/main/java/dk/mosberg/registry/](src/main/java/dk/mosberg/registry/). Each registry exposes a static `register()` method.
- **Data Loading**: [VPRJsonDataLoader](src/main/java/dk/mosberg/data/VPRJsonDataLoader.java) loads JSON data for blocks and professions. Extend this for new data-driven features.
- **Profession Logic**: Custom professions are implemented in [src/main/java/dk/mosberg/profession/](src/main/java/dk/mosberg/profession/), each with a `register()` method.
- **Block/Item Definitions**: Custom blocks and items are defined in [src/main/java/dk/mosberg/block/](src/main/java/dk/mosberg/block/) and [src/main/java/dk/mosberg/registry/VPRItems.java](src/main/java/dk/mosberg/registry/VPRItems.java).
- **Mixins**: Use [src/main/resources/vpr.mixins.json](src/main/resources/vpr.mixins.json) and [src/client/resources/vpr.client.mixins.json](src/client/resources/vpr.client.mixins.json) for code injection via SpongePowered Mixin.

## Developer Workflows

- **Build**: Use `./gradlew build` (or `gradlew.bat build` on Windows) to build the mod. Artifacts are output to `build/libs/`.
- **Data Generation**: Data generation entrypoint is [VPRDataGenerator](src/client/java/dk/mosberg/client/datagen/VPRDataGenerator.java). Extend for custom data gen tasks.
- **Testing**: No explicit test sources found; add tests under `src/test/java/` if needed.
- **Debugging**: Use mixins for runtime code injection. Logging is via SLF4J (`LoggerFactory.getLogger`).
- **CI**: GitHub Actions workflow ([.github/workflows/build.yml](.github/workflows/build.yml)) builds on push/PR, using Java 25 and uploads artifacts.

## Project Conventions

- **Java 21**: All code and builds target Java 21 (see `build.gradle`).
- **Fabric API**: Uses Fabric API and Yarn mappings (see `gradle.properties`).
- **JSON Structure**: Blocks, professions, loot tables, and items are defined in JSON. Follow existing schema for new content.
- **Logging**: Use SLF4J for all logging; each registry/component has its own logger.
- **Modular Registration**: All registration is done via static `register()` methods, called from the main initializer.

## Integration & References

- **External Docs**: See [.github/REMOTE-INDEX.md](.github/REMOTE-INDEX.md) for links to Fabric/Yarn API docs relevant to villager and trade logic.
- **Entrypoints**: Defined in [fabric.mod.json](src/main/resources/fabric.mod.json) for main, client, and data generation.

## Examples

- To add a new profession:
  1. Create a JSON file in `src/main/resources/data/vpr/profession/`.
  2. Implement a Java class in `src/main/java/dk/mosberg/profession/` with a `register()` method.
  3. Update the relevant registry and initializer.
- To add a new block/item:
  1. Define JSON in `data/vpr/block/` or `assets/vpr/items/`.
  2. Implement Java class in `block/` or `registry/`.

---

**Feedback Requested:**
If any section is unclear or missing, please specify what needs improvement or additional detail.
