package by.epamtc.task10.main;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task10.logic.FunctionCalculator;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();
        double a, b, step;

        System.out.println("Input A, B and step");
        a = scanner.doubleFromScanner();
        b = scanner.doubleFromScanner();
        step = scanner.doubleFromScanner();

        Map<Double, Double> func = FunctionCalculator.result(a, b, step);
        FunctionPrintService.printFunction(func);
    }
}
