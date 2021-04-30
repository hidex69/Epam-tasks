package by.epamtc.task1.main;

import by.epamtc.task1.exception.InvalidParametersException;
import by.epamtc.task1.service.ArrayService;
import by.epamtc.task1.service.InitService;
import by.epamtc.task1.util.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Array array = new Array();
        try {
            InitService.initRandom(array, 0, 3, 30);
            System.out.println(ArrayService.fibonacciNumbers(array));
        } catch (InvalidParametersException e) {
            e.printStackTrace();
        }
    }
}
