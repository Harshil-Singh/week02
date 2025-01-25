package employeemanagement;

// Class representing a full-time employee
public class FullTimeEmployee extends Employee {
    private double monthlySalary; // Additional fixed monthly salary

    // Constructor to initialize full-time employee details
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlySalary) {
        super(employeeId, name, baseSalary);
        this.monthlySalary = monthlySalary;
    }

    // Getter and setter for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Calculate total salary as base salary + monthly salary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + monthlySalary;
    }
}
