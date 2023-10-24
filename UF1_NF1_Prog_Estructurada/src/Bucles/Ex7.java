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
public class Ex7 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int contador,negativo, positivo, num;
        contador=0;
        negativo=0;
        positivo=0;
        while (contador<10) {            
            System.out.printf("Introduce un numero: ");
            num=imput.nextInt();
            contador++;
            if (num<0) {
                negativo++;
            }
            else{
                positivo++;
            }
        }
        System.out.println("Has introduit "+positivo+" numeros positius i "+negativo+" numeros negatius.");
    }
}
