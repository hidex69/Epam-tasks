package by.epamtc.task4.main;

import by.epamtc.scanner.NumberScanner;

import java.util.List;

public class InputService {
    public static void inputList(List<Integer> list) {
        NumberScanner scanner = new NumberScanner();

        for (int i = 0; i < 4; i++) {
            list.add(scanner.intFromScanner());
        }
    }
}
