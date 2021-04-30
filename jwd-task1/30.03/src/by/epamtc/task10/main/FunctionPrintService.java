package by.epamtc.task10.main;

import java.util.Map;

public class FunctionPrintService {
    public static void printFunction(Map<Double, Double> result) {
        for (var res : result.entrySet()) {
            System.out.printf("x = %.5f   y = %.5f\n", res.getKey(), res.getValue());
        }
    }
}
