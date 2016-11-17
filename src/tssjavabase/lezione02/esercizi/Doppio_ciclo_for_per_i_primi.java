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
public class Doppio_ciclo_for_per_i_primi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        
        String risultato = "";
        int i = 0;
        int contatore = 0;
        
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");

        //leggo il numero in input        
        int numero = s.nextInt();
        
        for(int j = 0; j <= numero; j++){
            int control = 0;
            
        for(i = 1; i <= j; i++){        
        if((j % i) == 0)
            control++;
        
        }
        
        if(control == 2 || j == 1){
           risultato += j + "\n";
           contatore++;
        }
    }
        
        System.out.println(risultato + "\nhai ottenuto " + contatore + " numeri primi.");
    }
    
   
    
}
