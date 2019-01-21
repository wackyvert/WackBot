package commandClasses;

import sx.blah.discord.handle.impl.obj.ReactionEmoji;
import sx.blah.discord.handle.obj.IMessage;
import sx.blah.discord.util.RequestBuffer;

public class Request {
    public static void Request(IMessage message){
        String content = message.getContent();
        message.delete();
        IMessage newMessage = message.getChannel().sendMessage(content.substring(9));
        ReactionEmoji thumbsup = ReactionEmoji.of("\uD83D\uDC4D");
        ReactionEmoji thumbsdown = ReactionEmoji.of("\uD83D\uDC4E");
        ReactionEmoji x = ReactionEmoji.of("❌");

        RequestBuffer.request(() -> {
            newMessage.addReaction(thumbsup);
        });

        RequestBuffer.request(() -> {
            newMessage.addReaction(thumbsdown);

        });
        RequestBuffer.request(() -> {
            newMessage.addReaction(x);
        });
    }
}
