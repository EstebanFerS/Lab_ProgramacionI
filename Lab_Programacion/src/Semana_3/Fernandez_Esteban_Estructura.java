/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author esteb
 */
public class Fernandez_Esteban_Estructura {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        int conteoUno = 0, conteoDos = 0, conteoTres = 0, conteoCuatro = 0;

        while (opcion != 5) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("\tMenu");
            System.out.println("1. Reves");
            System.out.println("2. Numero Perfecto");
            System.out.println("3. Numero Primo Random");
            System.out.println("4. Votos");
            System.out.println("5. Salir");
            System.out.println("====================");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:

                    System.out.println("");

                    /*
                    Palabra Alreves. Ingresar una cantidad de palabras y luego se ingresa una String desde el teclado, e imprimir 
                    al revés a cada palabra que se ingrese, y al final indicar cual ha sido la palabra mas larga y si es palíndromo 
                    (Considerar si existe palabras con la misma cantidad de caracteres). 
                     */
                    String palabra,
                     reves = "",
                     palabrasMayores = "",
                     mayorPalabra = " ",
                     palindroma = " ";
                    int cantidad,
                     longitud = 0,
                     mayorLongitud = 0;

                    System.out.print("Ingrese la cantidad de palabras: ");
                    cantidad = scanner.nextInt();

                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("Ingrese la palabra: ");
                        palabra = scanner.next();

                        longitud = palabra.length();

                        reves = " ";
                        for (int j = (longitud - 1); j >= 0; j--) {
                            reves += palabra.charAt(j);
                        }
                        System.out.println("Alreves: " + reves);

                        if (longitud > mayorLongitud) {
                            mayorLongitud = longitud;
                            palabrasMayores = palabra;
                        } else if (longitud == mayorLongitud) {
                            palabrasMayores += " " + palabra;
                        }
                    }
                    System.out.println("Palabra(s) con mayor longitud (" + mayorLongitud + " caracteres): " + palabrasMayores);

                    int inicio = 0;
                    palabrasMayores = palabrasMayores.trim() + " ";
                    for (int i = 0; i < palabrasMayores.length(); i++) {
                        if (palabrasMayores.charAt(i) == ' ') {
                            mayorPalabra = palabrasMayores.substring(inicio, i);
                            inicio = i + 1;

                            reves = "";
                            for (int j = mayorPalabra.length() - 1; j >= 0; j--) {
                                reves += mayorPalabra.charAt(j);
                            }

                            if (mayorPalabra.equalsIgnoreCase(reves)) {
                                System.out.println(mayorPalabra + " es palindroma.");
                            } else {
                                System.out.println(mayorPalabra + " no es palindroma.");
                            }
                        }
                    }

                    conteoUno++;

                    break;

                case 2:
                    /*
                    Número perfecto. Al escoger esta opción debe hacer un programa que determine si el número ingresado es un número perfecto.
                    Un número es perfecto si la suma de sus divisores (excepto el mismo número) es igual al número.
                     */

                    System.out.println("");
                    int suma = 0,
                     numero = 0;
                    System.out.println("Ingrese un numero: ");
                    numero = scanner.nextInt();

                    for (int i = 1; i < numero; i++) {
                        if (numero % i == 0) {
                            suma += i;
                        }
                    }
                    if (suma == numero) {
                        System.out.println("Es Perfecto");
                    } else {
                        System.out.println("No es Perfecto");
                    }

                    conteoDos++;

                    break;
                case 3:
                    /*
                    Primos. Al escoger esta opción debe hacer un programa que genere 1 número aleatorio del 1 al 100 
                    y muestre si es primo o no es primo; el número de divisores enteros y la lista de los mismos
                    Ejemplo:
                    Primo 3 porque solo tiene dos divisores 
                    Divisores de 3 son : 1 y 3
                     */

                    System.out.println("");
                    Random r = new Random();

                    int random = r.nextInt(100) + 1;
                    boolean primo = true;

                    System.out.println("Numero Primo Random");

                    if (random <= 1) {
                        primo = false;
                    } else {
                        for (int i = 2; i < random; i++) {
                            if (random % i == 0) {
                                primo = false;
                                break;
                            }
                        }
                    }

                    if (primo) {
                        System.out.println("El numero " + random + " es primo.");
                    } else {
                        System.out.println("El numero " + random + " no es primo.");
                    }

                    System.out.print("Los divisores de " + random + " son: ");
                    for (int i = 1; i <= random; i++) {
                        if (random % i == 0) {
                            System.out.print(i + " ");
                        }
                    }

                    conteoTres++;

                    break;

                case 4:
                    /*
                    Votaciones. Al escoger esta opción, el programa pide que se ingrese lo siguiente:
                    Cuantos votantes hay en el país.
                    Luego se está ingresando de manera repetitiva VOTO por VOTO según la cantidad de votantes que existen:
                    Se pide del teclado la planilla por la cual votara: “AZUL”, “ROJO”, “NEGRO” o “AMARILLO”, si se ingresa otro se toma como voto nulo.
                    El ciclo terminará cuando se hayan ingresado todos los votos.
                    Al final se imprime cuál fue la planilla ganadora (Se asumirá que no habrá empate), pero la votación es válida si 
                    la cantidad de votos válidos es el 60% de los votos totales, si no es así, se imprime “VOTACIÓN FALLIDA”.
                     */

                    int votoAzul = 0,
                     votoRojo = 0,
                     votoAmarillo = 0,
                     votoNegro = 0,
                     votosValidos = 0,
                     votosNulos = 0;
                    String voto;
                    double porcentaje,
                     votantes;

                    System.out.print("Cuantos votantes hay en el pais: ");
                    votantes = scanner.nextInt();

                    for (int i = 0; i < votantes; i++) {
                        System.out.println("Elija su voto");
                        System.out.println("Azul | Rojo | Negro | Amarillo");
                        voto = scanner.next().toLowerCase();

                        switch (voto) {
                            case "azul":
                                votoAzul++;
                                votosValidos++;
                                break;
                            case "rojo":
                                votoRojo++;
                                votosValidos++;
                                break;
                            case "negro":
                                votoNegro++;
                                votosValidos++;
                                break;
                            case "amarillo":
                                votoAmarillo++;
                                votosValidos++;
                                break;
                            default:
                                votosNulos++;
                                System.out.println("Voto inválido. Se contará como nulo.");
                                break;
                        }
                    }

                    porcentaje = (votosValidos / votantes) * 100;

                    if (porcentaje < 60) {
                        System.out.println("Votacion Fallida, los votos validos son inferiores al 60%");
                    } else {
                        if (votoAzul > votoRojo && votoAzul > votoNegro && votoAzul > votoAmarillo) {
                            System.out.println("El Ganador es el Partido Azul con: " + votoAzul + " votos.");
                        } else if (votoRojo > votoAzul && votoRojo > votoNegro && votoRojo > votoAmarillo) {
                            System.out.println("El Ganador es el Partido Rojo con: " + votoRojo + " votos.");
                        } else if (votoNegro > votoAzul && votoNegro > votoRojo && votoNegro > votoAmarillo) {
                            System.out.println("El Ganador es el Partido Negro con: " + votoNegro + " votos.");
                        } else if (votoAmarillo > votoAzul && votoAmarillo > votoRojo && votoAmarillo > votoNegro) {
                            System.out.println("El Ganador es el Partido Amarillo con: " + votoAmarillo + " votos.");
                        } else {
                            System.out.println("Empate entre múltiples partidos. Se requiere un desempate.");
                        }

                        System.out.println("Votos Validados: " + votosValidos);
                        System.out.println("Votos Nulos: " + votosNulos);
                    }

                    conteoCuatro++;

                    break;

                case 5:
                    System.out.println("Uso de Reves " + conteoUno);
                    System.out.println("Uso de Numero Perfecto: " + conteoDos);
                    System.out.println("Uso de Numero Primo Random: " + conteoTres);
                    System.out.println("Uso de Votos: " + conteoCuatro);
                    System.out.print("Saliendo");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);

                    break;

                default:
                    System.out.println("Opcion no valida en el menu");
                    break;
            }

        }
    }
}
