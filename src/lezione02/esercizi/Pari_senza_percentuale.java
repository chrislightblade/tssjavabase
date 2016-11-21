/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Pari_senza_percentuale {

    public static void main(String[] args) {
        
        int control = 0;
        String risultato = "";
        
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");

        //leggo il numero in input        
        int numero = s.nextInt();
        
        while(control < numero){        
        
        control += 2;
        if(control == numero)
            risultato += "il numero " + numero + " è pari";                      
        
        }//ciclo while
        
        if(control > numero)
            risultato += "il numero " + numero + " è dispari";
        
        /*oppure metto in while solo il ciclo che aumenta di 2 in relazione alla condizione del while, e una volta uscito dal while esegue gli if oppure
        risultato = (control == numero) ? "il numero " + numero + " è pari" : "il numero " + numero + " è dispari";*/
        
        System.out.println(risultato);

    }
}
