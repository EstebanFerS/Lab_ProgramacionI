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
                    System.out.println("Cifrado");
                    break;
                case 2:
                    
                    /*
                    2 - FILTRAR:
                    Hacer un programa en Java que permita procesar una frase ingresada por el usuario. El objetivo es extraer y mostrar por \
                    pantalla todas las palabras cuya longitud sea mayor a un valor N, también proporcionado por el usuario desde el teclado.
                    El programa debe cumplir con los siguientes pasos:
                    Solicitar al usuario una frase completa mediante entrada por teclado.
                    Solicitar un número entero positivo que representará la longitud mínima requerida.
                    Separar la frase en palabras individuales.
                    Identificar y mostrar únicamente aquellas palabras que tengan una cantidad de caracteres estrictamente mayor al valor 
                    ingresado en forma de lista.
                    Se recomienda ignorar signos de puntuación y considerar como palabras aquellas secuencias de caracteres separadas por espacios.
                     */
                    
                    System.out.println("Filtar");

                    String frase = "",
                     palabra = "",
                     palabraslongitud = "";
                    int longitudMin = 0;

                    System.out.print("Ingrese una frase: ");
                    frase = scanner.next();
                    System.out.print("Ingrese una longitud: ");
                    longitudMin = scanner.nextInt();

                    for (int i = 0; i < frase.length(); i++) {
                        char letra = ' ';
                        letra = frase.charAt(i);
                        if (letra == ' ') {
                            if (palabra.length() >= longitudMin) {
                                palabraslongitud += "\n" + palabra;
                            }
                            palabra = "";
                        } else {
                            palabra += letra;
                        }
                    }
                    if (palabra.length() >= longitudMin) {
                        palabraslongitud += "\n" + palabra;
                    }

                    System.out.print("Palabras con longitud de " + longitudMin + ":");
                    System.out.println(palabraslongitud);
                    break;
                    
                case 3:
                    System.out.println("Codigo Enigma");

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
