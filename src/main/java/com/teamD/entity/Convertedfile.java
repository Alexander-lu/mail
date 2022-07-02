package com.teamD.entity;

public class Convertedfile {

    private String a;

    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Convertedfile(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public Convertedfile() {
    }

    @Override
    public String toString() {
        return "Convertedfile{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public String getB() {
        return b;
    }
}
