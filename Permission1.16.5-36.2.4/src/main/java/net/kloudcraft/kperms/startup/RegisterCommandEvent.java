package net.kloudcraft.kperms.startup;

import com.mojang.brigadier.CommandDispatcher;

import net.kloudcraft.kperms.commands.KSayCommand;
import net.minecraft.command.CommandSource;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RegisterCommandEvent {
	
	@SubscribeEvent
	  public static void onRegisterCommandEvent(RegisterCommandsEvent event) {
	    CommandDispatcher<CommandSource> commandDispatcher = event.getDispatcher();
	    KSayCommand.register(commandDispatcher);
	    //MBEsayCommand.register(commandDispatcher);
	 }

}
