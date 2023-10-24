/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex13 {
    public static void main(String[] args) {
        Random aleatori=new Random();
        Scanner imput=new Scanner(System.in);
        int num, fin, pista, minimo, maximo;
        fin=0;
        minimo=1;
        maximo=101;
        num=0;
        while (fin==0){
        num=aleatori.nextInt(minimo,maximo);
        System.out.println("Numero aleatori: "+num);
            do {                
               System.out.println("El numero es: \n1-Mes gran.\n2-Igual.\n3-Mes petit. ");
        pista=imput.nextInt();
        if(pista==2){
        fin++;
        }
        if(pista==1){
        minimo=num+1;
        }
        if(pista==3){
        maximo=num;
        }
        if(pista!=1 && pista!=2 && pista!=3){
            System.out.println("Opcion incorrecta!");
        }  
            } while (pista!=1 && pista!=2 && pista!=3);
       
        }
        System.out.println("Numero adivinado: "+num);
        
    }
}
