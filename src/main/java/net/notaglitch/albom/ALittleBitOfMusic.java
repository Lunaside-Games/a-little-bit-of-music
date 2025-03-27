package net.notaglitch.albom;

import net.fabricmc.api.ModInitializer;

import net.notaglitch.albom.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ALittleBitOfMusic implements ModInitializer {
	public static final String MOD_ID = "albom";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}