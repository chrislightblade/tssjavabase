/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.riordino_elementi_in_un_array;

/**
 *
 * @author tss
 */
public class DemoOrdinamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comparable<Persona> p = new Persona("Mario", "Rossi");
        
        Persona p1 = new Persona("Mario", "Mario");
        Persona p2 = new Persona("Mario", "Wario");
        
        System.out.println(p1.compareTo(p2));
    }
    
}
