/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pruebadiagnostica.view;

import java.util.Scanner;
import org.pruebadiagnostica.model.Computadora;
import org.pruebadiagnostica.model.Telefono;
import org.pruebadiagnostica.model.Televisor;

/**
 *
 * @author informatica
 */
public class MenuPrincipal {
    Scanner leer = new Scanner(System.in);
    boolean flag = true;
    int opcion, opcion1, codDesbloqueo, volumen;
    String skip, clave;
    public void inicio(){
        System.out.println("Bienvenido al programa!");
        Telefono telefono = new Telefono();
        Computadora computadora = new Computadora();
        Televisor televisor = new Televisor();
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
                                telefono.setMarca(leer.nextLine());
                                System.out.println("\nIngresa el modelo del dispositivo:");
                                telefono.setModelo(leer.nextLine());
                                System.out.println("\nIngresa el año del dispositivo:");
                                telefono.setAnio(leer.nextLine());
                                System.out.println("\nIngresa el tipo de telefono:");
                                telefono.setTipo(leer.nextLine());
                                
                                System.out.println("\nDeseas encender el telefono? \n1. Si \n2. No");
                                opcion = leer.nextInt();
                                if (opcion == 1) {
                                    System.out.println("\nDeseas encenderlo con un codigo de desbloqueo? \n1. Si \n2. No");
                                    opcion = leer.nextInt();
                                    if (opcion == 1) {
                                        System.out.println("\nIngresa el codigo de desbloqueo:");
                                        codDesbloqueo = leer.nextInt();
                                        telefono.encender(codDesbloqueo);
                                    }else{
                                        telefono.encender();
                                    }
                                }else{
                                    System.out.println("El telefono no se encendio");
                                }
                                
                                telefono.mostrarInformacion();
                                
                                break;
                                
                            case 2:
                                System.out.println("\nIngresa la marca del dispositivo:");
                                computadora.setMarca(leer.nextLine());
                                computadora.setMarca(leer.nextLine());
                                System.out.println("\nIngresa el modelo del dispositivo:");
                                computadora.setModelo(leer.nextLine());
                                System.out.println("\nIngresa el año del dispositivo:");
                                computadora.setAnio(leer.nextLine());
                                System.out.println("\nIngresa el sistema operativo de la computadora:");
                                computadora.setSistemaOperativo(leer.nextLine());
                                
                                System.out.println("\nDeseas encender la computadora? \n1. Si \n2. No");
                                opcion = leer.nextInt();
                                if (opcion == 1) {
                                    System.out.println("\nDeseas encenderla con clave de usuario? \n1. Si \n2. No");
                                    opcion = leer.nextInt();
                                    if (opcion == 1) {
                                        System.out.println("\nIngresa la clave de usuario:");
                                        clave = leer.nextLine();
                                        clave = leer.nextLine();
                                        computadora.encender(clave);
                                    }else{
                                        computadora.encender();
                                    }
                                }else{
                                    System.out.println("La PC no se encendio");
                                }
                                
                                computadora.mostrarInformacion();
                                
                                break;
                            case 3:
                                System.out.println("\nIngresa la marca del dispositivo:");
                                televisor.setMarca(leer.nextLine());
                                televisor.setMarca(leer.nextLine());
                                System.out.println("\nIngresa el modelo del dispositivo:");
                                televisor.setModelo(leer.nextLine());
                                System.out.println("\nIngresa el año del dispositivo:");
                                televisor.setAnio(leer.nextLine());
                                System.out.println("\nIngresa el tamanio de la pantalla:");
                                televisor.setTamanioPantalla(leer.nextInt());
                                
                                System.out.println("\nDeseas encender el televisor? \n1. Si \n2. No");
                                opcion = leer.nextInt();
                                if (opcion == 1) {
                                    System.out.println("\nDeseas encenderlo con un volumen predeterminado? \n1. Si \n2. No");
                                    opcion = leer.nextInt();
                                    if (opcion == 1) {
                                        System.out.println("\nIngresa el volumen:");
                                        volumen = leer.nextInt();
                                        televisor.encender(volumen);
                                    }else{
                                        televisor.encender();
                                    }
                                }else{
                                    System.out.println("El televisor no se encendio");
                                }
                                
                                televisor.mostrarInformacion();
                                
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
