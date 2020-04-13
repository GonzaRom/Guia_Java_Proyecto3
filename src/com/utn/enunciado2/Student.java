package com.utn.enunciado2;

public class Student extends Person {
    private int firstYear;
    private double monthlyFee;
    private String career;

    public Student() {
        super();
    }

    public Student(String dni, String name, String lastname, String address, String email, int firstYear, double monthlyFee, String career) {
        super(dni, name, lastname, address, email);
        this.career = career;
        this.firstYear = firstYear;
        this.monthlyFee = monthlyFee;
    }

    public double annualPayment() {
        return this.monthlyFee * 12;
    }

    public int getFirstYear() {
        return firstYear;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstYear=" + firstYear +
                ", monthlyFee=" + monthlyFee +
                ", career='" + career  +
                super.toString() + '}';
    }
}
