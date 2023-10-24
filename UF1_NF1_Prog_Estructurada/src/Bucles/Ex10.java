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
public class Ex10 {
    public static void main(String[] args) {
        Scanner imput=new Scanner (System.in);
        double num;
        int cont;
        cont=0;
        System.out.println("Introduce nota: ");
        num=imput.nextDouble();
        if (num==10){
            cont++;
            }
        while (num!=-1) {            
            System.out.println("Introduce nota: ");
            num=imput.nextDouble();
            if (num==10){
            cont++;
            }
            
        }
        if (cont==0){
            System.out.println("No hi ha hagut cap 10.");
        }else{
                    System.out.println("Hi han hagut "+cont+" 10.");
                    }    
        
        
        
        
    }
}
