package day02;

public class E2 {

    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3);
        System.out.println(cube.getVolume());
    }
}

class Cube {

    private double length;
    private double width;
    private double height;

    public Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}
