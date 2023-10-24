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
public class Ex15 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Escribe el primer numero: ");
        num1=imput.nextInt();
        System.out.print("Escribe el segundo numero: ");
        num2=imput.nextInt();
        System.out.print("Escribe el tercer numero: ");
        num3=imput.nextInt();
        if (num1>num2 && num1>num3) {
            System.out.println("El numero mes gran es: "+num1);
        }
        if (num2>num1 && num2>num3) {
            System.out.println("El numero mes gran es: "+num2);
        }
        if (num3>num1 && num3>num2) {
            System.out.println("El numero mes gran es: "+num3);
        }
    }
}
