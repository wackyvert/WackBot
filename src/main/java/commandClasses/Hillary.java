package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.MessageHistory;

public class Hillary {
    public static void hillary (IMessage message){
        String messageSent = message.getContent().substring(9);
        int numOfMessages = Integer.parseInt(messageSent);
        MessageHistory clear = message.getChannel().getMessageHistory(numOfMessages);
        message.getChannel().bulkDelete(clear);
        message.delete();

    }
}
