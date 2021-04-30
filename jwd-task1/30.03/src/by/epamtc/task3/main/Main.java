package by.epamtc.task3.main;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task3.logic.SquareModel;
import by.epamtc.task3.logic.SquareService;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();
        System.out.println("Input side of the circumscribed square..");
        double side = scanner.positiveDoubleFromScanner();

        SquareModel model = new SquareModel(side);
        System.out.println("The area of the inscribed square is "
                + SquareService.areaOfInscribedSquare(model));

        System.out.println("The area of the described square is " + SquareService.areaDifference(model)
                + " times larger than the area of" + " the inscribed square");
    }
}
