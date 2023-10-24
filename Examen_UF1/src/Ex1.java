/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int any, mes, dia; //He posat int perque ni els anys ni els mesos ni els dies poden ser decimals.
        System.out.print("Introdueix un any: ");
        any = imput.nextInt();
        if (any < 1900) {
            System.out.println("L'any introduit no es correcte.");
        } else {
            System.out.print("Introdueix un mes: ");
            mes = imput.nextInt();
            if (mes <= 0 || mes > 12) {
                System.out.println("El mes introduit no es correcte.");
            } else {
                System.out.print("Introdueix un dia: "); //He suposat que el mes de Febrer te 28 dies, i el mes de Maig i Octubre tenen 30 dies. Tots els altres mesos tenen 31 dies.
                dia = imput.nextInt();

                if (mes == 2 && dia >=29 && dia<=31) {
                    System.out.println("El mes de Febrer nomes te 28 dies! Data introduida incorrecte.");
                }
                else{
                if (mes == 5 && dia == 31) {
                    System.out.println("El mes de Maig nomes te 30 dies! Data introduida incorrecte.");
                }
                else{
                if (mes == 10 && dia == 31) {
                    System.out.println("El mes de Octubre nomes te 30 dies! Data introduida incorrecte.");
                } else {
                    if(dia>31 || dia<=0){
                        System.out.println("El dia introduit es incorrecte.");
                    }
                    else{System.out.println("La data introduida es: " + dia + "/" + mes + "/" + any);}
                    
                }
                }
                
                }
                
            }

        }

    }
}
