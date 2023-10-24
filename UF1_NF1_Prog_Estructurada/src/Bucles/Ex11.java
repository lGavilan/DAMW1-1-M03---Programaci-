/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author xaga4500
 */
public class Ex11 {
    public static void main(String[] args) {
        int num, par, impar;
        num=100;
        par=0;
        impar=0;
        while (num!=199) {            
            num++;
            if (num%2==0){
            par=num+par;
            }
            else{
            impar=num+impar;
            }
        }
        System.out.println("Par: "+par+"\nImpar: "+impar);
    }
}
