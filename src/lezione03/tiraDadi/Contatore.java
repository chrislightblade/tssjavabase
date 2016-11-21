/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.tiraDadi;

/**
 *
 * @author tss
 */
public class Contatore {
    private int valore;
    private int start;
    private int passo;
    
    public Contatore(int valoreIniziale, int step){
        valore = valoreIniziale;
        passo = step;
    }
    
    public void conta(){
        valore += passo;    
    }
    
    public int stampa(){
        return valore;
    }
}
