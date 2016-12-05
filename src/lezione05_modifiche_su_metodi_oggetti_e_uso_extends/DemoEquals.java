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
public class DemoEquals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona p = new Autista("Mario", "Mario", "B");
        Autista p = new Autista("Mario", "Mario", "B");
        Autista a = new Autista("Luigi", "Mario", "B");
        //Persona p = new Persona("Mario", "Mario");
        //Persona a = new Persona("Mario", "Mario");
        Autista daCercare = new Autista("Mario", "Mario", "B");
        Object[] persone = new Object[2];
        persone[0] = a;
        persone[1] = p;
        int risultato = (cerca(persone, daCercare));
        System.out.println(risultato);
        
    }

   /**
    * 
    * ricerca un elemento all'interno del vettore e ritorna l'indice della prima occorrenza trovata;
    * 
    * @param anagrafica vettore dove ricercare
    * @param elemento elemento da cercare nel vettore
    * @return indice dell'elemento nel caso lo abbia trovato, altrimenti -1
    */
   public static int cerca(Object[] anagrafica, Object elemento){
       
       for (int i = 0; i < anagrafica.length; i++) {
           if(anagrafica[i].equals(elemento)){
               return i;
           }
       }
       return -1;
   }
}
