/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex_intro_java_2;

import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex17 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int horas,minutos,segundos;
        System.out.print("Escribe la hora en: \nHoras: ");
        horas=imput.nextInt();
        if (horas<0 || horas>=24) {
            System.out.println("Hora introducida invalida.");
        } else {
        System.out.print("Minutos: ");
        minutos=imput.nextInt();
        if (minutos<0 || minutos>=60) {
            System.out.println("Miunutos introducidos invalidos.");
        } else {
        System.out.print("Segundos: ");
        segundos=imput.nextInt();
        if (segundos<0 || segundos>=60) {
            System.out.println("Segundos introducidos invalidos.");
        } else {
            if(horas==23 && minutos==59 && segundos==59){
            horas=00;
            minutos=00;
            segundos=00;
                System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
            }
            else{
            if(horas!=23 && minutos==59 && segundos==59){
            horas++;
            minutos=00;
            segundos=00;
                System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
            }
            else{
            if(horas!=23 && minutos!=59 && segundos==59){
            minutos++;
            segundos=00;
                System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
            }
            else{
            if(horas!=23 && minutos!=59 && segundos!=59){
            segundos++;
                System.out.println("Horas: "+horas+"\nMinutos: "+minutos+"\nSegundos: "+segundos);
            }
            }
            }
            }
        }
        }
        }
    }
}
