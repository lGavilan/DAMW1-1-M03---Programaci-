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
public class Ex10 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        double num1,num2,suma,resta,producto,division;
        System.out.print("Introduce el numero 1: ");
        num1=imput.nextDouble();
        System.out.print("Introduce el numero 2: ");
        num2=imput.nextDouble();
        suma=num1+num2;
        resta=num1-num2;
        producto=num1*num2;
        if (num2==0) {
            System.out.println("Suma: "+num1+"+"+num2+"="+suma+ "\nResta: "+num1+"-"+num2+"="+resta+"\nProducto: "+num1+"x"+num2+"="+producto+"\nDivision: Error");
        } else {
            division=num1/num2;
        System.out.println("Suma: "+num1+"+"+num2+"="+suma+ "\nResta: "+num1+"-"+num2+"="+resta+"\nProducto: "+num1+"x"+num2+"="+producto+"\nDivision: "+num1+"/"+num2+"="+division);
        }
    }
}
