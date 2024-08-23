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
public class Desarrollador extends Empleado {
    private String lenguajeDeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeDeProgramacion = lenguajeProgramacion;
    }
    
    @Override
    public void trabajar() {
        System.out.println(nombre + " está desarrollando en " + lenguajeDeProgramacion);
    }
    
    public void trabajar(String proyecto) {
        System.out.println(nombre + " está trabajando en el proyecto: " + proyecto + " y usando el lenguaje de programación " + lenguajeDeProgramacion);
    }
}


