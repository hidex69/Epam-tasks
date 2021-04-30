package by.epamtc.task5.logic;

public class PerfectNumber {
    public static boolean isPerfect(final int number) {
        boolean isPerfect;
        int resultSum = 0;

        for (int i = 1; i < number; i++) {
            if((number % i) == 0) {
                resultSum += i;
            }
        }
        isPerfect = resultSum == number;
        return isPerfect;
    }
}
