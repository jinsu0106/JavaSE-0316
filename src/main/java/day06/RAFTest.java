package day06;

import java.io.*;

/**
 * DataInputStream
 * DataOutputStream
 */
public class RAFTest {
    public static void raf() {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("raf", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            randomAccessFile.seek(8);
            System.out.println(randomAccessFile.readDouble()); // EOF: End Of File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("io"));
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("io"))
        ) {
            for (int i = 0; i < 10; i++) {
                dataOutputStream.writeDouble(i * 0.5);
            }
            dataInputStream.skipBytes(8);
            System.out.println(dataInputStream.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*

0
0.5
.
.
.
4.5

 */
