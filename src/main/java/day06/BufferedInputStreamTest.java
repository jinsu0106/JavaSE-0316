package day06;

import java.io.*;

public class BufferedInputStreamTest {
    private static void noBuffered() {
        try (
                InputStream inputStream = new FileInputStream("1.avi");
                OutputStream outputStream = new FileOutputStream("new.avi")
        ) {
            int i = inputStream.read();
            while (i != -1) {
                outputStream.write(i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void buffered() {
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("1.avi"));
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("buffered.avi"))
        ) {
            int i = bufferedInputStream.read();
            while (i != -1) {
                bufferedOutputStream.write(i);
                i = bufferedInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        noBuffered();
        buffered();
        System.out.println(System.currentTimeMillis() - start);
    }
}
