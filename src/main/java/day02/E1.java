package day02;

import java.util.Scanner;

public class E1 {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 || (year % 400 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input year: ");

        int year = scanner.nextInt();

//        E1 e1 = new E1();

//        System.out.println(year + " is leap year: " + e1.isLeapYear(year));
        System.out.println(year + " is leap year: " + isLeapYear(year));
    }
}
