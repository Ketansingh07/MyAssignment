package Generics;
import java.util.HashSet;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("------------------------");
    }
    
}
class EmployeeHashSet extends HashSet<Employee> {
    @Override
    public boolean add(Employee employee) {
        if (employee == null || contains(employee)) {
            return false;
        }
        return super.add(employee);
    }
}

public class Q1 {
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();

        // Adding employees to the HashSet
        Employee employee1 = new Employee(1, "ketan", 5000, "HR");
        Employee employee2 = new Employee(2, "harsh", 6000, "Finance");
        Employee employee3 = new Employee(3, "manish", 5500, "IT");

        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);

        // Displaying details of employees in the HashSet
        for (Employee employee : employeeSet) {
            employee.displayDetails();
        }
    }
}
