class Employees {
    // Static variable shared by all employees
    static String companyName = "TechCorp"; 
    private static int totalEmployees = 0; // Tracks the total number of employees

    // Final variable for a unique employee ID
    private final int id;
    private String name;
    private String designation;

    // Constructor to initialize employee details using 'this' keyword
      Employees(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employee count
    }

    // Static method to display total employees
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Display employee details, checking if the object is an instance of Employee
    void displayDetails() {
        if (this instanceof Employees) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class  Employee {
    public static void main(String[] args) {
        // Creating Employee objects
        Employees emp1 = new Employees("John", 1, "Manager");
        Employees emp2 = new Employees("Doe", 2, "Developer");

        // Displaying employee details and total employees
        emp1.displayDetails();
        emp2.displayDetails();
        Employees.displayTotalEmployees();
    }
}
