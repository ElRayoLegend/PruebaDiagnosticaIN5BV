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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void encender (String clave){
        System.out.println("Obteniendo clave de usuario:" + clave);
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    
    
}
