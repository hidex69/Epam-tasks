package by.epamtc.task7.main;

import by.epamtc.exception.InvalidInputException;
import by.epamtc.task7.logic.RangeLogic;

public class PointsPrintService {
    public static void printDifference(int difference) throws InvalidInputException {
        if (difference < -1 || difference > 1) {
            throw new InvalidInputException("Difference must be in range [-1, 1]");
        }

        switch (difference) {
            case 1:
                System.out.println("First is closer");
                break;
            case 0:
                System.out.println("They are equally close");
                break;
            case -1:
                System.out.printf("Second is closer");
                break;
        }

    }
}
