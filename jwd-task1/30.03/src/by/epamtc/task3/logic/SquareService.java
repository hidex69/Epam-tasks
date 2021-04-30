package by.epamtc.task3.logic;

public class SquareService {
    public static double getArea(SquareModel model) {
        return Math.pow(model.getSide(), 2);
    }

    public static double areaOfInscribedSquare(SquareModel model) {
        return Math.pow(model.getSide() / Math.sqrt(2), 2);
    }

    public static double areaDifference(SquareModel model) {
        double areaDifference;

        areaDifference = getArea(model) / areaOfInscribedSquare(model);

        return areaDifference;
    }

}
