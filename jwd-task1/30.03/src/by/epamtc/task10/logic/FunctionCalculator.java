package by.epamtc.task10.logic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class FunctionCalculator {
    public static Map<Double, Double> result(double a, double b, double step) {
        Map<Double, Double> result = new Hashtable<>();

        for (double i = a; i <= b; i += step) {
            result.put(i, Math.tan(i));
        }
        return result;
    }
}
