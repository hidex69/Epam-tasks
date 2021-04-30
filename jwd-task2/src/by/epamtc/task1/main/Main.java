package by.epamtc.task1.main;

import by.epamtc.task1.model.Basket;
import by.epamtc.task1.service.BasketService;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        Init.randomInit(basket, 10);

        System.out.println("Weight = " + BasketService.weight(basket));
        System.out.println("Number of blue balls = " + BasketService.blueBalls(basket));
    }
}
