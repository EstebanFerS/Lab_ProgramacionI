/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_5;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author esteb
 */
public class Fernandez_Esteban_Exam1 {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
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
                    
                    /*
                    Crear un programa que permita adivinar un número. El programa genera un número aleatorio del 1 al 100. 
                    A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
                    a demás de los intentos que tiene el usuario (10 intentos para acertarlo). El programa termina cuando se acierta el número 
                    (además indicar en cuantos intentos lo ha acertado), si se llega al límite de intentos mostrar el número que había generado de forma aleatoria.
                    */
                    
                    int numAleatorio = 0, numUsuario = 0, intentos = 10;
                    boolean acertado = false;
                    
                    numAleatorio = random.nextInt(100) + 1;
                    System.out.println("Adivna el numero entre 1 - 100 ");
                    
                    while(!acertado && intentos > 0){
                        
                        System.out.print("Ingrese un numero: ");
                        numUsuario = scanner.nextInt();
                        
                        if(numUsuario < numAleatorio){
                            System.out.println("El numero es Mayor");
                        }else if(numUsuario > numAleatorio){
                            System.out.println("El numero es Menor");
                        }else{
                            acertado = true;
                            System.out.println("Has acertado el numero en: " + (11-intentos)+ " intentos");
                            break;
                        }
                        
                        intentos --;
                        
                        if(intentos == 0 && !acertado){
                            System.out.println("Ya no quedan mas intentos");
                            System.out.println("El numero era: " + numAleatorio);
                        }else if(!acertado){
                            System.out.println("Intentos Restantes: " + intentos);
                        }
                    }
                    
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
