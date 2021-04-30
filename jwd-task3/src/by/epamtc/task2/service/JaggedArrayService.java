package by.epamtc.task2.service;

import by.epamtc.task1.exception.InvalidParametersException;
import by.epamtc.task2.exception.InvalidParamsException;
import by.epamtc.task2.service.comparator.IComparator;

import java.util.Random;

public class JaggedArrayService {
    public static int[][] initRandom(int rows, int cols) throws InvalidParametersException {
        if (rows < 0 || cols < 0) {
            throw new InvalidParametersException("Rows and cols number can't be less than 0");
        }

        int[][] matrix = new int[rows][];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            matrix[i] = new int[cols];
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }

        return matrix;
    }

    public static String asString(int[][] matrix) {
        if (matrix == null) {
            return "[[]]";
        }

        String result = "[";

        for (int i = 0; i < matrix.length; i++) {
            result += "[";
            for (int j = 0; j < matrix[i].length - 1; j++) {
                result += matrix[i][j] + ", ";
            }
            result += matrix[i][matrix[i].length - 1] + "],\n";
        }
        result = result.substring(0, result.length() - 2) + "]";

        return result;
    }



    private static void swap(int[][] matrix, int index1, int index2) throws InvalidParamsException {
        if (matrix == null) {
            throw new InvalidParamsException("Null pointer");
        }
        if (index1 < 0 || index2 < 0) {
            throw new InvalidParamsException("Indices can't be less than 0");
        }

        var tmp = matrix[index1];
        matrix[index1] = matrix[index2];
        matrix[index2] = tmp;
    }

    public static void sort(int[][] matrix, IComparator comparator) throws InvalidParamsException {
        if (matrix == null || comparator == null) {
            throw new InvalidParamsException("Null pointer");
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length - i; j++) {
                if (comparator.compare(matrix[j], matrix[j - 1]) > 0) {
                    swap(matrix, j, j - 1);
                }
            }
        }
    }
}
