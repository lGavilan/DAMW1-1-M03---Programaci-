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
public class Ex5 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int num,fact;
        System.out.println("Introduce un numero: ");
        num=imput.nextInt();
        fact=1;
        if(num<0){
            System.out.println("No se puede calcular factorial de un numero negativo.");
        }
        else{
            for (int i = num; i >= 1; i--) {
                fact*=i;
            }
            System.out.println("Factorial: "+fact);
        }
    }
}
