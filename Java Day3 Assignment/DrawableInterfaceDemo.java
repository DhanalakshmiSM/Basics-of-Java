// DrawableInterfaceDemo.java
// 24. Drawable Interface
// Problem: Interface Drawable with draw(). Implement in Circle and Rectangle.
// Steps:
// 1.	Define interface.
// 2.	Implement in classes.
// 3.	Print shapes drawn.


interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

public class DrawableInterfaceDemo {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();

        // Print shapes drawn
        circle.draw();
        rectangle.draw();
    }
}
