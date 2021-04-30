package by.epamtc.task2.main;

import by.epamtc.task2.service.JaggedArrayService;
import by.epamtc.task2.service.comparator.MaxComparator;
import by.epamtc.task2.service.comparator.MinComparator;
import by.epamtc.task2.service.comparator.SumComparator;

public class Main {
    public static void main(String[] args) {
        try {
            int[][] matrix = JaggedArrayService.initRandom(3, 3);
            System.out.println("Before " + JaggedArrayService.asString(matrix));

            JaggedArrayService.sort(matrix, new MaxComparator());
            System.out.println("Ascending by max" + JaggedArrayService.asString(matrix));

            JaggedArrayService.sort(matrix, new SumComparator());
            System.out.println("Ascending by sum" + JaggedArrayService.asString(matrix));

            JaggedArrayService.sort(matrix, new MinComparator());
            System.out.println("Ascending by min " + JaggedArrayService.asString(matrix));

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

