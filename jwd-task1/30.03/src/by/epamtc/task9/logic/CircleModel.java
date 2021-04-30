package by.epamtc.task9.logic;

import java.util.Map;
import java.util.Objects;

public class CircleModel {
    private double radius;

    public CircleModel(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleModel that = (CircleModel) o;
        return Double.compare(that.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }


}
