package employeemanagement;

// Interface to define department-related behaviors
public interface Department {
    // Assign a department to the employee
    void assignDepartment(String departmentName);

    // Get the details of the assigned department
    String getDepartmentDetails();
}
