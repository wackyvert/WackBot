package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.RequestBuffer;

public class Dia {
    public static void Dia(IMessage message) {

        for (int i=0;i<10; i++)
        {
           RequestBuffer.request(()-> message.getChannel().sendMessage("<@219224966409879552> is DIA! I repeat, the chicken is in the coop! The pants are off! The hen has laid the egg!"));
        }


    }
}
