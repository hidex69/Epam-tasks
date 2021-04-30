package by.epamtc.task2.logic;

import by.epamtc.exception.InvalidInputException;

public class DateLogic {

    private static final int LEAP_CONST_1 = 4;
    private static final int LEAP_CONST_2 = 100;
    private static final int LEAP_CONST_3 = 400;

    public static int numberOfDaysInMonth(int year, int month) throws InvalidInputException {
        if((month > 12) || (month < 1)) {
            throw new InvalidInputException("Month can't be less than 1 and more than 12");
        }

        int numberOfDays;

        if(month == 4 || month == 6 || month == 9 || month == 11) {
            numberOfDays = 30;
        } else if(month == 2 && DateLogic.isLeap(year)) {
            numberOfDays = 29;
        } else if (month == 2) {
            numberOfDays = 28;
        } else numberOfDays = 31;

        return numberOfDays;
    }

    public static boolean isLeap(int year) {
        boolean isLeap = false;

        if((year % LEAP_CONST_1 == 0) && (year % LEAP_CONST_2 != 0)) {
            isLeap = true;
        } else if((year % LEAP_CONST_3 == 0)) {
            isLeap = true;
        }

        return isLeap;
    }
}
