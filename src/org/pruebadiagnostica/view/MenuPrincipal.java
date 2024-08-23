/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pruebadiagnostica.view;

import java.util.Scanner;
import org.pruebadiagnostica.model.Telefono;

/**
 *
 * @author informatica
 */
public class MenuPrincipal {
    Scanner leer = new Scanner(System.in);
    boolean flag = true;
    int opcion, opcion1;
    String skip;
    public void inicio(){
        System.out.println("Bienvenido al programa!");
        Telefono telefono = new Telefono();
        while(flag == true){
            try{
                System.out.println("\nSelecciona una opcion: \n1. Ejercicio 1 \n2. Ejercicio 2 \n3. Ejercicio 3 \n4. Salir");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:

                        break;
                    case 3:
                        System.out.println("EJERCICIO 3 \nSelecciona el dispositivo: \n1. Telefono \n2. Computadora \n3. Televisor");
                        opcion1 = leer.nextInt();
                        switch (opcion1) {
                            case 1:
                                System.out.println("\nIngresa la marca del dispositivo:");
                                telefono.setMarca(leer.nextLine());
                                System.out.println("\nIngresa el modelo del dispositivo:");
                                telefono.setModelo(leer.nextLine());
                                System.out.println("\nIngresa el año del dispositivo:");
                                telefono.setAnio(leer.nextLine());
                                break;
                            default:
                                System.out.println("\nSELECCIONA UNA OPCION VALIDA!");
                        }
                        
                        break;
                    case 4:
                        System.out.println("\nEstas seguro de salir? \n1. Si \n2. No");
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

            }catch(Exception e){
                System.out.println("\nINGRESA UN CARACTER VALIDO!");
                skip = leer.next();
            }
        }
    }
}
