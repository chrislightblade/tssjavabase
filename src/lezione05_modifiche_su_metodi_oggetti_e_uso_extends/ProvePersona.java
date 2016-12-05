/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05_modifiche_su_metodi_oggetti_e_uso_extends;

/**
 *
 * @author tss
 */
public class ProvePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autista a = new Autista("Bowser", "Bowser", "B");
        Persona p = new Persona("Mario", "Mario");
        Persona p1 = new Persona("Luigi", "Mario");
        Object[] persone = new Object[2];
        persone[0] = a;
        persone[1] = p;
        stampa(persone);
        /*System.out.println(p);
        Object o = p;
        Persona p2 = p;
        p.setNome("Kupo");
        System.out.println(o.toString());*/
        
    }

    public static void stampa(Object[] anagrafica ){//uso object per stampare oggetti autista o persona perchè in persona ho modificato toString per stamare dele variabili in una stringa
        /*for(int i = 0; i < anagrafica.length; i++){  QUELLO SOTTO FA LA STESSA COSA, SICCOME FA QUELLA COSA FINTANTO CHE TROVA UN OGGETTO A CUI FARE LA COSA
            System.out.println(o.toString());
        }*/
        for(Object o : anagrafica){//fintanto che Oggetto o è un oggetto, allora fai...
            System.out.println(o.toString());
        }
    }
}
