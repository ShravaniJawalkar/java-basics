package org.example.facad;

public class NonVeg implements Menu{
    @Override
    public void showMenu() {
        System.out.println("Non Veg Menu");
        System.out.println("1. Chicken Biryani");
        System.out.println("2. Mutton Biryani");
        System.out.println("3. Biryani");
        System.out.println("4. Chicken Curry");
        System.out.println("5. Mutton Curry");
        System.out.println("6. Chicken Tikka");
        System.out.println("7. Mutton Tikka");
        System.out.println("8. Chicken Kebab");
        System.out.println("9. Mutton Kebab");
        System.out.println("10. Chicken Shawarma");
        System.out.println("11. Mutton Shawarma");
        System.out.println("12. Chicken Burger");
        System.out.println("13. Exit");
    }
}
