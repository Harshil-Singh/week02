class Students {
    // Static variable shared across all students
    static String universityName = "IIT BOMBAY";
    private static int totalStudents = 0; // Tracks the total number of students

    // Final variable for a unique roll number
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor to initialize student details using 'this' keyword 
Students(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment the total student count
    }

    // Static method to display the total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details, checking if the object is an instance of Student
    void displayDetails() {
        if (this instanceof Students) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Student {
    public static void main(String[] args) {
        // Creating Student objects
        Students student1 = new Students("DEEPAK", 101, "A");
        Students student2 = new Students("CHOURSIYA", 102, "B");

        // Display student details and total students
        student1.displayDetails();
        student2.displayDetails();
        Students.displayTotalStudents();
    }
}
