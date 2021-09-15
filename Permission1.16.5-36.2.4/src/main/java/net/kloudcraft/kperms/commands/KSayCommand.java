package net.kloudcraft.kperms.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.command.arguments.MessageArgument;
import net.minecraft.entity.Entity;
import net.minecraft.util.Util;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class KSayCommand {
	//SayCommand
	
	
	
	
	 public static void register(CommandDispatcher<CommandSource> dispatcher) {
		    LiteralArgumentBuilder<CommandSource> sayCommand
		            = Commands.literal("say")
		                 .requires((commandSource) -> commandSource.hasPermission(2))
		                 .then(Commands.argument("message", MessageArgument.message())
		                         .executes(KSayCommand::sendMessage)
		                      );

		    dispatcher.register(sayCommand);
		  }
	 
	 
	 static int sendMessage(CommandContext<CommandSource> commandContext) throws CommandSyntaxException {
		 Entity entity = commandContext.getSource().getEntity();
		 ITextComponent messageValue = MessageArgument.getMessage(commandContext, "message");
		 
		 StringBuilder output = new StringBuilder();
		 output.append("Sent as Kloud");
		 output.append(messageValue.getString());
		 
		 TranslationTextComponent finalText = new TranslationTextComponent("chat.type.announcement",
		            commandContext.getSource().getDisplayName(), output);
		 
		    if (entity != null) {
		      commandContext.getSource().getServer().getPlayerList().broadcastMessage(finalText, ChatType.CHAT, entity.getUUID());
		      //func_232641_a_ is sendMessage()
		    } else {
		      commandContext.getSource().getServer().getPlayerList().broadcastMessage(finalText, ChatType.SYSTEM, Util.NIL_UUID);
		    }
		    return 1;
	 }

}
