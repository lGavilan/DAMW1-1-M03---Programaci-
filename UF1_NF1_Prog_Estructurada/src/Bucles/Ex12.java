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
public class Ex12 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int base, exp, cont;
        double res;
        res=1;
        System.out.print("Introduce el valor de la base: ");
        base=imput.nextInt();
        System.out.print("Introduce el valor del exponente: ");
        exp=imput.nextInt();
        if(exp<0){
        cont=-exp;
        }
        else{
        cont=exp;
        }
        while(cont!=0){
        res=res*base;
        cont--;
        }
        if(exp<0){
        res=1/res;
        }
        System.out.println("Resultado: "+res);
    }
}
