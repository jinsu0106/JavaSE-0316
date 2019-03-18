package day02;

import javafx.scene.shape.Circle;

/**
 * abstract: class method
 */
public class AbstractTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
        Circle circle = new Circle();

//        circle.method();

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}

abstract class Shape {
    public abstract double area();

    public abstract double perimeter();
}

// Circle Square Rectangle Triangle: area ...

class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}

