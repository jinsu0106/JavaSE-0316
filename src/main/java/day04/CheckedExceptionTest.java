package day04;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CheckedExceptionTest {

    public static void main(String[] args) {
        try {
            m();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void m() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input file path:");
        String filePath = scanner.nextLine();

        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");

        // ?
        // checked exception   是难以避免的问题
        // unchecked exception 是程序的 bug
    }
}
