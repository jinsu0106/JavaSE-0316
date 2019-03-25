package day07;

/**
 * 单继承
 */
public class MT1 extends Thread {

    public static void main(String[] args) { // 主线程
        MT1 mt1 = new MT1();
        mt1.start();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
