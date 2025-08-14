package org.example.generic;

import java.util.List;

public class GnericMethods {

    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public void printArray(Number[] array) {
        for (Number element : array) {
            System.out.println(element);
        }
    }

    public void printList(List<? extends Number> list1, List<? super String> list2) {
        System.out.println("List 1:");
        for (Number element : list1) {
            System.out.println(element);
        }

        System.out.println("List 2:");
        for (Object element : list2) {
            System.out.println(element);
        }
    }

    public <T extends Number> void printListWithBound(List<T> list1, List<T> list2) {
        for (T element : list1) {
            System.out.println(element);
        }
    }
}
