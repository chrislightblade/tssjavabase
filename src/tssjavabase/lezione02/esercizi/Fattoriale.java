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
public class Fattoriale {
    
    public static void main(String[] args) {
        
        int fattoriale = 1;
        String risultato = "";
        
        //crea oggetto scanner per leggere input
        Scanner s = new Scanner(System.in);
        System.out.println("inserisci un numero: ");

        //leggo il numero in input        
        int numero = s.nextInt();
        
        Scanner r = new Scanner(System.in);
        System.out.println("inserisci un numero: ");
        int valore = r.nextInt();
        
        switch (valore){
            case 1:
        
        for(int i = 1; i <= numero; i++){
            fattoriale += fattoriale * (numero - i);
            
        }
        System.out.println("hai usato il metodo di Luca\n");
        System.out.println(fattoriale);
        break;
        
            case 2:
        
        for(int i = 2; i <= numero; i++){
            fattoriale = fattoriale * i; 
                        
        }
        System.out.println("hai usato il metodo di Fabio\n");
        System.out.println(fattoriale);
    }
    
}
}
