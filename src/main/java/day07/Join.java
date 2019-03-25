package day07;

public class Join implements Runnable {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Join());
        thread.start();
        thread.join(); //

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            System.out.println(i);
        }
    }
}
