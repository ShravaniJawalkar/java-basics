package org.example.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Employee {
    private final String employeeName;
    private final double employeeSalary;
    private final String employeeDesignation;
    private final Address employeeAddress;
    private final List<String> employeeSkills;

    public Employee(String employeeName, double employeeSalary, String employeeDesignation, Address employeeAddress, String skills) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
        // Create a new Address object to ensure immutability
        this.employeeAddress = new Address(employeeAddress.getStreet(), employeeAddress.getCity(), employeeAddress.getState(), employeeAddress.getZipCode(), employeeAddress.getCountry());
        this.employeeSkills = List.of(skills);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    // Return a new Address object to ensure immutability
    public Address getEmployeeAddress() {
        return new Address(employeeAddress.getStreet(), employeeAddress.getCity(), employeeAddress.getState(), employeeAddress.getZipCode(), employeeAddress.getCountry());
    }

    public List<String> getEmployeeSkills() {
        // Return a new list to ensure immutability
        return new ArrayList<>(employeeSkills);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeDesignation='" + employeeDesignation + '\'' +
                ", employeeAddress=" + employeeAddress +
                ", employeeSkills=" + employeeSkills +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.employeeSalary, employeeSalary) != 0) return false;
        if (!employeeName.equals(employee.employeeName)) return false;
        if (!employeeDesignation.equals(employee.employeeDesignation)) return false;
        if (!employeeAddress.equals(employee.employeeAddress)) return false;
        return employeeSkills.equals(employee.employeeSkills);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = employeeName.hashCode();
        temp = Double.doubleToLongBits(employeeSalary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + employeeDesignation.hashCode();
        result = 31 * result + employeeAddress.hashCode();
        result = 31 * result + employeeSkills.hashCode();
        return result;
    }
}
