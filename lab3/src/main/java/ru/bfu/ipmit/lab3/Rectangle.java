package ru.bfu.ipmit.lab3;

public class Rectangle implements Shape {
    private final double height;
    private final double width;

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }

    @Override
    public double getArea() {
        return height + width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }
}
