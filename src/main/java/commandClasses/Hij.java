package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.RequestBuffer;

public class Hij {
    public static void Hij(IMessage message) {

        for (int i=0;i<5; i++)
        {
           RequestBuffer.request(()-> message.getChannel().sendMessage("<@489075544147623946> is HIJ! I repeat, the boot is in the binding! The snow pants are off!"));
        }


    }
}
