package org.example.practicedesign.decorator;

public abstract class Toppings implements BasePizza {
    protected  BasePizza basePizza;

    public Toppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

}
