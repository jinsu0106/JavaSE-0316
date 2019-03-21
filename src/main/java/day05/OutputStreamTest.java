package day05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamTest {
    public static void main(String[] args) {
        try(OutputStream outputStream = new FileOutputStream("output_stream.txt")) {
            outputStream.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
