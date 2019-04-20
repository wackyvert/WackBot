package commandClasses;

import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.RequestBuffer;

public class MemeReview {
    public static void Dia(IMessage message) {

        message.getChannel().sendMessage("***CLAP CLAP*** MEME REVIEW @here https://i.kym-cdn.com/entries/icons/original/000/028/335/SUPER_SMASH_MEMES__MEME_REVIEW__%F0%9F%91%8F_%F0%9F%91%8F_31_0-37_screenshot.png");
        message.delete();

    }
}
