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
En una institución de enseñanza de inglés necesita un programa que le permita,cada día, procesar 
observaciones sobre las clases de ese día.El instituto dicta clases a estudiantes de distintos niveles 
cada nivel tiene clases en un día de la semana diferente:

los lunes se dicta el nivel inicial,
los martes el nivel intermedio,
los miércoles el nivel avanzado,
los jueves son para práctica hablada y
los viernes se dicta inglés para viajeros.

Se debe comenzar por solicitar al usuario que ingrese la fecha actual en formato "día,
DD/MM", donde [día] es un día de la semana,DD es el número de día y MM es el número de mes.
Si el usuario ingresa un día de la semana inexistente o una fecha cuyo día supere el número 31 o 
el mes supere el número 12,finalizar el programa indicando que se produjo un error.
Debe permitirse que ingrese el día de la semana en minúsculas o mayúsculas indistintamente.
Como precondición se tiene que lo ingresado por el usuario tendrá la forma <[alfanumérico], [numérico]/[numérico]>.
Una vez indicada la fecha, el usuario necesita poder indicar si ese día se tomaron exámenes, pero eso sólo 
si se trata de los niveles inicial,intermedio o avanzado, 

ya que las prácticas habladas y el inglés para viajeros no tienen exámenes.
Si hubo exámenes, el usuario ingresará cuántos alumnos aprobaron y cuántos no, y el programa le mostrará 
el porcentaje de aprobados.Si el día fue el correspondiente a práctica hablada, el usuario deberá ingresar 
el porcentaje de asistencia a clase y el programa le indicará "asistió la mayoría" en caso de que la asistencia 
sea mayor al 50% o "no asistió la mayoría" si no es así. Si se trata del inglés para viajeros y la fecha actual 
corresponde al día 1 del mes 1 o del mes 7, se deberá imprimir "Comienzo de nuevo ciclo" y solicitar al usuario 
que ingrese la cantidad de alumnos del nuevo ciclo y el precio en $ por cada alumno, para luego imprimir el 
ingreso total en $.
Tips: Investigar substring()
*/
public class Fernandez_Esteban_Clases {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        int decision;
        float porcentaje, aprobados = 0, reprobados = 0, totalAlumnos = 0, alumnos, precio, total = 0;
        
        System.out.println("Ingrese la fecha actual");
        System.out.println("Ejemplo Lunes, 01/10");
        String fecha = scanner.next();
        String diaSemana = fecha.substring(0, fecha.indexOf(","));
        String dia = fecha.substring(fecha.indexOf(" ") + 1, fecha.indexOf("/"));
        String mes = fecha.substring(fecha.indexOf("/") + 1);
        
        if(Integer.parseInt(dia) > 31 || Integer.parseInt(dia) < 1){
            System.out.println("Ingrese una fecha valida :D");
            
        }else{
            if(diaSemana.equalsIgnoreCase("Lunes") || diaSemana.equalsIgnoreCase("Martes") || diaSemana.equalsIgnoreCase("Miercoles") ){
                System.out.println("Se realizo examen este dia: 1. Si  2. No");
                decision = scanner.nextInt();
                if(decision == 1){
                    System.out.println("Cuantos Alumnos Aprobaron?");
                    aprobados = scanner.nextInt();
                    System.out.println("Cuantos Alumnos Reprobaron?");
                    reprobados = scanner.nextInt();
                    
                    totalAlumnos = aprobados + reprobados;
                    
                    porcentaje = (aprobados/totalAlumnos) * 100;
                    
                    System.out.println("El procentaje de alumnos aprobados es: " + String.format("%.2f", porcentaje));
                    
                }else if(decision == 2){
                    System.out.println("No se realizo Examanes :c");
                }else{
                    System.out.println("Opcion no Valida");
                }
            }
            else if(diaSemana.equalsIgnoreCase("Jueves")){
                System.out.println("Ingrese el porcentaje de alumnos que asistieron: ");
                float asistencia = scanner.nextFloat();
                if(asistencia > 50){
                    System.out.println("Asistio la Mayoria");
                }else{
                    System.out.println("No asistio la Mayoria");
                }
            }
            else if(diaSemana.equalsIgnoreCase("Viernes")){
                if(Integer.parseInt(dia) == 1 && Integer.parseInt(mes) == 1 || Integer.parseInt(mes) == 7) {
                    System.out.println("Comienzo de Nuevo Ciclo");
                    System.out.println("Ingrese la cantidad de alumnos nuevos: ");
                    alumnos = scanner.nextFloat();
                    System.out.println("Ingrese el precio por alumno: ");
                    precio = scanner.nextFloat();
                    total = alumnos * precio;
                    System.out.println("El Ingreso total es de: "+ String.format(".%f", total));
                }
            }
            else{
                System.out.println("No existe ese dia");
            }
        }
        
        
    }
}
