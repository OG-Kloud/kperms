package net.kloudcraft.kperms;

import java.io.File;

public class PermissionFileStorage {
	
	private final File directory;
	private File[] numberOfFiles;
	
	private final KPerms permissionPlugin;
	
	public PermissionFileStorage(KPerms plugin) {
		permissionPlugin = plugin;
		
		directory = plugin.getStorageDirectory();
		numberOfFiles = new File[plugin.getStorageArraySize()];
	}
	
	
	public void write() {
		
	}
	
	public void read() {
		
	}

}
