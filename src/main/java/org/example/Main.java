package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        long start = System.currentTimeMillis();
        numbers.parallelStream().forEach(System.out::println);
        long end = System.currentTimeMillis()- start;
        System.out.println("Time taken: " + end + " ms");
        System.out.println("Parallel processing completed.");
        // Example of a simple operation
       long start1 = System.currentTimeMillis();
        numbers.stream().forEach(System.out::println);
       long end1 = System.currentTimeMillis() - start1;
        System.out.println("Time taken: " + end1 + " ms");
        System.out.println("Sequential processing completed.");

        System.out.println("Factorial of 5 is: " + getFactorial(5));
    }

    private static int getFactorial(int n){
        if(n == 1){
            return n;
        }
        return n * getFactorial(n - 1);
    }
}