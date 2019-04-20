package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.RequestBuffer;

public class RateMeme {
    public static void rate(IMessage message) {
        String rate = message.getContent().substring(6);
        System.out.println(rate);
        int ratingInt = Integer.parseInt(rate);
        if (ratingInt >= 5){
            String emoji = "👍";
            message.getChannel().sendMessage("*Meme Rating*: "+rate+emoji);
        }
        else {
            String emoji = "\uD83D\uDC4E";
            message.getChannel().sendMessage("*Meme Rating*: "+rate+emoji);
        }


        message.delete();

    }
}
