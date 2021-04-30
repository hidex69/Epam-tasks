package by.epamtc.task1.service;

import by.epamtc.task1.exception.EmptyArrayException;
import by.epamtc.task1.exception.InvalidParametersException;
import by.epamtc.task1.util.Array;

public class ArrayService {
    public static Array primeNumbers(Array array) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        Array primes = new Array();

        for (int element : array.getData()) {
            if (NumberService.isPrime(element)) {
                primes.add(element);
            }
        }

        return primes;
    }

    public static Array fibonacciNumbers(Array array) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        Array fibNumbers = new Array();

        for (int element : array.getData()) {
            if (NumberService.isFibonacci(element)) {
                fibNumbers.add(element);
            }
        }

        return fibNumbers;
    }

    public static Array noRepetitions(Array array) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        Array noRepets = new Array();

        for (int element : array.getData()) {
            if (NumberService.isNoRepetitions(element)) {
                noRepets.add(element);
            }
        }

        return noRepets;
    }

    public static int min(Array array) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        int result = 0;

        for(int element : array.getData()) {
            if (element < result) {
                result = element;
            }
        }

        return result;
    }

    public static int max(Array array) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        int result = 0;

        for(int element : array.getData()) {
            if (element > result) {
                result = element;
            }
        }

        return result;
    }

    public static int binarySearch(Array array, int key) throws InvalidParametersException {
        int result = binarySearch(array, key, 0, array.size() - 1);
        return result;
    }

    public static void bubbleSort(Array array) {
        for (int i = 0; i < array.size(); i++) {
            for (int j = 1; j < array.size() - i; j++) {
                if (array.getData()[j] < array.getData()[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    public static void quickSort(Array array) throws InvalidParametersException {
        quickSort(array, 0, array.size() - 1);
    }

    public static void insertionSort(Array array) {
        for (int j = 1; j < array.size(); j++) {
            int key = array.getData()[j];
            int i = j - 1;
            while ((i > -1) && (array.getData()[i] > key)) {
                array.getData()[i + 1] = array.getData()[i];
                i--;
            }
            array.getData()[i + 1] = key;
        }
    }

    private static int binarySearch(Array array, int key, int low, int high) throws InvalidParametersException {
        int middle = (low + high) / 2;

        if (high < low) {
            throw new InvalidParametersException("Low can't be less than high");
        }

        if (key == array.getData()[middle]) {
            return middle;
        } else if (key < array.getData()[middle]) {
            return binarySearch(array, key, low, middle - 1);
        } else {
            return binarySearch(array, key, middle + 1, high);
        }
    }

    private static void quickSort(Array array, int low, int high) throws InvalidParametersException{
        if (array.size() == 0)
            return;

        if (low >= high)
            throw new InvalidParametersException("Low can't be less than high");

        int middle = low + (high - low) / 2;
        int midElement = array.getData()[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array.getData()[i] < midElement) {
                i++;
            }

            while (array.getData()[j] > midElement) {
                j--;
            }

            if (i <= j) {
                int temp = array.getData()[i];
                array.getData()[i] = array.getData()[j];
                array.getData()[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    private static void swap(Array array, int index1, int index2) {
        int tmp = array.getData()[index1];
        array.getData()[index1] = array.getData()[index2];
        array.getData()[index2] = tmp;
    }

}
