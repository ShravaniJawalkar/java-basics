package org.example.practicedesign.decorator;

public class CheesToppings extends Toppings {

    public CheesToppings(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getPrice() {
        return basePizza.getPrice()+20;
    }

    @Override
    public String getName() {
        return basePizza.getName()+" with cheese Toppings";
    }
}
