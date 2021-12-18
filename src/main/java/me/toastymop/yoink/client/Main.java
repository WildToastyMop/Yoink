package me.toastymop.yoink.client;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ClientModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger logger = LogManager.getLogger("yoink");
	public static final String MODID = "yoink";

	@Override
	public void onInitializeClient() {

	}
}
