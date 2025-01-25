package employeemanagement;

// Class representing a part-time employee
public class PartTimeEmployee extends Employee {
    private int workHours; // Number of hours worked
    private double hourlyRate; // Rate per hour of work

    // Constructor to initialize part-time employee details
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Getter and setter for work hours
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    // Getter and setter for hourly rate
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Calculate total salary as base salary + (work hours * hourly rate)
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }
}
