package by.epamtc.task6.logic;

import by.epamtc.exception.InvalidInputException;

public class TimeLogic {

    private static final int SECOND_NUMBER = 60;

    public static String fullTime(int seconds) throws InvalidInputException {
        if(seconds < 0) {
            throw new InvalidInputException("Seconds can't be less then 0");
        }

        int hours, minutes;

        hours = (int) (seconds / Math.pow(SECOND_NUMBER, 2));
        seconds -= hours * (Math.pow(SECOND_NUMBER, 2));
        minutes = (seconds / SECOND_NUMBER);
        seconds -= (minutes * SECOND_NUMBER);

        return hours + " hours " + minutes + " minutes " + seconds + " seconds";
    }
}
