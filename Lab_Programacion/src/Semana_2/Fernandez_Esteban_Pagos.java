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
En algunas oficinas del gobierno pagan horas extra a los burócratas, además del salario
correspondiente. Escribe un programa que permita calcular la cantidad a pagar a un trabajador
tomando en cuenta las horas trabajadas del empleado y si el empleado ha hecho horas extra
trabajadas. Las horas extra se calculan, en función de la información de las 4 categorías. Cada
trabajador puede tener como máximo 40 horas normales con el pago de $35.99 por hora, si tienen
más horas es considerado como extras, sólo se les pagarán las primeras 15 horas extras
dependiendo de la categoría seleccionada. Los trabajadores con categoría a 4 no pueden recibir
este beneficio.

Se necesita ingresar la información del empleado tales como el código, nombre, apellido, cantidad
de horas del trabajador y categoría (Mostrar información de categoría), en donde, luego se necesita
imprimir la salida en pantalla. (Usar Switch).
Información de Categorías

Categoría 1 - $40 por hora extra
Categoría 2 - $50 por hora extra
Categoría 3 - $85 por hora extra.
Categoría 4 - $0
 */
public class Fernandez_Esteban_Pagos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        String nombre, apellido, codigo;
        int horas, horasNormales = 0, horasExtra = 0, categoria;
        double saldo = 0, pago = 0, pagoExtra = 0, total = 0;

        System.out.print("Ingrese el codigo del empleado: ");
        codigo = scanner.next();
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.next();
        System.out.print("Ingrese el apellido del empleado: ");
        apellido = scanner.next();
        System.out.println("Ingrese las horas trabajadas: ");
        horas = scanner.nextInt();

        System.out.println("Seleccione la categoria del empleado:");
        System.out.println("Categoría 1");
        System.out.println("Categoría 2");
        System.out.println("Categoría 3");
        System.out.println("Categoría 4");
        categoria = scanner.nextInt();

        if (horas > 40) {
            horasNormales = 40;
            horasExtra = horas - 40;
            if (horasExtra > 15) {
                horasExtra = 15;
            }
        } else {
            horasNormales = horas;
        }

        switch (categoria) {
            case 1:
                if (horasExtra > 15) {
                    pagoExtra = 15 * 40;

                } else {
                    pagoExtra = horasExtra * 40;
                }
                break;
            case 2:
                if (horasExtra > 15) {
                    pagoExtra = 15 * 50;
                } else {
                    pagoExtra = horasExtra * 50;
                }
                break;
            case 3:
                if (horasExtra > 15) {
                    pagoExtra = 15 * 85;
                } else {
                    pagoExtra = horasExtra * 85;
                }
                break;
            case 4:
                pagoExtra = 0;
            default:
                System.out.println("Categoria no valida");
        }

        total = (horasNormales * 35.99) + pagoExtra;

        System.out.println("El codigo del empleado: " + codigo);
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Apellido del empleado: " + apellido);
        System.out.println("Horas Trabajadas: " + horasNormales);
        System.out.println("El pago es de: " + String.format("\n", total));

    }
}
