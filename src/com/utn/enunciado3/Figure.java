package com.utn.enunciado3;

public abstract class Figure {
    protected String colour;

    public static final double PI = 3.14159;

    public Figure() {
    }

    public Figure(String colour) {
        this.colour = colour;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "colour='" + colour + '\'' +
                '}';
    }
}
