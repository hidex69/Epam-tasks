package by.epamtc.task7.logic;

public class RangeLogic {
    public static double lengthOfVertex(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static int compare(double x1, double y1,
                                  double x2, double y2) {
        double difference = lengthOfVertex(x1, y1) - lengthOfVertex(x2, y2);
        int result = 0;

        if(difference > 0) {
            result = 1;
        } else if (difference < 0) {
            result = -1;
        }

        return result;
    }
}
