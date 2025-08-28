package org.example.facad;

public class HotelDemo {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeperImpl();
        hotelKeeper.getNonVegetarianMenu().showMenu();
        hotelKeeper.getVegetarianMenu().showMenu();
        hotelKeeper.getVeganMenu().showMenu();
    }
}
