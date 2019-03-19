package day03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        LinkedList<String> strings = new LinkedList<>();

        strings.add("hello");
        strings.add("hi");

        System.out.println(strings.size());

        System.out.println(strings.get(0));
        System.out.println(strings.getFirst());

        System.out.println(strings.get(1));
        System.out.println(strings.getLast());
    }
}
