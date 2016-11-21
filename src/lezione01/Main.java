/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione01;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Main {
    
    public static void main(String[] args) {
       System.out.println("ciao");
        String frase = JOptionPane.showInputDialog("inserisci la frase da stampare");
        System.out.println(frase);
        int i = (int) (Math.random()*10);
        System.out.println(i);
        
    }
}
