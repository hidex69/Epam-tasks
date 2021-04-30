package by.epamtc.task1.random;

import by.epamtc.task1.color.Color;

import java.util.Random;

public class RandomColorGenerator {
    private static Random random = new Random();

    public static Color randomColor() {
        int randomIndex;

        randomIndex = random.nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }
}
