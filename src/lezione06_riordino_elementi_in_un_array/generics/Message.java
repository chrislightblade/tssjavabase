/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.generics;

/**
 *
 * @author tss
 */
public class Message {
    
    private String messaggio;

    public Message(String messaggio) {
        this.messaggio = messaggio;
    }    
    
    @Override 
    public String toString(){
        return "messaggio{" + "testo = " + messaggio + "}";
        
    }
    
}
