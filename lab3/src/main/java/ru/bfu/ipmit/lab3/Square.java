package ru.bfu.ipmit.lab3;

public class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }
    static Square fromArea(double area){
        return new Square(Math.sqrt(area));
    }
}
