package org.example.facad;

public class VegAnNon implements Menu{
    @Override
    public void showMenu() {
        System.out.println("Veg and Non Veg Menu");
        System.out.println("1. Veg Burger");
        System.out.println("2. Non Veg Burger");
        System.out.println("3. Veg Pizza");
        System.out.println("4. Non Veg Pizza");
        System.out.println("5. Veg Pasta");
        System.out.println("6. Non Veg Pasta");
        System.out.println("7. Exit");
    }
}
