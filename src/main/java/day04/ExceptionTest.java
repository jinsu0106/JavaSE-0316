package day04;

public class ExceptionTest {

    // Runtime
    public static void main(String[] args) {
//        System.out.println(1/0);
//        System.out.println("hello".charAt(5));
//        System.out.println(new int[]{1,2,3}[3]);
//        System.out.println(Integer.parseInt("l23"));
        // NullPointerException NPE
        String s = "hello";
        s = null;
        try {
//                System.exit(0);
//            System.out.println(s.length());
            System.out.println("in try block...");
        } catch (ArithmeticException e) {
            // ...
//            e.printStackTrace();
            System.out.println("NPE...");
        } finally {
            // ...
            System.out.println("always print...");
        }
        System.out.println("done.");
    }
}
