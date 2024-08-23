/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pruebadiagnostica.view;

import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class MenuPrincipal {
    Scanner leer = new Scanner(System.in);
    boolean flag = true;
    int opcion;
    public void inicio(){
        System.out.println("Bienvenido al programa!");
        while(flag == true){
            System.out.println("\nSelecciona una opcion: \n1. Ejercicio 1 \n2. Ejercicio 2 \n3. Ejercicio 3 \n4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 4:
                    System.out.println("Estas seguro de salir? \n1. Si \n2. No");
                    int salir = leer.nextInt();
                    if (salir == 1) {
                        flag = false;
                        System.out.println("Hasta pronto!");
                    }else{
                        flag = true;
                        System.out.println(" ");
                    }
                    break;
                default:
                    System.out.println("\nSELECCIONA UNA OPCION VALIDA!");
            }
        }
    }
}
