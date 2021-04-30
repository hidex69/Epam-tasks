package by.epamtc.task1.main;

import by.epamtc.task1.exception.BasketOverflowException;
import by.epamtc.task1.model.Ball;
import by.epamtc.task1.model.Basket;
import by.epamtc.task1.random.RandomColorGenerator;

import java.util.Random;

public class Init {
    public static void randomInit(Basket basket, int counter) {
        for (int i = 0; i < counter; i++) {
            Random random = new Random();

            try {
                basket.addToBasket(new Ball(RandomColorGenerator.randomColor(), random.nextDouble() * 1000));
            } catch (BasketOverflowException e) {
                e.printStackTrace();
            }
        }
    }
}
