package net.kloudcraft.kperms;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("kperms")
public class KPerms {
	
	private int storageArraySize;
	private final KPerms permissionsPlugin;
	private final KPermissionHandler handler;
	
	private final Logger logger = LogManager.getLogger();
	
	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	
	public KPerms() {
		permissionsPlugin = this;
		handler = new KPermissionHandler();
		modEventBus.register(net.kloudcraft.kperms.startup.CommonStartup.class);
	}
	
	public File getStorageDirectory() {
		return null;
	}
	
	public int getStorageArraySize() {
		return storageArraySize;
	}

}
