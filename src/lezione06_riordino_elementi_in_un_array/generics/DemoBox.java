/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tss
 */
public class DemoBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Box<Persona> box = new Box<>(new Persona("Mario", "Mario"));
        Box<Message> box1 = new Box<>(new Message("Ciaone"));
        if(box.getObject() instanceof Persona){
            Persona object = (Persona) box.getObject();
            object.setCognome("Marione");
            System.out.println(object);
        }
        //
        
        Message object = box1.getObject();//scivendo box1.getObject() e poi facendo alt+invio  <------- casting
        
        List<Persona> persone = new ArrayList<Persona>();
        
        System.out.println(box1);
        //System.out.println(box);//ho 2 puntatori, uno box e l'altro object, solo che box non da accesso ai metodi di Persona e invece object si;
    }
    
}
