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
public class Bicycle {
    
    private int speed; 
    private int gear;
    //creo un contatore di istanze (oggetti) create/i
    private static int numeroIstanze;
    
    static { //viene lancia solo la prima volta che viene richiamato questo oggetto
        numeroIstanze = 0;
        
    }

    public Bicycle() {
        //speed = 1;
        //gear = 1;
        this(1, 1);
    }
    
    public Bicycle(int speed) {
        //this.speed = speed;
        //gear = 1;
        this(speed, 1);// richiama il costruttore più generale, cioè quello sotto, per non replicare inutilmente codice
    }    
    
    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        this.numeroIstanze++;//anche se in genere non si fa perchè è rindondante, sovrabbondante.
    }

    public static int getNumeroIstanze() {
        return numeroIstanze;
    }
    
    public int getSpeed() {
        return speed;
    }    
    
    public int getGear() {
        return gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
}
