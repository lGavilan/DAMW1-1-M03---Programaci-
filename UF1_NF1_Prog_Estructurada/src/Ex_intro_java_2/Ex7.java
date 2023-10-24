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
public class Ex7 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        double millas,metros;
        System.out.print("Escribe la distancia en millas: ");
        millas=imput.nextDouble();
        metros=millas*1852;
            System.out.println("La distancia es metros es: "+metros);
    }
}
