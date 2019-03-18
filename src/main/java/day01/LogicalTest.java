package day01;

public class LogicalTest {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a & b;
        System.out.println(c);

        c = a | b;
        System.out.println(c);

        c = a ^ b; // 异
        System.out.println(c);

        c = !a;
        System.out.println(c);


        c = a && b;
        System.out.println(c);

        c = a || b;
        System.out.println(c);

        int x = 0;
        int y = 1;

        boolean z = a || (x++ > y);
        System.out.println(z);
        System.out.println(x); // ?


//        x += y 等价于 x = x + y;

        int n = (++x == y) ? x++ : --y;

        System.out.println(n);
        System.out.println(x);
    }
}
