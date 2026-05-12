package mod.joash.tutorial;

import mod.joash.tutorial.block.ModBlocks;
import mod.joash.tutorial.component.ModDataComponentTypes;
import mod.joash.tutorial.item.ModItemGroups;
import mod.joash.tutorial.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerItems();
		ModBlocks.registerBlocks();

		ModDataComponentTypes.registerDataComponentTypes();
		// Transforma o item escolhido em um item que pode ser usado como combustivel
		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 900);

		LOGGER.info("Hello Fabric world!");
	}

}