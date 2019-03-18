package day02;

public class PassTest {

    private static void change(int i) {
        System.out.println(i); // 0
        i++;
        System.out.println(i); // 1
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println(i); // 0
        change(i);
        System.out.println(i); // ?
    }
}
