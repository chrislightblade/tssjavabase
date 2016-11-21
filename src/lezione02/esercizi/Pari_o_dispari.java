/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * legge un numero in input e stampa se pari o dispari
 * @author tss
 */
public class Pari_o_dispari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String risultato = "";
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        
        //leggo il numero in input        
        int numero = s.nextInt();
        
        /*if((numero % 2) == 0)
            risultato += "hai inserito il numero " + numero + " ed è pari\n";
        
        else
          risultato += "hai inserito il numero " + numero + " ed è dispari\n";*/
        
        risultato = ((numero % 2) == 0) ? "hai inserito il numero " + numero + " ed è pari\n" : "hai inserito il numero " + numero + " ed è dispari\n";
          
        
        System.out.println(risultato);
        
    }
    
    public static void main2(String[] args) {
        
    String risultato = "";
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        
        //leggo il numero in input        
        int numero = s.nextInt();
            
        
    }
    
    
}
