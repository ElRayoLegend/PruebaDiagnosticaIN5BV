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
public class Televisor extends Dispositivo {
    
    private int tamanioPantalla;

    public Televisor() {
    }

    public Televisor(int tamanioPantalla, String marca, String modelo, String anio) {
        super(marca, modelo, anio);
        this.tamanioPantalla = tamanioPantalla;
    }
    
    @Override
    public void encender() {
        System.out.println("El telefono esta encendido");
    }
    
    public void encender(int volumen){
        System.out.println("Ajustando volumen automaticamente en: " + volumen);
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }
    
    
}
