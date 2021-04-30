package by.epamtc.task4.main;

import by.epamtc.scanner.NumberScanner;
import by.epamtc.task4.logic.ArrayLogics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println("Input A, B, C, D");
        InputService.inputList(list);

        PrintingService.printEvens(ArrayLogics.isTwoEven(list));
    }
}
