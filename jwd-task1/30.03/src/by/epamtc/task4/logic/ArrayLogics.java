package by.epamtc.task4.logic;

import java.util.List;

public class ArrayLogics {
    public static boolean isTwoEven(List<Integer> list) {
        boolean isTwoEven;
        int counter = 0;

        for (int number : list) {
            if ((number % 2) == 0) {
                counter++;
            }
        }
        isTwoEven = counter >= 2;

        return isTwoEven;
    }
}
