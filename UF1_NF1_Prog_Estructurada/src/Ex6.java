
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int decimal, residu, quocient;
        String hexadecimal="";
        System.out.print("Introduce el valor decimal a convertir en hexadecimal: ");
        decimal = imput.nextInt();
        do {
            residu = decimal % 16;
            quocient = decimal / 16;
            if (residu <= 0) {
                hexadecimal = String.valueOf(residu)+hexadecimal;
            } else if (residu == 10) {
                hexadecimal = "A"+hexadecimal;
            } else if (residu == 11) {
                hexadecimal = "B"+hexadecimal;
            } else if (residu == 12) {
                hexadecimal = "C"+hexadecimal;
            } else if (residu == 13) {
                hexadecimal = "D"+hexadecimal;
            } else if (residu == 14) {
                hexadecimal = "E"+hexadecimal;
            } else if (residu == 15) {
                hexadecimal = "F"+hexadecimal;
            } else {
                System.out.println("Error.");
            }
            decimal=quocient;
        }while (quocient >= 16);
        System.out.println("Num decima "+decimal+"equival");
            }
        }
    
    
