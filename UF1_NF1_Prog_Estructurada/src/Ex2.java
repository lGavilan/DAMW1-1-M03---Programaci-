
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex2 {
    public static void main(String[] args) {
        double radi,area,volum;
        Scanner imput = new Scanner (System.in);
        System.out.print("Introdueix el radi: ");
        radi=imput.nextDouble();
        if (radi>0) {
            area=4.0*Math.PI*Math.pow(radi, 2);
            volum=(4.0/3.0)*Math.PI*Math.pow(radi, 3);
            System.out.println("El area es: "+area+"\nEl volum es: "+volum);
        } else {
            System.err.println("Radi no valid");
        }
        
    }
}
