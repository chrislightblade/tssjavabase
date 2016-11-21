package lezione02.esercizi;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tss
 */
public class pari_o_dispari_con_funz_esterna {
    
    public static void main(String[] args) {
        
        String risultato = "";
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        
        //leggo il numero in input        
        int numero = s.nextInt();
        
        if(divisibilePerDue(numero))
            risultato += "hai inserito il numero " + numero + " ed è pari\n";
        
        else
          risultato += "hai inserito il numero " + numero + " ed è dispari\n";
        
        System.out.println(risultato);
       
    }
    
    /**
     * 
     * ritornare vero se il numero è divisibile per due
     * 
     * @param numero
     * @return 
     */

    private static boolean divisibilePerDue(int numero) {
        
        return (numero % 2) == 0;//si pone da solo l'if e ritorna true o false, cioè quello che fa la funzione if nel main principale
        }
    
}
