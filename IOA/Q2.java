package Assignment.Assignment.IOA;
import java.util.ArrayList;

class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    @Override
    public int getSalary() {
        int incentive = 5000;
        return super.getSalary() + incentive;
    }
}

class Labour extends Employee {
    @Override
    public int getSalary() {
        int overtime = 500;
        return super.getSalary() + overtime;
    }
}

public class Q2 {
    public int totalEmployeesSalary(ArrayList<Employee> employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Manager manager1 = new Manager();
        manager1.salary = 10000;
        Manager manager2 = new Manager();
        manager2.salary = 12000;
        Labour labourer1 = new Labour();
        labourer1.salary = 8000;
        Labour labourer2 = new Labour();
        labourer2.salary = 9000;
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(manager1);
        employees.add(manager2);
        employees.add(labourer1);
        employees.add(labourer2);

        Q2 obj = new Q2();
        int totalSalary = obj.totalEmployeesSalary(employees);
        System.out.println("Total salary of all employees: " + totalSalary);
    }
}
