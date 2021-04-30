package by.epamtc.task6.main;

import by.epamtc.exception.InvalidInputException;
import by.epamtc.scanner.NumberScanner;
import by.epamtc.task6.logic.TimeLogic;

public class Main {
    public static void main(String[] args) {
        NumberScanner scanner = new NumberScanner();

        System.out.println("Input time in seconds");
        try {
            System.out.println("Full time: " + TimeLogic.fullTime(scanner.intFromScanner()));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
