package com.utn.enunciado3;


public class Rectangle extends Figure {
    protected double base;
    private double height;

    public Rectangle() {
        super();
    }

    public Rectangle(String colour, double base, double height) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    public Rectangle(String colour, double base) {
        super(colour);
        this.base = base;
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
        return this.base * this.height;
    }

    @Override
    public double getPerimeter() {
        return Math.pow((this.base * this.height), 2);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", Area=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
