package com.utn.enunciado3;

public class Circlev2 extends Figure {
    private double radio;
    private double xCenter;
    private double yCenter;

    public Circlev2() {
        super();
    }

    public Circlev2(String colour, double radio, double xCenter, double yCenter) {
        super(colour);
        this.radio = radio;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    @Override
    public double getArea() {
        return (PI * (this.radio * this.radio));
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circlev2{" +
                "radio=" + radio +
                ", xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", Area=" + this.getArea() +
                ", Perimeter=" + this.getPerimeter() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
