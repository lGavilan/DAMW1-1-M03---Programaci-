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
public class Ex4 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int cont=1,num;
        System.out.print("Introduce un numero maximo: ");
        num=imput.nextInt();
        while (cont<=num) {            
            System.out.print("\n"+cont);
            cont++;
        }
    }
}
