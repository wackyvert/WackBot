package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.RequestBuffer;



public class GetOnlineAdrian {
    public static void getOnlineAdrian(IMessage message){
        for (int adrian =1; adrian<=10; adrian++)
        {
            RequestBuffer.request(()-> message.getChannel().sendMessage("<@300799019440013314>, get the hell on discord!!!!!!"));
        }

    }
}
