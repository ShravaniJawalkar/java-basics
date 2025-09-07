package org.example.practicedesign.state;

public class Play implements MediaState{
    @Override
    public void play(MediaPlayer media) {
        System.out.println("Already Playing ");
    }

    @Override
    public void pause(MediaPlayer media) {
        System.out.println("Pausing ");
        media.setState(new Pause());
    }

    @Override
    public void stop(MediaPlayer media) {
        System.out.println("Stopping ");
        media.setState(new Stopped());
    }
}
