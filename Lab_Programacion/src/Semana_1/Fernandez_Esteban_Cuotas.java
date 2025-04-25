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
Cuotas: se requiere un algoritmo que le permita a un banco calcular el valor de la cuota de pago y el total a pagar 
por un prestamo otorgado a un cliente teniendo en cuenta el plazo de pago establecido (en meses), el interes mensual 
aplicado al prestamo(simple), la comision por cuota y el porcentaje de seguro mensual aplicado a la cuota.
**** CUOTAS MENSUALES *******
Cuota de Pago Mensual: HNL ###.##
Total a Pagar: HNL ###.##
*/
public class Fernandez_Esteban_Cuotas {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        int plazoDePago, interesMensual, porcentajeSeguro;
        float prestamoInicial, cuota, valorMensualInteres, seguroMensual, cuotaMensual, totalPagar, comision;
        
        System.out.println("Ingrese el valor del prestamo:");
        prestamoInicial = scanner.nextFloat();

        System.out.println("Ingrese el plazo a pagar el prestamo (meses):");
        plazoDePago = scanner.nextInt();

        System.out.println("Ingrese el interes mensual (%):");
        interesMensual = scanner.nextInt();

        System.out.println("Ingrese el porcentaje de seguro mensual:");
        porcentajeSeguro = scanner.nextInt();

        System.out.println("Ingrese el valor de la comision mensual:");
        comision = scanner.nextFloat();
        
        cuota = prestamoInicial / plazoDePago;

        valorMensualInteres = prestamoInicial * (interesMensual / 100);

        seguroMensual = cuota * (porcentajeSeguro / 100);

        cuotaMensual = cuota + valorMensualInteres + seguroMensual + comision;

        totalPagar = cuotaMensual * plazoDePago;
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: HNL " + cuotaMensual);
        System.out.println("Total a Pagar: HNL " + totalPagar);
        

    }
}


        
    