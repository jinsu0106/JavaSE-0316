package day02;

public class ScopeTest {

    //    private int anInt;
    private String string;

    public ScopeTest(int anInt, String string) {
        this.anInt = anInt;
        this.string = string;
        getAnInt();
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest(1, "Hi");
        scopeTest.method();
    }

    public void method() {
        String string = "Hello";
        System.out.println(string);
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;

        int j = 0;
//         int i = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

//        System.out.println(i);
    }

    private int anInt;
}
