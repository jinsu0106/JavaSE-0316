package day03;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("hello");
        strings.add("hi");
        strings.add("hello");

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
