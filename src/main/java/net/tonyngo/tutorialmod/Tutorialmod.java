package net.tonyngo.tutorialmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tutorialmod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorial-mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}