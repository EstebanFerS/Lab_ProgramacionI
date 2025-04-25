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

public class Fernandez_Esteban_Formulas {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio A");
        System.out.println("Numerador 1:");
        float numerador1a = scanner.nextFloat();
        System.out.println("Denominador 1:");
        float denominador1a = scanner.nextFloat();
        System.out.println("Numerador 2:");
        float numerador2a = scanner.nextFloat();
        System.out.println("Denominador 2:");
        float denominador2a = scanner.nextFloat();
        float totala = (numerador1a/denominador1a)+(numerador2a/denominador2a);
        System.out.println("El total es: "+totala);
        
        System.out.println("Ejercico B");
        System.out.println("Numerador 1: ");
        float numerador1b = scanner.nextFloat();
        System.out.println("Valor de X en el denominador: ");
        float denominadorx = scanner.nextFloat();
        System.out.println("Denominador que resta a X:");
        float denominador1b = scanner.nextFloat();
        System.out.println("Numerador 2:");
        float numerador2b = scanner.nextFloat();
        System.out.println("Ingrese el valor de Y en el numerador");
        float numeradoryb = scanner.nextFloat();
        System.out.println("Ingrese el valor de X en el numerador");
        float numeradorxb = scanner.nextFloat();
        System.out.println("Denominador 2:");
        float denominador2b = scanner.nextFloat();
        float totalb=(numerador1b/(denominadorx-denominador1b))-(numerador2b*numeradorxb*numeradoryb);
        
        System.out.println("El resultado es: "+ totalb);
        
        System.out.println("Ejercicio C");
        System.out.println("Numerador 1:");
        float numerador1c = scanner.nextFloat();
        System.out.println("Denominador 1:");
        float denominador1c = scanner.nextFloat();
        System.out.println("Numero que Suma");
        float numeroc = scanner.nextFloat();
        float totalc = (numerador1c/denominador1c)+numeroc;
        System.out.println("El total es: "+ totalc);
        
        System.out.println("Ejercicio D");
        System.out.println("Numero 1:");
        float numerod = scanner.nextFloat();
        System.out.println("Numerador 2:");
        float numerador2d = scanner.nextFloat();
        System.out.println("Denominador 2:");
        float denominador2d = scanner.nextFloat();
        float totald = numerod + (numerador2d/denominador2d);
        System.out.println("El total es: "+totald);
        
        System.out.println("Ejercicio E");
        System.out.println("Ingrese el valor de a en el numerador");
        float numerador1e = scanner.nextFloat();
        System.out.println("Ingrese el valor de b en el denominador");
        float denominador1de = scanner.nextFloat();
        System.out.println("Ingrese el valor de c en el denominador que resta c");
        float denominador1ce = scanner.nextFloat();
        System.out.println("Ingrese el valor de d en el numerador");
        float numerador2de = scanner.nextFloat();
        System.out.println("Ingrese el valor de e que resta a d");
        float numerador2ee = scanner.nextFloat();
        System.out.println("Ingrese el valor de f en el denominador");
        float numerofe = scanner.nextFloat();
        System.out.println("Ingrese el valor de G");
        float numeradorGdenominador = scanner.nextFloat();
        System.out.println("Ingrese el valor de H");
        float numeradorHdenonimador = scanner.nextFloat();
        System.out.println("Ingrese el valor de J");
        float denominadorJdenominador = scanner.nextFloat();
        float totale = (numerador1e*numerador1e)/(denominador1de-denominador1ce)+(numerador2de-numerador2ee)/(numerofe-numeradorGdenominador*numeradorHdenonimador/denominadorJdenominador);
        System.out.println("EL total es: "+totale);
        
        System.out.println("Ejercicio F");
        System.out.println("Ingrese el numerador M");
        float numeradorMf = scanner.nextFloat();
        System.out.println("Ingrese el denominador n");
        float denominadorNf = scanner.nextFloat();
        System.out.println("Ingrese el numero P");
        float numeroP = scanner.nextFloat();
        float totalf = (numeradorMf/denominadorNf)+numeroP;
        System.out.println("El total es: " + totalf);
        
        System.out.println("Ejercico G");
        System.out.println("Ingrese el valor de M");
        float numeroMg = scanner.nextFloat();
        System.out.println("Ingrese el valor de N en el numerador");
        float numeradorNg = scanner.nextFloat();
        System.out.println("Ingrese el valor de P en el denominador");
        float denominadorPg = scanner.nextFloat();
        System.out.println("Ingrese el valor de Q que resta a P en el denominador");
        float denomuinadorQg = scanner.nextFloat();
        float totalg = numeroMg +(numeradorNg-(denominadorPg-denomuinadorQg));
        System.out.println("El total es de: " + totalg);
        
    }
    
}
