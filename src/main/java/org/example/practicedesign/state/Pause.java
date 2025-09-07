package org.example.practicedesign.state;

public class Pause implements MediaState{
    @Override
    public void play(MediaPlayer media) {
        System.out.println("Starting media...");
        media.setState(new Play());
    }

    @Override
    public void pause(MediaPlayer media) {
        System.out.println("Already paused.");
    }

    @Override
    public void stop(MediaPlayer media) {
        System.out.println("Stopping media...");
        media.setState(new Stopped());

    }
}
