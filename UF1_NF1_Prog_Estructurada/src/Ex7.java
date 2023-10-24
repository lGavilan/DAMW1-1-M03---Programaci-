
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex7 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.print("Introduce tu DNI: ");
        int numero = imput.nextInt();
        int nif = numero % 23;
        if (numero > 99999999 || numero < 10000000) {

            System.out.println("Numero introducido incorrecto");

        } else {
            if (nif == 0) {
                System.out.println("Tu NIF es " + numero + "T");

            }
            if (nif == 1) {
                System.out.println("Tu NIF es " + numero + "R");

            }
            if (nif == 2) {
                System.out.println("Tu NIF es " + numero + "W");

            }
            if (nif == 3) {
                System.out.println("Tu NIF es " + numero + "A");

            }
            if (nif == 4) {
                System.out.println("Tu NIF es " + numero + "G");

            }
            if (nif == 5) {
                System.out.println("Tu NIF es " + numero + "M");

            }
            if (nif == 6) {
                System.out.println("Tu NIF es " + numero + "Y");

            }
            if (nif == 7) {
                System.out.println("Tu NIF es " + numero + "F");

            }
            if (nif == 8) {
                System.out.println("Tu NIF es " + numero + "P");

            }
            if (nif == 9) {
                System.out.println("Tu NIF es " + numero + "D");

            }
            if (nif == 10) {
                System.out.println("Tu NIF es " + numero + "X");

            }
            if (nif == 11) {
                System.out.println("Tu NIF es " + numero + "B");

            }
            if (nif == 12) {
                System.out.println("Tu NIF es " + numero + "N");

            }
            if (nif == 13) {
                System.out.println("Tu NIF es " + numero + "J");

            }
            if (nif == 14) {
                System.out.println("Tu NIF es " + numero + "Z");

            }
            if (nif == 15) {
                System.out.println("Tu NIF es " + numero + "S");

            }
            if (nif == 16) {
                System.out.println("Tu NIF es " + numero + "Q");

            }
            if (nif == 17) {
                System.out.println("Tu NIF es " + numero + "TV");

            }
            if (nif == 18) {
                System.out.println("Tu NIF es " + numero + "H");

            }
            if (nif == 19) {
                System.out.println("Tu NIF es " + numero + "L");

            }
            if (nif == 20) {
                System.out.println("Tu NIF es " + numero + "C");

            }
            if (nif == 21) {
                System.out.println("Tu NIF es " + numero + "K");

            }
            if (nif == 22) {
                System.out.println("Tu NIF es " + numero + "E");

            }
        }
    }

}
