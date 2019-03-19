package day03;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "hello");
        hashMap.put(2, "hi");

        for (Integer integer : hashMap.keySet()) {
            System.out.println(integer);
        }

        String[] strings = {"hello", "hi"};

        System.out.println(strings);

        System.out.println(Arrays.toString(strings));
    }
}
