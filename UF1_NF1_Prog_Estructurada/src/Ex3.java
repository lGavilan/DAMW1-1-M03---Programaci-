
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex3 {
    public static void main(String[] args) {
        double radi,altura,lateral,base,total,volum;
        Scanner imput = new Scanner (System.in);
        System.out.print("Introdueix el radi: ");
        radi=imput.nextDouble();
        System.out.print("Introdueix l'altura: ");
        altura=imput.nextDouble();
        if (radi>0 && altura>0) {
            lateral=2.00*Math.PI*radi*altura;
            base=Math.PI*Math.pow(radi, 2);
            total=base*2.00+lateral;
            volum=base*altura;
            System.out.println("L'area lateral es: "+lateral+"\nL'area de la base es: "+base+"\nL'area total es: "+total+"\nEl volum es: "+volum);
        } else {
            System.err.println("Dades introduides incorrectes.");
        }
    }
}
