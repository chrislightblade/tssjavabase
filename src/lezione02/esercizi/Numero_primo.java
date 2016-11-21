/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione02.esercizi;

import java.util.Scanner;

/**
 * esercizio che verifica se un numero è primo o no
 * @author tss
 */
public class Numero_primo {
    
    public static void main(String[] args) {
        
        int control = 0;
        String risultato = "";
        
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");

        //leggo il numero in input        
        int numero = s.nextInt();
        
        for(int i = 1; i <= numero; i++){
        
        if((numero % i) == 0)
            control++;
        
        }
        
        if(control == 2 || numero == 1)
            risultato += numero + " è un numero primo";
        
        else 
            risultato += numero + " non è un numero primo";
        
        System.out.println(risultato);
    } //while(control <= 2) ==> sistema economico, poiche se contatore supera 2 allora il numero non è primo e non serve continuare a verificare.
}
