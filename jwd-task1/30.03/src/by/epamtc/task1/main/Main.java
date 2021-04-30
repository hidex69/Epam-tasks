package by.epamtc.task1.main;

import by.epamtc.task1.logic.NumberLogic;
import by.epamtc.scanner.NumberScanner;

public class Main {
    public static void main(String[] args) {
        NumberScanner dataScanner = new NumberScanner();
        System.out.println("Last digit of the square is "
                + NumberLogic.lastDigitOfSquareOfNumber(dataScanner.intFromScanner()));
    }
}
