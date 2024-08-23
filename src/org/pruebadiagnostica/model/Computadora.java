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
public class Computadora extends Dispositivo {
    
    private String sistemaOperativo;

    public Computadora() {
    }

    public Computadora(String sistemaOperativo, String marca, String modelo, String anio) {
        super(marca, modelo, anio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void encender() {
        System.out.println("La computadora esta encendida");
    }
    
    public void encender (String clave){
        System.out.println("Encendiendo dispositivo con clave de usuario:" + clave);
        System.out.println("\nDISPOSITIVO ENCENDIDO");
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
    
}
