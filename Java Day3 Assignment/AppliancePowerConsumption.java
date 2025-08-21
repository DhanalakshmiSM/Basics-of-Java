// Appliance Power Consumption
// Problem: Base class Appliance with method powerUsage(). Subclasses Fan, AC, Heater override it.
// Steps:
// 1.	Create class Appliance with double powerUsage().
// 2.	Override with actual values (Fan: 75W, AC: 1500W, Heater: 2000W).
// 3.	Print usage for each.

class Appliance{
    public double powerUsage(){
        return 0;
    }
}
class Fan extends Appliance{
    public double powerUsage(){
        return 75; 
    }

}
class AC extends Appliance{
    public double powerUsage(){
        return 1500;
    }
}
class Heater extends Appliance{
    public double powerUsage(){
        return 2000;
    }
}

public class AppliancePowerConsumption {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        Appliance ac = new AC();
        Appliance heater = new Heater();

        System.out.println("Fan power usage: " + fan.powerUsage() + "W");
        System.out.println("AC power usage: " + ac.powerUsage() + "W");
        System.out.println("Heater power usage: " + heater.powerUsage() + "W");
    }
}
