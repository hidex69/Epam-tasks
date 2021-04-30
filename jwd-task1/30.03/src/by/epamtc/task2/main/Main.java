package by.epamtc.task2.main;

import by.epamtc.exception.InvalidInputException;
import by.epamtc.scanner.DateScanner;
import by.epamtc.task2.logic.DateLogic;

public class Main {
    public static void main(String[] args) {
        DateScanner dateScanner = new DateScanner();
        try {
            System.out.println(DateLogic.numberOfDaysInMonth(dateScanner.yearFromScanner(),
                    dateScanner.monthFromScanner()));
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }
    }
}
