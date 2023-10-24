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
public class Ex16 {
    public static void main(String[] args) {
       Scanner imput=new Scanner(System.in);
        double nota;
        System.out.print("Introduce la nota: ");
        nota=imput.nextDouble();
        if (nota<0 || nota>10) {
            System.out.println("Nota introucida invalida.");
        } else {
            if (nota>=0 && nota<3) {
                System.out.println("Muy deficiente.");
            }
            if (nota>=3 && nota<5) {
                System.out.println("Insuficiente.");
            }
            if (nota>=5 && nota<6) {
                System.out.println("Bien.");
            }
            if (nota>=6 && nota<9) {
                System.out.println("Notable.");
            }
            if (nota>=9 && nota<=10) {
                System.out.println("Sobresaliente.");
            }
        }
    }
    }
       

