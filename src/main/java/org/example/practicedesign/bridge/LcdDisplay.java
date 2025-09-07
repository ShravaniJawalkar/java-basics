package org.example.practicedesign.bridge;

public class LcdDisplay extends Display {

    public LcdDisplay(TV tv) {
        super(tv);
    }

    @Override
    public void displayOn() {
        tv.on();
    }

    @Override
    public void displayOff() {
        tv.off();
    }

}
