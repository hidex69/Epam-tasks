package by.epamtc.task7.main;

import by.epamtc.exception.InvalidInputException;
import by.epamtc.scanner.NumberScanner;
import by.epamtc.task7.logic.RangeLogic;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();
        double x1, y1;
        double x2, y2;

        System.out.println("Input first vertex");
        x1 = scanner.doubleFromScanner();
        y1 = scanner.doubleFromScanner();

        System.out.println("Input second vertex");
        x2 = scanner.doubleFromScanner();
        y2 = scanner.doubleFromScanner();

        try {
            PointsPrintService.printDifference(RangeLogic.compare(x1, y1, x2, y2));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
