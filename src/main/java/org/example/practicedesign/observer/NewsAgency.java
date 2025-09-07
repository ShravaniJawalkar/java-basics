package org.example.practicedesign.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Suscriber {
    private final String newsAgencyName;
    private final List<Observer> observers = new ArrayList<>();

    public NewsAgency(String news) {
        this.newsAgencyName = news;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer message) {
        observers.remove(message);
    }

    @Override
    public void notifyObserver(String news) {
        System.out.println(newsAgencyName + " is publishing news: ");
        for (Observer observer : observers) {
            observer.notifyMe(news);
        }
    }
}
