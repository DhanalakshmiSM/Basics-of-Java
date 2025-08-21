// 1. Shape Area Calculation
// Problem: Create a base class Shape with method area(). Subclasses Circle, Rectangle, Triangle should override area() to compute areas.
// Steps:
// 1.	Define Shape with method double area().
// 2.	Create Circle (πr²), Rectangle (l × b), Triangle (0.5 × b × h).
// 3.	Override area() in each class.
// 4.	In main(), create objects and print their areas.


class Shape {
    public double area() {
        return 0; 
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape{
    double length;
    double breadth;

    Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }

    public double area(){
        return length*breadth;
    }
}
class Triangle extends Shape{
    double base;
    double height;

    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    public double area(){
        return 0.5*base*height;
    }
}
public class Main{
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        Shape rectangle=new Rectangle(10,12);
        Shape triangle=new  Triangle(6,8);

        System.out.println("Area of Circle is:"+circle.area());
        System.out.println("Area of Rectangle is:"+ rectangle.area());
        System.out.println("Area of Triangle is:"+triangle.area());
    }
}