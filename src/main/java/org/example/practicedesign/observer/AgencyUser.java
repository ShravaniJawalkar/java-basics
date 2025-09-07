package org.example.practicedesign.observer;

public class AgencyUser implements Observer {

    private final String name;

    public AgencyUser(String name) {
        this.name = name;
    }

    @Override
    public void notifyMe(String message) {
        System.out.println("User:" + name + "consuming :" + message);
    }
}
