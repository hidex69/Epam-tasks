package by.epamtc.task1.model;

import by.epamtc.task1.color.Color;
import by.epamtc.task1.exception.InvalidInputException;
import by.epamtc.task1.exception.NoSuchColorException;

import java.util.Objects;

public class Ball {
    private Color color;
    private double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Ball() {
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(Color color) throws NoSuchColorException {
        if (color == null) {
            throw new NoSuchColorException();
        }

        this.color = color;
    }

    public void setWeight(double weight) throws InvalidInputException {
        if (weight <= 0) {
            throw new InvalidInputException("Weight can't be less than 0");
        }

        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 && color == ball.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
