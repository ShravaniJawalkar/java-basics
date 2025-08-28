package org.example.facad;

public class NonVegRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        return new NonVeg();
    }

}
