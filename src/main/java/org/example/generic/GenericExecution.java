package org.example.generic;

public class GenericExecution {
    public static void main(String[] args) {
        Calculate<Integer> integerCalculator = new Calculate<>();
        integerCalculator.setOperand1(5);
        integerCalculator.setOperand2(10);
        integerCalculator.setOperation("add");
        System.out.println("Integer Result: " + Integer.valueOf(integerCalculator.getCalculation()));

    }

    private static void printValue(Integer value) {
        value = value + 10;

    }
}
