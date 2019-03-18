package day02;

// class = fields + methods
public class Human extends Object {

    private String name;
    private int age;
    private double height;
    private boolean married;

    public Human() {

    }

    static {
        // static block
    }

    {
        // constructor block
        int i = 0;
    }

    public Human(String name, int age, double height, boolean married) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public void study(int hours) {
        System.out.println(name + " study " + hours + " houres.");
    }

    public void work() {

    }
}


