package org.pruebadiagnostica.model;


public class Cuadrado extends Forma{
    private double base;
    private double altura;

    public Cuadrado() {
    }

    public Cuadrado(double base, double altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
