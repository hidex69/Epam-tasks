package by.epamtc.scanner;

import java.util.Scanner;

public class DateScanner {
    private Scanner scanner = new Scanner(System.in);

    public int yearFromScanner() {
        System.out.println("Input year...");

        int year;

        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            year = scanner.nextInt();
        } while (year < 0);

        return year;
    }

    public int monthFromScanner() {
        System.out.println("Input month...");

        int month;

        do {
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            month = scanner.nextInt();
        } while(month < 0 || month > 12);

        return month;
    }

}
