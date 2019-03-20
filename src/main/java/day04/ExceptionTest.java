package day04;

public class ExceptionTest {

    // Runtime
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());  // NPE
            System.out.println(1 / 0);
            System.out.println("hello".charAt(5));
            System.out.println(new int[]{1, 2, 3}[3]);
            System.out.println(Integer.parseInt("l23"));
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException...");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally...");
        }

        System.out.println("done.");
    }
}
