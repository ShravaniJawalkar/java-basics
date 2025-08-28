package org.example.facad;

public class HotelKeeperImpl implements HotelKeeper {
    @Override
    public Menu getVegetarianMenu() {
        VegRestaurant vegetarian = new VegRestaurant();
        return vegetarian.getMenu();
    }

    @Override
    public Menu getNonVegetarianMenu() {
        NonVegRestaurant nonVegetarian = new NonVegRestaurant();
        return nonVegetarian.getMenu();
    }

    @Override
    public Menu getVeganMenu() {
        VegAnNonRestaurant vegan = new VegAnNonRestaurant();
        return vegan.getMenu();
    }
}
