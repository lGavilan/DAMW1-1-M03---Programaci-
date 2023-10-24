
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Exerc_intro_java {
    public static void main(String[] args) {
        int x, y, z, t;
        Scanner lector = new Scanner(System.in);
        System.out.print("x: ");
        x = lector.nextInt();
        System.out.print("y: ");
        y = lector.nextInt();
        System.out.print("z: ");
        z = lector.nextInt();
        if ((x == 1) && ((y < 10) || (z == 4))) {
            t = 0;
        } else {
            t = 100;
            if ((x != 2) && !((y == 4) && (z == 5))) {
                t = 50;
            }
        }
        System.out.format("x=%d, y=%d, z=%d, t=%d\n", x, y, z, t);
        } 
        
    }
    
