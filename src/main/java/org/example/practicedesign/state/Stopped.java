package org.example.practicedesign.state;

public class Stopped implements MediaState {
    @Override
    public void play(MediaPlayer media) {
        System.out.println("Start Playing media...");
        media.setState(new Play());
    }

    @Override
    public void pause(MediaPlayer media) {
        System.out.println("Can't pause. Media is already stopped.");
    }

    @Override
    public void stop(MediaPlayer media) {
        System.out.println("Already stopped.");
    }
}
