// 2. Employee Bonus
// Problem: Create a base class Employee with method calculateBonus(). Subclasses Manager, Developer, Intern should override to return different bonus % of salary.
// Steps:
// 1.	Create Employee with salary attribute + double calculateBonus().
// 2.	Override in Manager (20%), Developer (10%), Intern (5%).
// 3.	Create objects and display bonus for each.

class Employee{
    double salary;

    public double calculateBonus(){
        return 0;
    }
}

class Manager extends Employee{
    Manager(double salary){
        this.salary = salary;
    }

    @Override
    public double calculateBonus(){
        return salary * 0.20; // 20% bonus
    }
}

class Developer extends Employee{
    Developer(double salary){
        this.salary=salary;
    }

    @Override
    public double calculateBonus(){
        return salary*0.10;//10% bonus
    }
}

class Intern extends Employee{
    Intern(double salary){
        this.salary=salary;
    }

    @Override
    public double calculateBonus(){
        return salary*0.05; // 5% bonus
    }
}  

public class EmployeeBonus{
    public static void main(String[] args) {
        
        Employee manager = new Manager(20000);
        Employee developer=new Developer(25000);
        Employee intern=new Intern(15000);

        System.out.println("Bonus of Manager is:"+manager.calculateBonus());
        System.out.println("Bonus of Developer is:"+developer.calculateBonus());
        System.out.println("Bonus of the Intern is:"+intern.calculateBonus());
    }
}

  
