package day03;

import com.sun.media.sound.SoftTuning;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();

        strings.add("hello");
        strings.add("hi");

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
