package by.epamtc.task1.logic;


public class NumberLogic {
    public static int lastDigitOfSquareOfNumber(int number) {
        int lastDigit = (int)Math.pow(number, 2) % 10;
        return lastDigit;
    }
}
