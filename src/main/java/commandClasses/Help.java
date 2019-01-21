package commandClasses;

import sx.blah.discord.handle.impl.obj.PrivateChannel;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.util.EmbedBuilder;
import wackBot.CommandProcessor;

import static wackBot.BotMain.bot;

public class Help extends CommandProcessor {

    public static void Help(IMessage message){

        EmbedBuilder HelpEmbed = new EmbedBuilder();
                HelpEmbed.appendField("Simple bot, WIP", "Number 15: Burger King Foot Lettuce", true);
                HelpEmbed.appendField(":tada: Created by Wackyvert (Jake Torgerson) :tada:", "[Click here for a good band](https://imgur.com/a/0fty1tM)", false);
                HelpEmbed.withAuthorName("Wackyvert");
                HelpEmbed.withColor(0, 255, 0);
                HelpEmbed.withDescription("Made using Discord4J and @robot_rover, \nCommands:" +
                        "\n/help: Sends user PM containing this exact message!" +
                        "\n/analysis: Sends a command asking Kowalski for an analysis." +
                        "\n/info: Sends a simplified version of the help text without the command list." +
                        "\n/coinflip: Flips a coin." +
                        "\n/request: Takes original message, echos it then adds reaction emojis which can be used to vote on a request or suggestion." +
                        "\n[Invite Link](https://discordapp.com/api/oauth2/authorize?client_id=505129765959893013&permissions=8&scope=bot)");
                HelpEmbed.withTitle("WackBot");
    IUser PMCaller = message.getAuthor();
    PrivateChannel PMChannel = (PrivateChannel) bot.getOrCreatePMChannel(PMCaller);
            PMChannel.sendMessage(HelpEmbed.build());
            message.delete();

}}
