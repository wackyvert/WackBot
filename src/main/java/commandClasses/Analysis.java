package commandClasses;

import sx.blah.discord.handle.obj.IMessage;

public class Analysis {
    public static void Analysis(IMessage message){
        String content = message.getContent();
        message.delete();
        String kowalski = content+ " <@141981833951838208>" + " , analysis! ";
        message.getChannel().sendMessage(kowalski.substring(10));
    }
}
