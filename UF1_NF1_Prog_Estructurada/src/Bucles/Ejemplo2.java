/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author xaga4500
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        int parells=0, imparells=0;
        for (int i = 101; i < 200; i++) {
            if (i%2==0) {
                parells+=i;
            } else {
                imparells+=i;
            }
            
        }
        System.out.printf("Numeros compresos entre 100 i 200\n");
        System.out.printf("La suma dels imparells es %d\n", imparells);
        System.out.printf("La suma del parells es %d\n", parells);
    }
}
