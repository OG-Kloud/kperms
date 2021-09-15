package net.kloudcraft.kperms;

import java.util.Collection;

import com.mojang.authlib.GameProfile;

import net.minecraftforge.server.permission.DefaultPermissionLevel;
import net.minecraftforge.server.permission.IPermissionHandler;
import net.minecraftforge.server.permission.context.IContext;

public class KPermissionHandler implements IPermissionHandler {

	@Override
	public void registerNode(String node, DefaultPermissionLevel level, String desc) {
		
	}

	@Override
	public Collection<String> getRegisteredNodes() {
		return null;
	}

	@Override
	public boolean hasPermission(GameProfile profile, String node, IContext context) {
		return false;
	}

	@Override
	public String getNodeDescription(String node) {
		return null;
	}
	
	

}
