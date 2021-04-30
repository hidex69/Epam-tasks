package by.epamtc.task4.main;

import by.epamtc.task4.logic.ArrayLogics;

public class PrintingService {
    public static void printEvens(boolean isTwoEven) {
        if(isTwoEven) {
            System.out.println("There are at least 2 even numbers");
        } else {
            System.out.println("There are not at least 2 even numbers");
        }
    }
}
