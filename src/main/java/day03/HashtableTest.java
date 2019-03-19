package day03;

import java.util.Hashtable;
import java.util.Map;

public class HashtableTest {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // put
        hashtable.put(1, "hello");
        hashtable.put(2, "hi");
        hashtable.put(2, "hello");

        System.out.println(hashtable.size());

//        System.out.println(hashtable.get(1));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "->" + hashtable.get(integer));
        }
//
        System.out.println(hashtable.containsKey(1));
//        for (String value : hashtable.values()) {
//            System.out.println(value);
//        }
//
//        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
//            System.out.println(entry.getKey() + "->" + entry.getValue());
//        }
    }
}

