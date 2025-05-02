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
Hacer un programa que pueda solicitar dos fechas desde el teclado (formato de la fecha es Día/Mes/Año) 
y mostrar el número de días que hay de diferencia. Suponiendo todos los meses de 30 días.(Usar substring())
*/

public class Fernandez_Esteban_Fecha {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String primerFecha, segundaFecha;

        System.out.println("Ingrese la primera fecha: Dia/Mes/Anio");
        primerFecha = scanner.next();
        System.out.println("Ingrese la segunda fecha: Dia/Mes/Anio");
        segundaFecha = scanner.next();

        int primerDia = Integer.parseInt(primerFecha.substring(0, 2));
        int primerMes = Integer.parseInt(primerFecha.substring(3, 5));
        int primerAnio = Integer.parseInt(primerFecha.substring(6, 10));

        int segundoDia = Integer.parseInt(segundaFecha.substring(0, 2));
        int segundoMes = Integer.parseInt(segundaFecha.substring(3, 5));
        int segundoAnio = Integer.parseInt(segundaFecha.substring(6, 10));

        if (primerDia > 30 || primerMes > 12 || segundoDia > 30 || segundoMes > 12) {
            System.out.println("Fechas no validas");
        } else {
            int totalDiasPrimera = primerAnio * 360 + primerMes * 30 + primerDia;
            int totalDiasSegunda = segundoAnio * 360 + segundoMes * 30 + segundoDia;

            int diferenciaDias;
            
            if (totalDiasPrimera > totalDiasSegunda) {
                diferenciaDias = totalDiasPrimera - totalDiasSegunda;
            } else {
                diferenciaDias = totalDiasSegunda - totalDiasPrimera;
            }

            System.out.println("La diferencia entre las fechas es de " + diferenciaDias + " dias.");
        }
        
        scanner.close();
    }
}