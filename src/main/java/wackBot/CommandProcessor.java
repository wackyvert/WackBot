package wackBot;




import commandClasses.*;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.impl.obj.PrivateChannel;
import sx.blah.discord.handle.impl.obj.ReactionEmoji;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.util.EmbedBuilder;
import sx.blah.discord.util.RequestBuffer;
import java.io.IOException;

import static wackBot.BotMain.main;



public class CommandProcessor {
   public IUser sender;
    public IChannel channel;
    public IGuild guild;
    public static void getAuditLog()
    {
        System.out.println("yeet");
    }

    public static void processCommand(IMessage message, IDiscordClient bot, String prefix) throws InterruptedException, IOException {
        IUser sender=message.getAuthor();
        IChannel channel=message.getChannel();
        IGuild guild=message.getGuild();


        String[] command = message.getContent().toLowerCase().replaceFirst(prefix, "").split(" ");
        if (command[0].equals("request") & !sender.isBot()) {
            Request.Request(message);
        } else if (command[0].equals("<@505129765959893013>")) {
            Help.Help(message, bot);
        } else if (command[0].equals("coinflip")) {
            Coinflip.Coinflip(message);
        } else if (command[0].equals("analysis")) {
            Analysis.Analysis(message);
        } else if (command[0].equals("help")) {
            Help.Help(message, bot);
        } else if (command[0].equals("getonlineadrian")){
            GetOnlineAdrian.getOnlineAdrian(message);
        } else if (command[0].equals("dia")) {
            Dia.Dia(message);
        } else if (command[0].equals("hij")) {
            Hij.Hij(message);
        } else if (command[0].equals("hillary")) {
            Hillary.hillary(message);
        } else if (command[0].equals("memereview")) {
            MemeReview.Dia(message);
        } else if (command[0].equals("ratememe")) {
            RateMeme.rate(message);
        }


    }



}
