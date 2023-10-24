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
public class Ex12 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int num;
        System.out.print("Intoduce un numero: ");
        num=imput.nextInt();
        if (num>=0) {
            System.out.println("El numero es positivo.");
        } else {
            System.out.println("El numero es negativo.");
        }
               
    }
}
