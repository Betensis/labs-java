package ru.bfu.ipmit.lab3;

public class Circle extends Ellipse implements WithRadius {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double getRadius() {
        return firstRadius;
    }

    static Circle fromArea(double area){
        double radius = area / (Math.pow(Math.PI, 2));
        return new Circle(radius);
    }
}
