package net.kloudcraft.kperms.startup;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class CommonStartup {

	@SubscribeEvent
	public static void onCommonSetupEvent(FMLCommonSetupEvent event) {
		MinecraftForge.EVENT_BUS.register(RegisterCommandEvent.class);
	}
	
	

}
