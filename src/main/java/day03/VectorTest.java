package day03;

import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        // add

        for (int i = 0; i < 20; i++) {
            strings.add("hello");
        }

        strings.add("hi");

        System.out.println(strings.size()); // size: 大小

        // get
//        System.out.println(strings.get(0));

        System.out.println(strings.capacity()); // capacity: 容量

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
