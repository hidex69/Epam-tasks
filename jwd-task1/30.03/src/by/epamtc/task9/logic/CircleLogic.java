package by.epamtc.task9.logic;

public class CircleLogic {
    public static double area(CircleModel circle) {
        return Math.PI * (Math.pow(circle.getRadius(), 2));
    }

    public static double length(CircleModel circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}
