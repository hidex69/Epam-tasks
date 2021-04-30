package by.epamtc.task1.service;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task1.exception.InvalidParametersException;
import by.epamtc.task1.util.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class InitService {
    public static void initRandom(Array array, int low, int high, int size) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        if (size <= 0) {
            throw new InvalidParametersException("Size can't be less or equal to 0");
        }

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(high - low) + low);
        }
    }

    public static void initFromFile(Array array, String path) throws InvalidParametersException, FileNotFoundException {
        if (array == null ||path == null) {
            throw new InvalidParametersException("Null pointer");
        }

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextInt()) {
            array.add(scanner.nextInt());
        }
    }

    public static void initFromConsole(Array array, int size) throws InvalidParametersException {
        if (array == null) {
            throw new InvalidParametersException("Null pointer");
        }

        if (size <= 0) {
            throw new InvalidParametersException("Size can't be less or equal to 0");
        }

        NumberScanner scanner = new NumberScanner();

        for (int i = 0; i < size; i++) {
            array.add(scanner.intFromScanner());
        }
    }
}
