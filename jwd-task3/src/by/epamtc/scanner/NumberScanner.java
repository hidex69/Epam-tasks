package by.epamtc.scanner;

import java.util.Scanner;

public class NumberScanner {
    private Scanner scanner = new Scanner(System.in);

    public int intFromScanner() {

        while (!scanner.hasNextInt()) {
            scanner.next();
        }

        return scanner.nextInt();
    }
}
