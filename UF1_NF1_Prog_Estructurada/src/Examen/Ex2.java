/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int num; //He posat int perque nomes demana numeros enters.
        System.out.print("Introdueix un numero enter: ");
        num = imput.nextInt();
        if (num % 4 == 0) {
            if (num % 6 == 0) {
                System.out.println("El numero es divisible entre 4 i 6.");
            } else {
                System.out.println("El numero es divisible entre 4 i no entre 6.");
            }
        } else {
            if (num % 6 == 0) {
                System.out.println("El numero es divisible entre 6 i no entre 4.");
            } else {
                System.out.println("El numero no es divisible entre 4 ni entre 6.");
            }
        }

    }
}
