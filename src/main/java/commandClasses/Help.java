package commandClasses;

import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.impl.obj.PrivateChannel;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.handle.obj.IUser;
import sx.blah.discord.util.EmbedBuilder;
import wackBot.CommandProcessor;
import wackBot.BotMain;


public class Help extends CommandProcessor {

    public static void Help(IMessage message, IDiscordClient bot) {

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
                        "\n/HIJ: only can be used in #bot-spam. Spams a meme about Hudson. I'm warming you." +
                        "\n/DIA: Same as HIJ but with Elijah." +
                        "\n/hillary: Works like SovietBot's \"purge\" command. Can delete a large amount of messages at once, takes an argument which dictates how many will be deleted." +
                        "\n/request: Takes original message, echoes it, then adds reaction emojis which can be used to vote on a request or suggestion." +
                        "\n/memereview: Starts meme review, and pings here." +
                        "\n/ratememe: Rates the meme, takes any number as long as it's positive." +
                        "\n[Invite Link](https://discordapp.com/api/oauth2/authorize?client_id=505129765959893013&permissions=8&scope=bot)");
                HelpEmbed.withTitle("WackBot");
        IUser PMCaller = message.getAuthor();
        PrivateChannel PMChannel = (PrivateChannel) bot.getOrCreatePMChannel(PMCaller);
        PMChannel.sendMessage(HelpEmbed.build());
        message.delete();

}}
