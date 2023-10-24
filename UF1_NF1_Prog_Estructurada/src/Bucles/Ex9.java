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
public class Ex9 {
    public static void main(String[] args) {
        int cont=0,suma=0,producto=1;
        while (cont<10) {
            cont++;
            suma=suma+cont;
            producto=producto*cont;
        }
        System.out.println("Suma: "+suma+"\nProducte: "+producto);
    }
}
