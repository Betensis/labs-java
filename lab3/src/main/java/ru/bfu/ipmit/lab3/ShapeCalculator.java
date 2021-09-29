package ru.bfu.ipmit.lab3;

import java.util.Arrays;

public interface ShapeCalculator {
    default double getArea(Shape[] shapes){
        double sum = 0;
        for (Shape shape: shapes) sum += shape.getArea();
        return sum;
    }
}
