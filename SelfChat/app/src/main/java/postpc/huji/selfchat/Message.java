package postpc.huji.selfchat;

/**
 * Created by User on 4/16/2018.
 */

public class Message {

    private String mName, mText;

    public Message(String mName, String mText) {
        this.mName = mName;
        this.mText = mText;
    }

    public String getName() {
        return mName;
    }

    public String getText() {
        return mText;
    }
}

