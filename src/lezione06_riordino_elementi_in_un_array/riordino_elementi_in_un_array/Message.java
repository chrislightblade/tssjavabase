/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.riordino_elementi_in_un_array;


import java.util.Objects;

/**
 *
 * @author tss
 */
public class Message implements Comparable<Message>{
    
    private String messaggio;

    public Message(String messaggio) {
        this.messaggio = messaggio;
    }    

    public String getMessaggio() {
        return messaggio;
    }   
    
    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.messaggio, other.messaggio)) {
            return false;
        }       
        return true;
    }
    
    @Override 
    public String toString(){
        return "messaggio{" + "testo = " + messaggio + "}";
         }
    
    @Override
    public int compareTo(Message o) {
        return this.messaggio.compareTo(o.getMessaggio());
    }
}
