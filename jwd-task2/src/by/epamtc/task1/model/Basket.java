package by.epamtc.task1.model;

import by.epamtc.task1.color.Color;
import by.epamtc.task1.exception.BasketOverflowException;
import by.epamtc.task1.exception.InvalidInputException;
import by.epamtc.task1.exception.NoSuchBallException;
import by.epamtc.task1.exception.NoSuchColorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Basket {
    private List<Ball> balls = new ArrayList<>();
    private Random random = new Random();
    private final int maxSize = 10;

    public void addToBasket(Ball ball) throws BasketOverflowException {
        if (balls.size() < maxSize) {
            this.balls.add(ball);
        } else throw new BasketOverflowException("Basket is over");
    }

    public Ball takeRandomBall() {
        return balls.get(random.nextInt(balls.size()));
    }

    public Ball takeBall(Color color) throws NoSuchBallException, NoSuchColorException {
        if (color == null) {
            throw new NoSuchColorException();
        }

        return balls.stream().filter(ball -> ball.getColor() == color).findFirst().orElseThrow(NoSuchBallException::new);
    }

    public Basket(List<Ball> balls) throws InvalidInputException {
        if (balls == null) {
            throw new InvalidInputException("Balls are null");
        }

        this.balls = balls;
    }

    public Basket() {
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) throws InvalidInputException {
        if (balls == null) {
            throw new InvalidInputException("Balls are null");
        }

        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(balls, basket.balls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balls);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "balls=" + balls +
                '}';
    }
}
