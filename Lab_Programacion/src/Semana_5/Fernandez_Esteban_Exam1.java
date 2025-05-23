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

                    /*
                    Crear un programa en Java que permita al usuario jugar contra la computadora. A continuación, se describen los requisitos del ejercicio:
                    
                    Programa:
                    - El programa debe imprimir un mensaje de bienvenida al usuario.
                    - Se debe utilizar un loop para permitir múltiples rondas del juego.
                    
                    Entrada de Usuario:
                    - Solicitar al usuario que ingrese su elección entre "piedra", "papel" o "tijera".
                    - Validar la entrada del usuario para garantizar que solo se ingresen opciones válidas. Si la entrada no es válida, solicitar al usuario que ingrese nuevamente.
                    
                    Elección de la Computadora:
                    - Generar aleatoriamente la elección de la computadora entre "piedra", "papel" o "tijera". Buscar Random
                    
                    Comparación y Anuncio del Ganador:
                    - Comparar la elección del usuario con la elección de la computadora según las reglas del juego.
                    - Imprimir un mensaje indicando la elección de la computadora y anunciar al ganador de la ronda o si hay un empate.
                    
                    Pregunta de Juego Nuevamente:
                    - Preguntar al usuario si desea jugar nuevamente.
                    - Si la respuesta es afirmativa, repetir el juego. Si la respuesta es negativa, finalizar el programa.
                     */
                    System.out.println("Bienvenido a Piedra Papel o Tijera :D");

                    boolean jugar = true;

                    while (jugar) {
                        String eleccionUsuario = "";
                        while (true) {
                            System.out.print("\nElija entre Piedra, Papel, o Tijera: ");
                            eleccionUsuario = scanner.next().toLowerCase();
                            if (eleccionUsuario.equals("piedra") || eleccionUsuario.equals("papel") || eleccionUsuario.equals("tijera")) {
                                break;
                            } else {
                                System.out.println("Opcion no valida en el piedra papel o tijera");
                            }
                        }

                        int aleatorio = random.nextInt(3) + 1;
                        String eleccionSistema = "";

                        if (aleatorio == 1) {
                            eleccionSistema = "piedra";
                        } else if (aleatorio == 2) {
                            eleccionSistema = "papel";
                        } else {
                            eleccionSistema = "tijera";
                        }

                        System.out.println("La computadora eligio: " + eleccionSistema);

                        if (eleccionUsuario.equals(eleccionSistema)) {

                            System.out.println("Ha sido un Empate");

                        } else if ((eleccionUsuario.equals("piedra") && eleccionSistema.equals("tijera"))
                                || (eleccionUsuario.equals("papel") && eleccionSistema.equals("piedra"))
                                || (eleccionUsuario.equals("tijera") && eleccionSistema.equals("papel"))) {
                            System.out.println("Has Ganado :D ");
                        } else {
                            System.out.println("La computadora ha ganado :c");
                        }

                        System.out.println("");
                        System.out.println("Desea jugar otra ronda?");

                        boolean opcionCorrecta = false;

                        while (!opcionCorrecta) {

                            System.out.print("(si/no): ");
                            String continuar = scanner.next().toLowerCase();

                            if (continuar.equals("si")) {

                                System.out.println("Que disfrute las rondas que desee");
                                opcionCorrecta = true;

                            } else if (continuar.equals("no")) {

                                System.out.println("Gracias por jugar Piedra Papel o Tijera");
                                opcionCorrecta = true;
                                jugar = false;
                                break;

                            } else {

                                System.out.println("No es una opcion valida elija una");
                                opcionCorrecta = false;

                            }
                        }
                    }

                    break;

                case 4:

                    /*
                    Crear un programa que permita adivinar un número. El programa genera un número aleatorio del 1 al 100. 
                    A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,
                    a demás de los intentos que tiene el usuario (10 intentos para acertarlo). El programa termina cuando se acierta el número 
                    (además indicar en cuantos intentos lo ha acertado), si se llega al límite de intentos mostrar el número que había generado de forma aleatoria.
                     */
                    int numAleatorio = 0,
                     numUsuario = 0,
                     intentos = 10;
                    boolean acertado = false;

                    numAleatorio = random.nextInt(100) + 1;
                    System.out.println("Adivna el numero entre 1 - 100 ");

                    while (!acertado && intentos > 0) {

                        System.out.print("Ingrese un numero: ");
                        numUsuario = scanner.nextInt();

                        if (numUsuario < numAleatorio) {
                            System.out.println("El numero es Mayor");
                        } else if (numUsuario > numAleatorio) {
                            System.out.println("El numero es Menor");
                        } else {
                            acertado = true;
                            System.out.println("Has acertado el numero en: " + (11 - intentos) + " intentos");
                            break;
                        }

                        intentos--;

                        if (intentos == 0 && !acertado) {
                            System.out.println("Ya no quedan mas intentos");
                            System.out.println("El numero era: " + numAleatorio);
                        } else if (!acertado) {
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
