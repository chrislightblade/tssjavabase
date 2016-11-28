/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione04;

/**
 *
 * @author tss
 */
public class Matematica {
    
    //se non voglio che vengano costruite istanze Matematica, metto il costruttore in private;
    
    public static final double PI_COSTANTE = 3.14;
    
    private Matematica(){}
    
    public long somma (int... numeri){
    
        long risultato = 0;
        
        for (int i = 0; i < numeri.length; i++){            
            risultato += numeri[i];
        }
        
        return risultato;
    }
    
    /*public long somma (int[] numeri){//uguale a quello sopra
    
        
    }*/
    
}
