package day05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("writer.txt");) {
            writer.write("Hello，中文！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
