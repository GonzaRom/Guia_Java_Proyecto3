package com.utn.enunciado2;

public class Staff extends Person {
    private double salary;
    private char shift;

    public Staff() {
        super();
    }

    public Staff(String dni, String name, String lastname, String address, String email, Double salary, char shift) {
        super(dni, name, lastname, address, email);
        this.salary = salary;
        this.shift = shift;
    }

    public double annualSalary() {
        return this.salary * 12;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public char getShift() {
        return shift;
    }

    public void setShift(char shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salary=$" + salary +
                ", shift='" + shift + '\'' +
                super.toString() + '}';
    }
}
