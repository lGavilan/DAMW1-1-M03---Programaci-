
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex1 {
    public static void main(String[] args) {
        double celcius,fahrenheit;
        Scanner imput = new Scanner(System.in);
        System.out.print("Introdueix la temperatura en graus celcius: ");
        celcius=imput.nextDouble();
        if (celcius>=0 && celcius<=100) {
            fahrenheit=(9.0/5.0)*celcius+32;
            System.out.println(celcius+" Celcius = "+fahrenheit+" Fahrenheit");
        } else {
            System.err.println("Dades introduides incorrectes.");
        }
    }
}
