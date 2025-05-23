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

            System.out.println("");
            System.out.println("\t\tMenu Principal");
            System.out.println("----------------------------------------------");
            System.out.println("| 1. Piramide                                |");
            System.out.println("| 2. Clave                                   |");
            System.out.println("| 3. Piedra Papel Tijera                     |");
            System.out.println("| 4. Adivinar                                |");
            System.out.println("| 5. Salir                                   |");
            System.out.println("----------------------------------------------");
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
                    Hacer un programa que permita cifrar y descifrar un mensaje de texto utilizando un cifrado por inversión de letras del alfabeto, 
                    el texto debe ser ingresado desde el teclado.Cada letra del mensaje será reemplazada por su equivalente opuesto en el alfabeto, 
                    siguiendo estas reglas:
                    Las letras minúsculas 'a' a 'z' se invierten:
                    'a' ↔ 'z', 'b' ↔ 'y', ..., 'm' ↔ 'n'
                    Las letras mayúsculas 'A' a 'Z' se invierten igual:
                    'A' ↔ 'Z', 'B' ↔ 'Y', ..., 'M' ↔ 'N'
                     */
                    String texto = "",
                     textocifrado = "";
                    char letra = ' ';
                    int opcionClave = 0;

                    while (opcionClave != 3) {

                        System.out.println("");
                        System.out.println("\t\t\tMenu");
                        System.out.println("------------------------------------------------------");
                        System.out.println("|     1. Cifrar     2. Descifrar     3. Regresar     |");
                        System.out.println("------------------------------------------------------");

                        System.out.print("Ingrese una opcion:");
                        opcionClave = scanner.nextInt();

                        switch (opcionClave) {
                            case 1:

                                System.out.println("");
                                System.out.print("Ingrese el texto a cifrar: ");
                                texto = scanner.next();

                                for (int i = 0; i < texto.length(); i++) {
                                    letra = texto.charAt(i);
                                    if (letra >= 'a' && letra <= 'z') {
                                        textocifrado += (char) ('z' - (letra - 'a'));
                                    } else if (letra >= 'A' && letra <= 'Z') {
                                        textocifrado += (char) ('Z' - (letra - 'A'));
                                    } else {
                                        textocifrado += letra;
                                    }
                                }

                                System.out.println("El texto cifrada es: " + textocifrado + "\n");
                                texto = "";
                                textocifrado = "";
                                break;

                            case 2:

                                System.out.println("");
                                System.out.print("Ingrese el texto a descifrar: ");
                                texto = scanner.next();

                                for (int i = 0; i < texto.length(); i++) {
                                    letra = texto.charAt(i);
                                    if (letra >= 'a' && letra <= 'z') {
                                        textocifrado += (char) ('z' - (letra - 'a'));
                                    } else if (letra >= 'A' && letra <= 'Z') {
                                        textocifrado += (char) ('Z' - (letra - 'A'));
                                    } else {
                                        textocifrado += letra;
                                    }
                                }

                                System.out.println("El texto descifrado es: " + textocifrado + "\n");
                                texto = "";
                                textocifrado = "";
                                break;

                            case 3:
                                System.out.println("");
                                System.out.println("Regresando");
                                Thread.sleep(3000);
                                break;
                            default:
                                System.out.println("Opcion no valida en el menu");
                                break;

                        }
                    }

                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.print("Saliendo del Programa");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.println(".");
                    Thread.sleep(800);
                    break;

                default:
                    System.out.println("Opcion no valida en el menu ");
                    break;
            }
        }
    }
}
