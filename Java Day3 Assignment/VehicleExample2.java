// 14. Abstract Vehicle
// Problem: Abstract class Vehicle with fuelType() and noOfWheels(). Implement in Car and Bike.
// Steps:
// 1.	Define abstract Vehicle.
// 2.	Implement methods in subclasses.
// 3.	Print details.

abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 4;
    }
}

class Bike extends Vehicle {
    String fuelType() {
        return "Petrol";
    }

    int noOfWheels() {
        return 2;
    }
}

public class VehicleExample2 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        System.out.println("Car fuel type: " + myCar.fuelType());
        System.out.println("Car no of wheels: " + myCar.noOfWheels());

        System.out.println("Bike fuel type: " + myBike.fuelType());
        System.out.println("Bike no of wheels: " + myBike.noOfWheels());
    }
}
