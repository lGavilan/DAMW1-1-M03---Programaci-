
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Benvinguda {
    public static void main(String[] args) {
        double var1=0,var2=0,var3=0;
        double resultat;
        char caracter;
        int a=10;
        double pi = Math.PI;
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        num=reader.nextInt();
        String nom="Sergi";
        System.out.println("num="+ num);
        System.out.print("Numero PI = "+ pi);
        System.out.print("Nova linea \n");
        System.out.println("A= "+ a);
        System.out.println("A++= "+ a++);
        System.out.println("++A= "+ ++a);
        System.out.println("El meu nom és "+ nom);
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var3="+var3);
        var1=1.0;
        var2=2;
        var3=3;
        caracter='A';
        resultat=var3/var2;
        System.out.println("Valors actualitzats de les variables:");
        System.out.println("var1="+var1);
        System.out.println("var2="+var2);
        System.out.println("var3="+var3);
        caracter+=3;
        System.out.println("Caracter="+caracter);
        System.out.println("resultat=" + var3 + "/" + var2 + "=" + resultat);
        
    }
}
