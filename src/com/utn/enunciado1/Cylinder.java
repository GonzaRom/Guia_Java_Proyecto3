package com.utn.enunciado1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radio, String colour, double height) {
        super(radio, colour);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "subclass of {"+super.toString()+'}'+", height="+ height +
                '}';
    }

    @Override
    public double getArea(){
        return ((2*PI*radio* height) + (2*super.getArea()));
    }
}
