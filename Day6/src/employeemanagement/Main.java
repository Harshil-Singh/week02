package employeemanagement;

import java.util.ArrayList;

// Main class to test the Employee Management System
public class Main {
    public static void main(String[] args) {
        // List to store employees (using polymorphism)
        ArrayList<Employee> employees = new ArrayList<>();

        // Create a full-time employee and a part-time employee
        FullTimeEmployee fullTime = new FullTimeEmployee(1, "Alice", 30000, 20000);
        PartTimeEmployee partTime = new PartTimeEmployee(2, "Bob", 15000, 20, 500);

        // Add employees to the list
        employees.add(fullTime);
        employees.add(partTime);

        // Display details and calculate salary for each employee
        for (Employee employee : employees) {
            employee.displayDetails(); // Display basic details
            System.out.println("Total Salary: " + employee.calculateSalary());
           
        }
    }
}
