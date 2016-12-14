/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.riordino_elementi_in_un_array;

import java.text.ParseException;
import java.util.Date;
import util.DateFunction;
import util.LibreriaMetodiArray;

/**
 *
 * @author tss
 */
public class DemoOrdinaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        //crea array di persone
        Persona p3 = new Persona("Mario", "Mario");
        Persona p2 = new Persona("Mario", "Luigi");
        Persona p1 = new Persona("Mario", "Wario");
        Persona p4 = new Persona("Mario", "WaLuigi");
        Persona p5 = new Persona("Principessa", "Peach");
        Persona p6 = new Persona("Funghetto", "Toad");
        Persona p7 = new Persona("Tartaruga", "Koopa");
        Persona p8 = new Persona("TartaDrago", "Bowser");

        Persona persone[] = new Persona[]{p1, p2, p3, p4, p5, p6, p7, p8};

        //stampa array        
        LibreriaMetodiArray.stampaArray(persone);

        //richiama metodo ordina passando l'array di persone ordine crescente
        LibreriaMetodiArray.ordinaLista(persone);

        //stampa array ordinato        
        LibreriaMetodiArray.stampaArray(persone);

        Message[] messaggi = new Message[3];
        messaggi[0] = new Message("ciao bel maschione");
        messaggi[1] = new Message("ciao bel maschiaccio");
        messaggi[2] = new Message("ciao bel maschiello");
        
        LibreriaMetodiArray.stampaArray(messaggi);
        LibreriaMetodiArray.ordinaLista(messaggi);
        LibreriaMetodiArray.stampaArray(messaggi);
        
        System.out.println(LibreriaMetodiArray.cerca(messaggi, new Message("ciao bel maschione")));
        
        System.out.println(DateFunction.converti(new Date()));
        System.out.println(DateFunction.converti("19/01/1992"));
    }    
    
    /*private static void stampaArray(Persona[] persone) {
        String report = "";
        int i = 0;
        for (Persona persona : persone) {
            //report += persona.toString() + "\n";  
            System.out.println(persona/*persone[i].toString());
            i++;
        }

        System.out.println("\n");
    }*/
    
    

}
