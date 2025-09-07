package org.example.practicedesign.bridge;

public class SonyTv implements TV {
    @Override
    public void on() {
        System.out.println("SonyTv on");
    }

    @Override
    public void off() {
        System.out.println("SonyTv off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("SonyTv tuneChannel " + channel);
    }
}
