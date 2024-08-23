package org.pruebadiagnostica.model;

public class Forma {
    private String color;

    public Forma() {
    }

    public Forma(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Forma{" + "color=" + color + '}';
    }
}
