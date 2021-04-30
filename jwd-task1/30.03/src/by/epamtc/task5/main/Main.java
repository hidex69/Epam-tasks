package by.epamtc.task5.main;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task5.logic.PerfectNumber;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();

        int number = scanner.intFromScanner();
        if (PerfectNumber.isPerfect(number)) {
            System.out.println("Your number is perfect");
        } else {
            System.out.println("Your number isn't perfect");
        }
    }
}
