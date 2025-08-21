// 13. Abstract Employee
// Problem: Abstract class Employee with abstract method calculateSalary(). Implement in FullTimeEmployee and PartTimeEmployee.
// Steps:
// 1.	Create abstract class Employee with name, id.
// 2.	Abstract method double calculateSalary().
// 3.	Implement: FullTime (fixed salary), PartTime (per-hour × hours).
// 4.	Print salaries.

abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary() {
        return annualSalary / 12;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class EmployeeEx {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 1, 60000);
        Employee partTime = new PartTimeEmployee("Bob", 2, 20, 25);

        System.out.println("Full-Time Employee Salary: " + fullTime.calculateSalary());
        System.out.println("Part-Time Employee Salary: " + partTime.calculateSalary());
    }
}