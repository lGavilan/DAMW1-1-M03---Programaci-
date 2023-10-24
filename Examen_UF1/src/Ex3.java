/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author xaga4500
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int adults, juniors, seniors, disc, entrades, preua, preuj, preus, preud, imp, contador;//Els diferents preus he posat "preu" seguit de la inicial del qui li correspon, per exemple: "preua" es preu adults. "Imp" es el l'import sense el descompte.
        //He posat el int "contador" per anar comptant les entrades que regalen cada 25 entrades.
        double descompte, preu; //"Preu" es l'import final amb el descompte.
        System.out.println("Nombre d'adults: ");
        adults = imput.nextInt();
        System.out.println("Nombre de juniors: ");
        juniors = imput.nextInt();
        System.out.println("Nombre de seniors: ");
        seniors = imput.nextInt();
        System.out.println("Nombre de persones amb discapacitat: ");
        disc = imput.nextInt();
        entrades = adults + juniors + seniors + disc;
        preua = adults * 40;
        preuj = juniors * 35;
        preus = seniors * 35;
        preud = disc * 29;
        imp = preua + preuj + preus + preud;
        contador = 0;
        if (entrades < 10) {
            System.out.println("Nombre d'adults: " + adults + " adults / Preu: " + preua + "€. \nNombre de juniors: " + juniors + " juniors / Preu: " + preuj + "€. \nNombre de seniors: " + seniors + " seniors / Preu: " + preus + "€. \nNombre de persones amb discapacitat: " + disc + " persones amb discapacitat / Preu: " + preud + "€.");
            System.out.println("Nombre total d'entrades: " + entrades + ".");
            System.out.println("PREU TOTAL: " + imp + "€.");
        } else {
            if (entrades >= 10 && entrades < 25) {
                descompte = imp * 0.20;
                preu = imp - descompte;
                System.out.println("Nombre d'adults: " + adults + " adults / Preu: " + preua + "€. \nNombre de juniors: " + juniors + " juniors / Preu: " + preuj + "€. \nNombre de seniors: " + seniors + " seniors / Preu: " + preus + "€. \nNombre de persones amb discapacitat: " + disc + " persones amb discapacitat / Preu: " + preud + "€.");
                System.out.println("Nombre total d'entrades: " + entrades + ".");
                System.out.println("Com sou mes de 10 persones, s'ha aplicat el descompte del 20% que es de: " + descompte + "€. \nPREU TOTAL: " + preu + "€.");
            } else {
                while (entrades >= 25) {
                    if (adults > 0) {
                        adults = adults - 1;

                    }
                    if (adults == 0 && juniors > 0) {
                        juniors = juniors - 1;

                    }
                    if (adults == 0 && juniors == 0 && seniors > 1) {
                        seniors = seniors - 1;

                    }
                    if (adults == 0 && juniors == 0 && seniors == 0 && disc > 0) {
                        disc = disc - 1;

                    }
                    contador = contador + 1;
                    entrades = entrades - 25;
                }
                entrades = adults + juniors + seniors + disc;
                preua = adults * 40;
                preuj = juniors * 35;
                preus = seniors * 35;
                preud = disc * 29;
                imp = preua + preuj + preus + preud;
                System.out.println("Cada 25 persones regalem 1 entrada del preu mes alt! Descompte: " + contador + " entrada/es.");
                descompte = imp * 0.20;
                preu = imp - descompte;
                System.out.println("Nombre d'adults: " + adults + " adults / Preu: " + preua + "€. \nNombre de juniors: " + juniors + " juniors / Preu: " + preuj + "€. \nNombre de seniors: " + seniors + " seniors / Preu: " + preus + "€. \nNombre de persones amb discapacitat: " + disc + " persones amb discapacitat / Preu: " + preud + "€.");
                System.out.println("Nombre total d'entrades: " + entrades + ".");
                System.out.println("Com sou mes de 10 persones, s'ha aplicat el descompte del 20% que es de: " + descompte + "€. \nPREU TOTAL: " + preu + "€.");
            }
        }
    }
}
