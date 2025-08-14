package org.example.generic;

public interface Base {
    default void print() {
        System.out.println("Base class print method");
    }

    public String getName();
    public int getAge();
}
