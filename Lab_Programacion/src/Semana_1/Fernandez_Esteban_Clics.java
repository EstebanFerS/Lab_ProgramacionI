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

Clics: supongamos que promueves tu empresa en Google y debes calcular el costo promedio para 180 clics, donde los clics tienen los siguientes 
costos 60 clics = $0.30 cada uno, 100 clics = $0.25 cada uno, 20 clics = $0.80 cada uno.

Imprime el costo promedio que tendrás. Puedes encontrar la definición de costo promedio aquí:

https://support.google.com/google-ads/answer/14074?hl=es-419Links to an external site.

Calcúlalo de manera que debas incluir el ISV aparte, donde el ISV es 16% del total, es decir, deberás calcular total + ISV, 
6imprime el resultado a dos decimales(Investigar String.format()).

Ejemplo: Si tu total es de $100.00, el total + IVA es $116.00.

*/
public class Fernandez_Esteban_Clics {
    public static void main(String[] args){
        float clic60, clic100, clic20, total, promedio,IVA, total_final;
        clic60 = (float) (60 * 0.30);
        clic100 = (float)(100 * 0.25);
        clic20 = (float)(20 * 0.80);
        total = clic100 + clic60 + clic20;
        promedio = total/180;
        IVA = (float) (total * 0.16);
        total_final = total + IVA;
        
        String promediodecimal = String.format("%.2f", promedio);
        String totaldecimal = String.format("%.2f", total_final);
        
        System.out.println("El promedio es de: " + promediodecimal);
        System.out.println("El total final es de: " +totaldecimal);
        
    }
    
}
