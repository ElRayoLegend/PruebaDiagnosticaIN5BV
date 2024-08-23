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
public abstract class Dispositivo {
    private String marca;
    private String modelo;
    private String anio;

    public Dispositivo() {
    }

    public Dispositivo(String marca, String modelo, String anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract void encender();
    
    public void encender(int voltaje){
        System.out.println("Encendiendo... " + voltaje + "V");
    }
    
    public void mostrarInformacion(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }
    
}
