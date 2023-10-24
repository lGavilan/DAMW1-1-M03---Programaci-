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
public class Ex8 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int stop, negativo, positivo, num;
        stop = 0;
        negativo = 0;
        positivo = 0;
        do {

            System.out.printf("Introduce un numero: ");
            num = imput.nextInt();
            if (num == 0) {
                stop++;
            }
            if (num < 0) {
                negativo++;
            } else if (num>0) {
                positivo++;
            }
        } while (num != 0);

        System.out.println("Has introduit " + positivo + " numeros positius i " + negativo + " numeros negatius.");
    }
}
