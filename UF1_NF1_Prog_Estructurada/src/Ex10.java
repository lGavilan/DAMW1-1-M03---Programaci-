
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        double nota;
        System.out.print("Introdueix una nota: ");
        nota=imput.nextDouble();
        if(nota>=0 && nota<=10){
            if (nota>=0 && nota<5) {
                System.out.println("Insuficient.");
            }
            if (nota>=5 && nota<6) {
                System.out.println("Suficient.");
            }
            if (nota>=6 && nota<7) {
                System.out.println("Be.");
            }
            if (nota>=7 && nota<9) {
                System.out.println("Notable.");
            }
            if (nota>=9 && nota<=10) {
                System.out.println("Excel·lent.");                
            }
        }
        else{
            System.out.println("Nota introduida invalida.");
        }
    }
}
