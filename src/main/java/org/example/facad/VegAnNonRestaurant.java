package org.example.facad;

public class VegAnNonRestaurant implements Hotel {

    @Override
    public Menu getMenu() {
        return new VegAnNon();
    }
}
