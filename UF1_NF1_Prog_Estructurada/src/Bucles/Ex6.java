/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex6 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int contador, num;
        boolean negativo=false;
        contador=0;
        while (contador<10) {            
            System.out.printf("Introduce un numero: ");
            num=imput.nextInt();
            contador++;
            if (num<0) {
                negativo=true;
            }
        }
        if (negativo) {
            System.out.println("Hi han hagut negatius.");
        } else {
            System.out.println("No hi han hagut negatius.");
        }
    }
}
