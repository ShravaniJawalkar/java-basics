package org.example.practicedesign.decorator;

public class MargritaPizza implements BasePizza {

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getName() {
        return "Margrita Pizza";
    }
}
