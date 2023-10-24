
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xaga4500
 */
public class Ex9 {
    public static void main(String[] args) {
        Random aleatori=new Random();
        Scanner imput=new Scanner(System.in);
        int secret=aleatori.nextInt(1, 100);
        System.out.println("El numero secret es: "+secret);
        int intents=0, max_intents=10, num;
        do {    
            intents++;
            System.out.print("Introdueix un numero: ");
            num=imput.nextInt();
            if(num>secret){
                System.out.println("El numero secret es mes petit.");
            }
            else if(num<secret){
                System.out.println("El numero secret es mes gran.");
            }
            else{
                System.out.println("Enhorabona el numero introduit es igual al numero secret, l'has endivinat amb "+intents+" intents.");
            }
            
        } while (num!=secret && intents!=max_intents && num>0);
        if(intents==max_intents){
            System.out.println("Has fet el maxim d'intents, has perdut!");
            }
        if(num<0){
            System.out.println("Has finalitzat el programa voluntariament.");
        }
        
    }
}
