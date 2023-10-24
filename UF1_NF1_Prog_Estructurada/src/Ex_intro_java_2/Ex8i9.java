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
public class Ex8i9 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int edad;
        System.out.print("Introduce tu edad: ");
        edad=imput.nextInt();
        if (edad>0) {
            if (edad>=18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad.");
            }
        } else {
            System.out.println("La edad introducida es invalida.");
        }
    }
}
