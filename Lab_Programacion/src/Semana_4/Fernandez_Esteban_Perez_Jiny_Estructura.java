/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_4;

import java.util.Scanner;

/**
 *
 * @author Esteban Fernandez , Jiny Perez
 */
public class Fernandez_Esteban_Perez_Jiny_Estructura {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        int opcion = 0;

        while (opcion != 4) {
            
            System.out.println("\tMenu");
            System.out.println("1. Cifrado");
            System.out.println("2. Filtrado");
            System.out.println("3. Codigo Enigma");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion del menu: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo del Programa");
                    Thread.sleep(2500);
                    break;
                default:
                    System.out.println("Opcion no valida en el menu");
            }
            
        }

    }
}
