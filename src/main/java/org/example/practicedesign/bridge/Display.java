package org.example.practicedesign.bridge;

public abstract class Display {
    protected TV  tv;

    public Display(TV tv) {
        this.tv = tv;
    }

    public abstract void displayOn();
    public abstract void displayOff();

}
