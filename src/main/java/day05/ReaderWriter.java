package day05;

import java.io.*;

public class ReaderWriter {

    public static void main(String[] args) {
        try (
                Reader reader = new FileReader("README.md");
                Writer writer = new FileWriter("new.md")
        ) {
            int i = reader.read();
            while (i != -1) {
                writer.write(i);
                i = reader.read();
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
