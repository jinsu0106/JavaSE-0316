package day03;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet<>();

        strings.add("orange");
        strings.add("banana");
        strings.add("apple");

        strings = (TreeSet<String>) strings.descendingSet();

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
