package ru.bfu.ipmit.lab3;

public class Ellipse implements Shape {
    final double firstRadius;
    private double secondRadius;

    public Ellipse(double firstRadius, double secondRadius) {
        this.firstRadius = firstRadius;
        this.secondRadius = secondRadius;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.ELLIPSE;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt(
                ((Math.pow(firstRadius, 2) + Math.pow(secondRadius, 2)) / 2)
        );
    }

    @Override
    public double getArea() {
        return Math.PI * firstRadius * secondRadius;
    }
}
