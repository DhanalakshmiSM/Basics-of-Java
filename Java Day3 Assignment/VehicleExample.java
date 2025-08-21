// 3. Vehicle Speed
// Problem: Base class Vehicle has method speed(). Subclasses Car, Bike, Truck override it to display average speed.
// Steps:
// 1.	Create class Vehicle with method void speed().
// 2.	Override in subclasses: Car (120 km/h), Bike (80 km/h), Truck (60 km/h).
// 3.	In main(), create objects and call speed().


class Vehicle {
    public void speed(){
        System.out.println("Average speed is:");
    }
}

class Car extends Vehicle{
    public void speed(){
        System.out.println("Average speed is: 120 km/h");
    }
}

class Bike extends Vehicle{
    public void speed(){
        System.out.println("Average speed is: 80 km/h");
    }
}

class Truck extends Vehicle{
    public void speed(){
        System.out.println("Average speed is: 60 km/h");
    }
}

public class VehicleExample{
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();

        car.speed();
        bike.speed();
        truck.speed();
    }
}