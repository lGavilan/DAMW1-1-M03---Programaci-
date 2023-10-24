
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex8 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int a,b,a_original,b_original;
        int mcd=0;
        System.out.print("Introdueix 1r numero: ");
        a=imput.nextInt();
        a_original=a;
        System.out.print("Introdueix 2n numero: ");
        b=imput.nextInt();
        b_original=b;
        if (a>b || b>a) {
            if (a<b) {
                int ext;
                ext=a;
                a=b;
                b=ext;
            } 
            do {                
                if(a%b==0){
                    mcd=b;
                    System.out.println("El mcd entre "+a_original+" i "+b_original+" es: "+mcd);
                }
                else{
                    int new_valor=b;
                b=a-(a/b)*b;
                a=new_valor;
                }
            } while (mcd==0);
            int mcm=(a_original*b_original)/mcd;
            System.out.println("El mcm entre "+a_original+" i "+b_original+" es: "+mcm);
           
        } else {
            System.out.println("Els dos numeros son iguals. No es pot calcular el mcd.");
        }
    }
}
