package net.kloudcraft.kperms;

import java.io.File;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.javafmlmod.FMLModContainer;

@Mod("kperms")
public class KPerms {
	
	private int storageArraySize;
	private final KPerms permissionsPlugin;
	
	
	public KPerms() {
		permissionsPlugin = this;
	}
	
	public File getStorageDirectory() {
		return null;
	}
	
	public int getStorageArraySize() {
		return storageArraySize;
	}

}
