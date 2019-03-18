package day02;

public class PassTest {

    private static void change(int i) { // 基本数据类型
        System.out.println(i); // 0
        i++;
        System.out.println(i); // 1
    }

    private static void change(Parameter parameter) { // 引用数据类型
        System.out.println(parameter.anInt); // 2: 0
        parameter.anInt ++;
        System.out.println(parameter.anInt); // 3: 1
    }

    public static void main(String[] args) {
//        int i = 0;
//        System.out.println(i); // 0
//        change(i);
//        System.out.println(i); // 0

        Parameter parameter = new Parameter();
        System.out.println(parameter.anInt); // 1: 0
        change(parameter);
        System.out.println(parameter.anInt); // 4: 1
    }
}


class Parameter {
    int anInt;
}
