package AssistedProblems;
public class EmployeeHierarchy {

    // Base class: Employee
    abstract static class Employee {
        private String name;
        private String id;
        private int salary;

        // Constructor
        public Employee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        // Getter methods for encapsulation
        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getSalary() {
            return salary;
        }

        // Method to display details
        public void displayDetails() {
            System.out.println("Employee: " + name + " | ID: " + id + " | Salary: " + salary + " INR");
        }
    }

    // Subclass: Manager
    static class Manager extends Employee {
        private int teamSize;

        // Constructor
        public Manager(String name, String id, int salary, int teamSize) {
            super(name, id, salary); // Call the superclass constructor
            this.teamSize = teamSize;
        }

        public int getTeamSize() {
            return teamSize;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Manager | Team Size: " + teamSize);
        }
    }

    // Subclass: Developer
    static class Developer extends Employee {
        private String programmingLanguage;

        // Constructor
        public Developer(String name, String id, int salary, String programmingLanguage) {
            super(name, id, salary); // Call the superclass constructor
            this.programmingLanguage = programmingLanguage;
        }

        public String getProgrammingLanguage() {
            return programmingLanguage;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Developer | Programming Language: " + programmingLanguage);
        }
    }

    // Subclass: Intern
    static class Intern extends Employee {
        private String university;

        // Constructor
        public Intern(String name, String id, int salary, String university) {
            super(name, id, salary); // Call the superclass constructor
            this.university = university;
        }

        public String getUniversity() {
            return university;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Role: Intern | University: " + university);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create instances of different employees
        Manager manager = new Manager("Anshul Rai", "MGR101", 120000, 10);
        Developer developer = new Developer("Harshil", "DEV202", 90000, "Java");
        Intern intern = new Intern("Aman", "INT303", 30000, "RGPV");

        // Display their details
        System.out.println("\nEmployee Details\n");
        manager.displayDetails();
		System.out.println();
        developer.displayDetails();
		System.out.println();
        intern.displayDetails();
		System.out.println();
    }
}
