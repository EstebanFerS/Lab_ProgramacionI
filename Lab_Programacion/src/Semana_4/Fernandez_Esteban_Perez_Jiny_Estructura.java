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
            System.out.println("--------------------");
            System.out.println("\tMenu");
            System.out.println("--------------------");
            System.out.println("1. Cifrado Cesar");
            System.out.println("2. Filtrado");
            System.out.println("3. Codigo Enigma");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion del menu: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    /*
                    Hacer un programa en Java que permita aplicar el cifrado César a una frase ingresada por el usuario desde el teclado. 
                    El programa debe solicitar una cadena de texto y un número entero positivo que representará la cantidad de posiciones que se desea desplazar 
                    cada letra dentro del alfabeto.El cifrado debe cumplir con las siguientes condiciones:
                    Solo deben cifrarse las letras del alfabeto, manteniendo sin cambios los espacios, números, signos de puntuación y demás símbolos.
                    El cifrado debe preservar las mayúsculas y minúsculas, desplazando cada letra respetando su caso.
                    El desplazamiento debe realizarse en sentido positivo, es decir, hacia la derecha en el alfabeto. Si se sobrepasa la letra Z o z, 
                    se debe continuar desde el inicio del alfabeto.
                    Cifrado Cesar:
                    El cifrado César es un método de encriptación muy antiguo, atribuido a Julio César. Consiste en desplazar cada letra del mensaje un número 
                    fijo de posiciones en el alfabeto.
                    Por ejemplo, si usamos un desplazamiento de +3:
                    'A' se convierte en 'D'
                    'B' en 'E'
                    'Z' vuelve al inicio y se convierte en 'C'
                    Este tipo de cifrado solo afecta a letras, dejando los espacios, números y símbolos sin cambios.
                     */
                    System.out.println("----------------------------");
                    System.out.println("\tCifrado Cesar");
                    System.out.println("----------------------------\n");
                    System.out.print("Ingrese la frase a cifrar: ");
                    String texto = scanner.next();

                    System.out.print("Cantidad de desplazamiento: ");
                    int desplazamiento = scanner.nextInt();
                    String textoCifrado = "";

                    for (int i = 0; i < texto.length(); i++) {
                        char letra = texto.charAt(i);

                        if (letra >= 'A' && letra <= 'Z') {
                            letra = (char) ('A' + (letra - 'A' + desplazamiento) % 26);
                        } else if (letra >= 'a' && letra <= 'z') {
                            letra = (char) ('a' + (letra - 'a' + desplazamiento) % 26);
                        }
                        textoCifrado += letra;
                    }

                    System.out.println("Texto cifrado: " + textoCifrado);

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
                    System.out.println("----------------------");
                    System.out.println("\tFiltar");
                    System.out.println("----------------------");

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

                    /*
                    Hacer un programa en Java que permita al usuario encriptar y desencriptar un texto utilizando una técnica simple basada en la 
                    posición de los caracteres. El programa debe mostrar un menú interactivo para que el usuario elija la opción deseada.
                    El programa debe mostrar un menú con las siguientes opciones:
                    1. Encriptar texto
                    2. Desencriptar texto
                    3. Regresar
                    La encriptación debe consistir en:
                    Separar los caracteres ubicados en posiciones pares y posiciones impares del texto original.
                    Concatenar primero los caracteres de posiciones pares y luego los de posiciones impares.
                    Texto original: "mensaje"
                    Posiciones pares: 'm', 'n', 'a', 'e' → "mnae"
                    Posiciones impares: 'e', 's', 'j' → "esj"
                    Texto encriptado: "mnaeesj"
                    La desencriptación debe:
                    Tomar un texto encriptado generado con el método anterior.
                    Separar la primera mitad como los caracteres de posiciones pares y la segunda mitad como los de posiciones impares.
                    Reconstruir el texto original intercalando ambos grupos de caracteres.
                    Ejemplo:
                    Texto encriptado: "msjenae"
                    Resultado: "mensaje"
                     */
                    System.out.println("------------------------------");
                    System.out.println("\tCodigo Enigma");
                    System.out.println("------------------------------");

                    String ultimoEncriptado = "";

                    do {
                        System.out.println("\n--- Menu ---");
                        System.out.println("1. Encriptar texto");
                        System.out.println("2. Desencriptar");
                        System.out.println("3. Regresar");
                        System.out.print("Seleccione una opcion: ");
                        opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.print("Ingrese el texto a encriptar: ");
                                String textoEncriptar = scanner.next();

                                String pares = "";
                                String impares = "";

                                for (int i = 0; i < textoEncriptar.length(); i++) {
                                    if (i % 2 == 0) {
                                        pares += textoEncriptar.charAt(i);
                                    } else {
                                        impares += textoEncriptar.charAt(i);
                                    }
                                }

                                ultimoEncriptado = pares + impares;
                                System.out.println("Texto encriptado: " + ultimoEncriptado);
                                break;

                            case 2:
                                if (ultimoEncriptado.equals("")) {
                                    System.out.println("No hay texto encriptado previamente.");
                                } else {
                                    int mitad = (ultimoEncriptado.length() + 1) / 2;
                                    String partePares = ultimoEncriptado.substring(0, mitad);
                                    String parteImpares = ultimoEncriptado.substring(mitad);

                                    String textoDesencriptado = "";

                                    for (int i = 0; i < ultimoEncriptado.length(); i++) {
                                        if (i % 2 == 0 && i / 2 < partePares.length()) {
                                            textoDesencriptado += partePares.charAt(i / 2);
                                        } else if (i % 2 != 0 && i / 2 < parteImpares.length()) {
                                            textoDesencriptado += parteImpares.charAt(i / 2);
                                        }
                                    }

                                    System.out.println("Texto Encriptado: " + ultimoEncriptado);
                                    System.out.println("Texto desencriptado: " + textoDesencriptado);
                                }
                                break;

                            case 3:
                                System.out.println("Saliendo del programa...");
                                break;

                            default:
                                System.out.println("Opcion invalida. Intente de nuevo.");
                        }

                    } while (opcion != 3);
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
