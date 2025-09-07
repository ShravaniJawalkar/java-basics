package org.example.practicedesign.state;

public class MediaPlayer {
    private String fileName;
    private MediaState state;
    public MediaPlayer(String fileName) {
        this.fileName = fileName;
        this.state = new Stopped();
    }

    public void setState(MediaState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }
    public void pause() {
        state.pause(this);
    }
    public void stop() {
        state.stop(this);
    }
}
