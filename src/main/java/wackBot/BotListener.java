package wackBot;

import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

import java.io.IOException;

public class BotListener {
    public static String prefix = new String("/");


    @EventSubscriber
    public void onMessageEvent(MessageReceivedEvent event) throws InterruptedException, IOException {


        if (event.getMessage().getContent().toLowerCase().startsWith(prefix));
        CommandProcessor.processCommand(event.getMessage(), prefix);
    }
}
