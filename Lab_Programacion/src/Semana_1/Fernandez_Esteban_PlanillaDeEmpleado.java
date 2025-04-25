/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana_1;
import java.util.Scanner;

/**
 *
 * @author esteb
 */

/*
Planilla de Empleado: se requiere un algoritmo para elaborar una parte de la planilla de un empleado. Para ello se dispone de sus horas laboradas en el mes, 
así como la tarifa por hora, al conocer estas informaciones de horas y el precio por hora, son asignadas por el usuario, para lograr obtener el salario 
del empleado semanal.  Los valores deben ser ingresados desde el teclado, asi como horas trabajadas, tarifa por hora y el nombre completo 
del empleado(usar next( ), en donde, debe aceptar espacios en blanco) . 
----- Boleta del Empleado -------
Nombre del Empleado: " "
Hora de Trabajo Mensual: ##
Tarifa por Hora : Lps. ##.##
Salario del Empleado Semanal: Lps. ##.##
*/

public class Fernandez_Esteban_PlanillaDeEmpleado {
    public static void main(String[] args){
        String nombre;
        int horas_trabajadas;
        double tarifa_hora, salario_semanal;
        
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        
        System.out.println("Favor ingrese el nombre completo del empleado");
        nombre = scanner.next();
        
        System.out.println("Favor ingresar las horas trabajas en el mes");
        horas_trabajadas = scanner.nextInt();
        
        System.out.println("Favor ingresar la tarifa por hora trabajada");
        tarifa_hora = scanner.nextDouble();
        
        salario_semanal = (horas_trabajadas * tarifa_hora)/4;
        
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Nombre del Empleado: " + nombre );
        System.out.println("Hora de Trabajo Mensual: " + horas_trabajadas + " horas");
        System.out.println("Tarifa por Hora : Lps. " + tarifa_hora);
        System.out.println("Salario del Empleado Semanal: Lps. " + salario_semanal);
    }
}
