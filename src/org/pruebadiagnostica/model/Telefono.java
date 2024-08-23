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
public class Telefono extends Dispositivo {

    private String tipo;

    public Telefono() {
    }

    public Telefono(String tipo, String marca, String modelo, String anio) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }
    
    @Override
    public void encender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void encender(int codigo){
        System.out.println("Encendiendo con codigo de desbloqueo: " + codigo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
