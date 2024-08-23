package org.pruebadiagnostica.model;

public class Circulo extends Forma{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
}
