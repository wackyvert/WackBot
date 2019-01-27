package wackBot;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.handle.obj.ActivityType;
import sx.blah.discord.handle.obj.StatusType;
import sx.blah.discord.util.DiscordException;
import sx.blah.discord.api.events.EventDispatcher;
import sx.blah.discord.util.RequestBuffer;


public class BotMain {


    public static final IDiscordClient bot  = createClient("", true);

    public static void main (String args[]){
        EventDispatcher dis = bot.getDispatcher();
        dis.registerListener(new BotListener());
    }


    public static IDiscordClient createClient(String token, boolean login)
    {
        if(login)
        {

        }
        ClientBuilder clientBuilder = new ClientBuilder();
        clientBuilder.withToken(token);
        try
        {
            if (login)
            {
                return clientBuilder.login();
            }
            else
            {
                return clientBuilder.build();
            }
        }
        catch (DiscordException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
