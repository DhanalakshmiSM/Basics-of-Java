class Vehicle {
    int speed; String color;
}
class Car extends Vehicle {
    void show() {
        System.out.println("Car Speed: " + speed + ", Color: " + color);
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.speed = 120; c.color = "Red";
        c.show();
    }
}
    // class Vehicle {
    //     protected int speed;
    //     protected String color;

    //     public Vehicle(int speed, String color) {
    //         this.speed = speed;
    //         this.color = color;
    //     }
    // }

    // class Car extends Vehicle {
    //     public Car(int speed, String color) {
    //         super(speed, color);
    //     }
    // }
   // class Main {
   //     public static void main(String[] args) {
   //         Car car = new Car(120, "Red");
   //         car.show();
   //     }
   // }