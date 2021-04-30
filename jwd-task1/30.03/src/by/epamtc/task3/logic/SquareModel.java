package by.epamtc.task3.logic;

import java.util.Objects;

public class SquareModel {
    private double side;

    public SquareModel(double side) {
        this.side = side;
    }

    public SquareModel() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SquareModel that = (SquareModel) o;
        return Double.compare(that.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "SquareModel{" +
                "side=" + side +
                '}';
    }
}
