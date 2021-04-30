package by.epamtc.scanner;

import java.util.Scanner;

public class NumberScanner {
    private Scanner scanner = new Scanner(System.in);

    public double doubleFromScanner() {
        System.out.println("Input double...");

        while (!scanner.hasNextDouble()) {
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public int intFromScanner() {
        System.out.println("Input int...");

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();
    }

    public double positiveDoubleFromScanner() {
        System.out.println("Input positive double...");
        double result;

        do {
            while (!scanner.hasNextDouble()) {
                scanner.next();
            }
            result = scanner.nextDouble();
        } while (result < 0);

        return result;
    }

}
