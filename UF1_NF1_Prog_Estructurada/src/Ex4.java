
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a, b, c, res;

        System.out.print("Introduce el valor a: ");
        a = scanner.nextDouble();

        System.out.print("Introduce el valor b: ");
        b = scanner.nextDouble();

        System.out.print("Introduce el valor c: ");
        c = scanner.nextDouble();
        if (a != 0 && b != 0 && c != 0) {
            res = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Es una equación de 2º grado");
            System.out.println("Solución 1 de la ecuación de 2º "
                    + "grado es:" + res);
            res = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("Solución 2 de la ecuación de 2º "
                    + "grado es:" + res);
        } else if (a == 0 && b != 0 && c != 0) {
            System.out.println("Es una equación de 1r grado");
            res = -c / b;
            System.out.println("Solución de la ecuación de 1r "
                    + "grau es:" + res);
        } else if (a != 0 && b == 0 && c != 0) {
            res = +Math.sqrt(-c / a);
            System.out.println("Es una equación de 2º grado");
            System.out.println("Solución 1 de la ecuación de 2º "
                    + "grado es:" + res);
            res = -Math.sqrt(-c / a);
            System.out.println("Solució 2 de la ecuación de 2º "
                    + "grado es:" + res);
        } else if (a != 0 && b != 0 && c == 0) {
            res = 0;
            System.out.println("Es una equación de 2º grau");
            System.out.println("Solución 1 de la ecuación de 2º "
                    + "grado es:" + res);
            res = -b / a;
            System.out.println("Solución 1 de la ecuación de 2º "
                    + "grado es:" + res);
        } else {
            System.err.println(
                    "No se puede realizar el calculo con tan pocos datos");
        }

    }
}


        
   

