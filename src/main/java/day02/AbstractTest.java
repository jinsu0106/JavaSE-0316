package day02;

/**
 * abstract: class method
 */
public class AbstractTest {

    public static void main(String[] args) {
//        Shape shape = new Shape();
        Circle circle = new Circle();

//        circle.method();
    }
}

abstract class Shape {
    public abstract void area();
    // ...
}

// Circle Square Rectangle Triangle: area ...
class Circle extends Shape {

    @Override
    public void area() {

    }
}
