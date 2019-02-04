package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.MessageHistory;
import sx.blah.discord.util.RequestBuffer;

public class Hillary {
    public static void hillary (IMessage message){
        String messageSent = message.getContent().substring(9);
        int numOfMessages = Integer.parseInt(messageSent);
        MessageHistory clear = message.getChannel().getMessageHistory(numOfMessages);
        RequestBuffer.request(() -> message.getChannel().bulkDelete(clear));
        message.delete();
        System.out.println(messageSent);
    }
}
