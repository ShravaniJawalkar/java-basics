package org.example.generic;

public class Calculate<T> {
    private T operand1;
    private T operand2;
    private String operation;

    // Constructor
    public Calculate() {}

    public Calculate(T operand1, T operand2, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public T getOperand1() {
        return operand1;
    }
    public void setOperand1(T operand1) {
        this.operand1 = operand1;
    }
    public T getOperand2() {
        return operand2;
    }
    public void setOperand2(T operand2) {
        this.operand2 = operand2;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }

    public T getCalculation() {
        if (operation.equals("add")) {
            if (operand1 instanceof Integer && operand2 instanceof Integer) {
                return (T) Integer.valueOf((Integer) operand1 + (Integer) operand2);
            } else if (operand1 instanceof Double && operand2 instanceof Double) {
                return (T) Double.valueOf((Double) operand1 + (Double) operand2);
            }
        } else if (operation.equals("subtract")) {
            if (operand1 instanceof Integer && operand2 instanceof Integer) {
                return (T) Integer.valueOf((Integer) operand1 - (Integer) operand2);
            } else if (operand1 instanceof Double && operand2 instanceof Double) {
                return (T) Double.valueOf((Double) operand1 - (Double) operand2);
            }
        }
        throw new UnsupportedOperationException("Operation not supported for the given types.");
    }
}
