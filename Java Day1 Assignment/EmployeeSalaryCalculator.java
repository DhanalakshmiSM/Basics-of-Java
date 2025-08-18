class Employee {
    String name;
    int id;
    double basicSalary;
    static String companyName = "Wipro";

    Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    double calculateGrossSalary() {
        double allowances = basicSalary * 0.2; // 20% allowances
        return basicSalary + allowances;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1, 3000);
        System.out.println("Gross Salary of " + emp1.name + ": " + emp1.calculateGrossSalary());
    }
}
