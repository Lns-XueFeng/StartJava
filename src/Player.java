/**
 * Create by xuefeng on 2023.1.29
 */

public class Player {
    static final int SIZE = 10;

    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        StreamAudioPlayer streamAudioP = new StreamAudioPlayer();
        StreamVideoPlayer streamVideoP = new StreamVideoPlayer();
        StreamPicturePlayer streamPictureP = new StreamPicturePlayer();

        streamAudioP.openSpeaker(speaker);
        System.out.println(streamAudioP.dealSpeaker());
        streamAudioP.openSpeaker(speaker);

        streamVideoP.openSpeaker(speaker);
        System.out.println(streamVideoP.dealSpeaker());
        streamVideoP.openSpeaker(speaker);

        System.out.println(streamPictureP.dealSpeaker());

        Integer[] numList = new Integer[SIZE];
        int[] munList = new int[SIZE];
        String[] strList = {"yes", "no"};
    }
}

// public
class AudioPlayer {
    // public别的包可访问可继承，包内也是
    public boolean openSpeaker(Speaker sp) {
        return sp.openSpeaker();
    }

    public boolean closeSpeaker(Speaker sp) {
        return sp.closeSpeaker();
    }

    final String dealSpeaker() {
        return "Audio is dealing...";
    }
}

class StreamAudioPlayer extends AudioPlayer {
    public boolean openSpeaker(Speaker sp) {
        return !sp.openSpeaker();
    }

    public boolean closeSpeaker(Speaker sp) {
        return !sp.closeSpeaker();
    }
}

// protected
class VideoPlayer {
    // 别的包内的类无法访问protected修饰的方法，但可通过继承访问
    protected boolean openSpeaker(Speaker sp) {
        return sp.openSpeaker();
    }

    protected boolean closeSpeaker(Speaker sp) {
        return sp.closeSpeaker();
    }

    final String dealSpeaker() {
        return "Video is dealing...";
    }
}

class StreamVideoPlayer extends VideoPlayer {
    protected boolean openSpeaker(Speaker sp) {
        return !sp.openSpeaker();
    }

    protected boolean closeSpeaker(Speaker sp) {
        return !sp.closeSpeaker();
    }
}

// private
class PicturePlayer {
    private boolean openSpeaker(Speaker sp) {
        return sp.openSpeaker();
    }

    private boolean closeSpeaker(Speaker sp) {
        return sp.closeSpeaker();
    }

    final String dealSpeaker() {
        return "PictureDeal: Nothing!";
    }
}

class StreamPicturePlayer extends PicturePlayer {
    // 无法继承PicturePlayer中private修饰的方法
}

class Speaker {
    boolean openSpeaker() {
        return true;
    }

    boolean closeSpeaker() {
        return false;
    }
}

abstract class File {
    protected abstract void open();
    protected abstract void close();
}

class TextFile extends File {
    protected void open() {
        // ......
    }

    protected void close() {
        // ......
    }
}

class VideoFile extends File {
    protected void open() {
        // ......
    }

    protected void close() {
        // ......
    }
}
