/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pruebadiagnostica.model;

/**
 *
 * @author informatica
 */
public class Tester extends Empleado {
    private String prueba;

    public Tester(String nombre, int edad, double salario, String tipoPruebas) {
        super(nombre, edad, salario);
        this.prueba = tipoPruebas;
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está realizando pruebas de tipo: " + prueba);
    }

    public void trabajar(String herramienta, String proyecto) {
        System.out.println(nombre + " está trabajando en el proyecto: " + proyecto + " usando la herramienta: " + herramienta);
    }
}

