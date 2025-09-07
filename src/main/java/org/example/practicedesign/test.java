package org.example.practicedesign;

import org.example.practicedesign.bridge.LcdDisplay;
import org.example.practicedesign.bridge.SonyTv;
import org.example.practicedesign.chainofresp.BusinessHandler;
import org.example.practicedesign.chainofresp.Handler;
import org.example.practicedesign.chainofresp.LegalHandler;
import org.example.practicedesign.composite.Directory;
import org.example.practicedesign.composite.File;
import org.example.practicedesign.decorator.BasePizza;
import org.example.practicedesign.decorator.CheesToppings;
import org.example.practicedesign.decorator.MargritaPizza;
import org.example.practicedesign.observer.AgencyUser;
import org.example.practicedesign.observer.NewsAgency;
import org.example.practicedesign.observer.Observer;

public class test {
    public static void main(String[] args) {
        System.out.println("hello");
        VehicleConfiguration vehicle =VehicleConfiguration.newBuilder().withGps(true)
                .withSunroof(true)
                .withEngine("V8")
                .build();

        System.out.println(vehicle);

        BasePizza b = new CheesToppings(new MargritaPizza());
        System.out.println(b.getName() +":"+b.getPrice());

        LcdDisplay lcdDisplay = new LcdDisplay(new SonyTv());
        lcdDisplay.displayOff();
        lcdDisplay.displayOn();
        lcdDisplay.displayOff();

        Directory root = new Directory("root");
        root.addFileInDirectory(new File("file1.txt"));
        Directory child1 = new Directory("child1");
        child1.addFileInDirectory(new File("file2.txt"));
        root.addFileInDirectory(child1);

        root.ls();

        Observer observer1 = new AgencyUser("Observer 1");
        Observer observer2 = new AgencyUser("Observer 2");
        Observer observer3 = new AgencyUser("Observer 3");
        NewsAgency newsAgency = new NewsAgency("Global News" );
        newsAgency.subscribe(observer1);
        newsAgency.subscribe(observer2);
        newsAgency.subscribe(observer3);
        newsAgency.notifyObserver("new news available" );
        newsAgency.unsubscribe(observer1);
        newsAgency.notifyObserver("new news available 2" );

        Handler handler = new BusinessHandler();
        handler.setNextHandler(new LegalHandler());
        handler.handleRequest("Legal");

    }
}
