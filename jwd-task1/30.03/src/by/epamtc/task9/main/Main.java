package by.epamtc.task9.main;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task9.logic.CircleLogic;
import by.epamtc.task9.logic.CircleModel;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();
        double radius;

        System.out.println("Input radius of the circle");
        radius = scanner.doubleFromScanner();
        CircleModel circle = new CircleModel(radius);

        System.out.printf("Area = %.5f\nLength = %.5f", CircleLogic.area(circle), CircleLogic.length(circle));
    }
}
