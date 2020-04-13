package com.utn.enunciado3;


public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(String colour, double base) {
        super(colour, base);
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }

    @Override
    public double getArea() {
        return base * base;
    }

    @Override
    public double getPerimeter() {
        return base * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "base=" + base +
                ", Area=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
