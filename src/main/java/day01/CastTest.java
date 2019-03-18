package day01;

public class CastTest {
    public static void main(String[] args) {

        // char [0, 65535]
        // int [-2147483648, 2147483647]
        char c = 'a'; // 97
        int i = c;

        System.out.println(i);

        int x = 2147483647;
        char y = (char)x;

        System.out.println(y);


    }
}
