/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_5;

import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Fernandez_Esteban_Exam1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("1. Piramide");
            System.out.println("2. Clave");
            System.out.println("3. Piedra Papel Tijera");
            System.out.println("4. Adivinar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion del menu: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Cantidad de filas de la piramide: ");
                    int cantidad = scanner.nextInt();
                    int num = 1;
                    System.out.println("");
                    for (int i = 1; i <= cantidad; i++) {
                        int suma = 0;
                        for (int j = 1; j <= i; j++) {
                            System.out.print(num + " ");
                            suma += num;
                            num += 2;
                        }
                        System.out.println("= " + suma);
                    }
                    Thread.sleep(1500);
                    System.out.println("");

                    break;

                case 2:

                    /*
                    
                     */
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    break;
            }
        }
    }
}
