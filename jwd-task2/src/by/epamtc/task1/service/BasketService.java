package by.epamtc.task1.service;

import by.epamtc.task1.color.Color;
import by.epamtc.task1.model.Basket;

public class BasketService {

    public static double weight(Basket basket) {
        double result = 0;

        for (var ball : basket.getBalls()) {
            result += ball.getWeight();
        }

        return result;
    }

    public static int blueBalls(Basket basket) {
        int result = 0;

        for (var ball : basket.getBalls()) {
            if (ball.getColor() == Color.BLUE) {
                result++;
            }
        }

        return result;
    }
}
