/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_intro_java_2;

import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex18 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        String nombre;
        double horas, bruto, neto, tasas, salario;
        System.out.print("Introduce tu nombre: ");
        nombre = imput.nextLine();
        System.out.print("Introduce el numero de horas semanales: ");
        horas = imput.nextDouble();
        if (horas <= 0) {
            System.out.println("Horas invalidas.");
        } else {
            System.out.print("Introduce tu sueldo por hora: ");
            salario = imput.nextDouble();
            if (salario <= 0) {
                System.out.println("Salario invalido.");
            } else {
                if (horas <= 35) {
                    bruto = horas * salario;
                    if (bruto <= 500) {
                        neto = bruto;
                        tasas = 0;
                        System.out.println("Nombre: " + nombre + "\nSalario bruto: " + bruto + "€. \nTasas: " + tasas + "€. \nSalario neto: " + neto + "€.");
                    }
                    if (bruto > 500 && bruto <= 900) {
                        tasas = (bruto - 500) * 0.25;
                        neto = bruto - tasas;
                        System.out.println("Nombre: " + nombre + "\nSalario bruto: " + bruto + "€. \nTasas: " + tasas + "€. \nSalario neto: " + neto + "€.");
                    }
                    if (bruto > 900) {
                        tasas = ((bruto - 900) * 0.45) + (400 * 0.25);
                        neto = bruto - tasas;
                        System.out.println("Nombre: " + nombre + "\nSalario bruto: " + bruto + "€. \nTasas: " + tasas + "€. \nSalario neto: " + neto + "€.");
                    }
                } else {
                    bruto = (35.0 * salario) + (horas - 35.0) * (salario * 1.5);
                    if (bruto <= 500) {
                        neto = bruto;
                        tasas = 0;
                        System.out.println("Nombre: " + nombre + "\nSalario bruto: " + bruto + "€. \nTasas: " + tasas + "€. \nSalario neto: " + neto + "€.");
                    }
                    if (bruto > 500 && bruto <= 900) {
                        tasas = (bruto - 500) * 0.25;
                        neto = bruto - tasas;
                        System.out.println("Nombre: " + nombre + "\nSalario bruto: " + bruto + "€. \nTasas: " + tasas + "€. \nSalario neto: " + neto + "€.");
                    }
                    if (bruto > 900) {
                        tasas = ((bruto - 900) * 0.45) + (400 * 0.25);
                        neto = bruto - tasas;
                        System.out.println("Nombre: " + nombre + "\nSalario bruto: " + bruto + "€. \nTasas: " + tasas + "€. \nSalario neto: " + neto + "€.");
                    }
                }
            }
        }
    }
}
