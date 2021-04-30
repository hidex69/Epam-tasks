package by.epamtc.task1.main;

import by.epamtc.task1.logic.ConsonantLetters;
import by.epamtc.task1.logic.TextService;

public class Main {
    public static void main(String[] args) {
        var str = "abc dwd owo".toCharArray();

        System.out.println(TextService.removeСonsonantWords(str, 5));

    }
}
