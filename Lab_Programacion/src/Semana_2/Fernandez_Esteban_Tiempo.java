/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_2;

import java.util.Scanner;

/**
 *
 * @author esteb
 */

/*
Hacer un programa que pide un número de segundos (número entero), y el programa se va a
encargar de convertirlo en horas, minutos y segundos.
Básicamente se basa en que la hora son 3600 segundos, y el minuto son 60 segundos, a partir de
aquí, se necesita emplear la división y resta. También validar que su valor no se menor e igual que
cero, si existe este valor ingresado, mostrar un mensaje indicando “no se permite ese valor “.
Imprimir la salida en pantalla.(Usar Operador Ternario)
*/
public class Fernandez_Esteban_Tiempo {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        int segundos = 0, horas = 0, segundosRestantes = 0, minutos = 0, segundosFinales;
        
        System.out.print("Ingrese la cantidad a segundos a convertir: ");
        segundos = scanner.nextInt();
        
        horas = segundos/3600;
        segundosRestantes = segundos % 3600;
        minutos = segundosRestantes/60;
        segundosFinales = segundosRestantes % 60;
        System.out.println(segundos > 0 ? horas + " horas " + minutos + " minutos " + segundosFinales + " segundos" : "No se permite ese valor."  );
      
    }
}
