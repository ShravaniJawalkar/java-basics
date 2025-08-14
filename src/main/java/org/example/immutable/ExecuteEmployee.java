package org.example.immutable;

public class ExecuteEmployee {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62701", "USA");
       Employee employee = new Employee("John", 70000.0,
               "HR EXECUTIVE", address ,"RECRUITER");

        System.out.println("Employee Details: " + employee);
        address.setCity("New City"); // This will not change the original address in Employee
        System.out.println("After attempting to change address city: " + employee);
        employee.getEmployeeAddress().setCity("New City");
        employee.getEmployeeSkills().add("COMMUNICATION");
        System.out.println("After changing address city through getter: " + employee);

    }
}
