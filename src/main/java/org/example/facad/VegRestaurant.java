package org.example.facad;

public class VegRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        return new Veg();
    }
}
