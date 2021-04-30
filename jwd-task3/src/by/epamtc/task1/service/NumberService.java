package by.epamtc.task1.service;

import by.epamtc.task1.util.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NumberService {
    private static final int FIRST_THIRD_DIGIT = 100;
    private static final int LAST_THIRD_DIGIT = 999;

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number == 1) {
            result = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }

    public static boolean isFibonacci(int number) {
        if (number == 1) {
            return true;
        }

        boolean result = false;
        int sum = 1;
        int first = 0, second = 1, third = 1;

        while (sum < number) {
            sum = second + third;
            first = second;
            second = third;
            third = sum;
        }

        if (sum == number) {
            result = true;
        }

        return result;
    }

    public static boolean isThreeDigit(int number) {
        boolean result = true;

        if (number < FIRST_THIRD_DIGIT || number > LAST_THIRD_DIGIT) {
            result = false;
        }

        return result;
    }

    public static boolean isNoRepetitions(int number) {
        if (!isThreeDigit(number)) {
            return false;
        }

        ArrayList<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }

        Set<Integer> set = new HashSet<>(digits);
        return set.size() == digits.size();
    }
}
