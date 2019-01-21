package commandClasses;

import sx.blah.discord.handle.obj.IMessage;

public class Coinflip {
    public static void Coinflip(IMessage message){
        String result = null;
        double number = (int) (Math.random() * 2);
        if (number == 0) {
            result = "Heads!";
        } else {
            result = "Tails!";
        }
        message.getChannel().sendMessage(result);
    }
}
