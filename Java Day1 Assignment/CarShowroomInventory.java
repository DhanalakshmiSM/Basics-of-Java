class Car {
    String model;
    double price;
    static int totalCars = 0;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
        totalCars++;
    }

    static void displayTotalCars() {
        System.out.println("Total cars in inventory: " + totalCars);
    }
}

public class CarShowroomInventory {
    public static void main(String[] args) {
        new Car("Toyota", 20000);
        new Car("Honda", 22000);
        new Car("Ford", 25000);
        new Car("BMW", 50000);
        Car.displayTotalCars();
    }
}
