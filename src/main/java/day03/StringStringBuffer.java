package day03;

import java.util.Arrays;

public class StringStringBuffer {

    public static void main(String[] args) {

        char[] chars = new char[26];
        int x = 0;
        for (int i = 65; i < 65 + 26; i++) {
            chars[x] = (char) i;
            x++;
        }
        String alphabet = new String(chars);

        // String
//        String string = "";
//        for (int i = 0; i < 100000; i++) {
//            string += alphabet;
//        }
//        System.out.println(string.length());
        // string.length = 26 * 100000

        // StringBuffer
        long start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(alphabet);
        }
        System.out.println("total time: " + (System.currentTimeMillis() - start) + "ms.");
        System.out.println(stringBuffer.length());
    }
}
