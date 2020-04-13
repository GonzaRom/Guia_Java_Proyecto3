package com.utn.enunciado1;

public class Circle {
    protected double radio;
    protected String colour;

    ///Constant value of Pi
    public static final double PI = 3.14159;

    ///Constructor empty with default value
    public Circle() {
        this.radio = 1.0;
        this.colour = "RED";
    }

    ///Constructor with parameters
    public Circle(double radio, String colour) {
        this.colour = colour;
        this.radio = radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    ///Return AREA of the Circle
    public double getArea() {
        // return PI * (Math.pow(getRadio(), 2));
        return PI * (this.radio*this.radio);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", colour='" + colour + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
