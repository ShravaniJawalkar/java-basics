package org.example.practicedesign.state;

import javax.print.attribute.standard.Media;

public interface MediaState {
    public void play(MediaPlayer media);
    public void pause(MediaPlayer media);
    public void stop(MediaPlayer media);
}
