/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author xaga4500
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        int parells=0,imparells=0;
        int cont=101;
        do {            
            if (cont%2==0) {
                parells+=cont;
            } else {
                imparells+=cont;
        } cont++;
        }    while (cont<200);
        System.out.printf("Numeros compresos entre 100 i 200\n");
        System.out.printf("La suma dels imparells es %d\n", imparells);
        System.out.printf("La suma del parells es %d\n", parells);
        
        /*bucle amb while
        while (cont<200) {            
            if (cont%2==0) {
                parells+=cont;
            } else {
                imparells+=cont;
            }
            cont++;
        System.out.printf("Numeros compresos entre 100 i 200\n");
        System.out.printf("La suma dels imparells es %d\n", imparells);
        System.out.printf("La suma del parells es %d\n", parells);
        } */
    }
}
