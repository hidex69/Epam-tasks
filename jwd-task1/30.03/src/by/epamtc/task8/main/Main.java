package by.epamtc.task8.main;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task8.logic.Function;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();
        double x = scanner.doubleFromScanner();

        System.out.printf("F(%.6f) = %.6f", x, Function.result(x));
    }
}
