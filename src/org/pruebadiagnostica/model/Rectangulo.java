package org.pruebadiagnostica.model;

public class Rectangulo extends Forma{
    private double largo;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double ancho, String color) {
        super(color);
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "largo=" + largo + ", ancho=" + ancho + '}';
    }
}
