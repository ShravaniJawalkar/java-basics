package org.example.practicedesign.observer;

public interface Suscriber {
    public void subscribe(Observer message);

    public void unsubscribe(Observer message);

    public void notifyObserver(String news);
}
