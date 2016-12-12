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
public class DemoOrdinaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        stampaArray(persone);

        //richiama metodo ordina passando l'array di persone ordine crescente
        ordinaLista(persone);

        //stampa array ordinato        
        stampaArray(persone);

    }

    private static void ordinaLista(Persona[] persone) {

        /*for(int i = 0; (i+1) < persona.length; i++){        più leggero da scrivere
            if(persone[i].compareTo(persone[i+1]) > 0){
                tmp = persone[i];
                persone [i] = persone[i+1];
                persone[i+1] = tmp;
                i = 0;
          }*/
        int i = 0;
        boolean control = false;
        while (control == false) {
            Persona tmp;
            if (persone[i].compareTo(persone[i + 1]) > 0) {
                tmp = persone[i];
                persone[i] = persone[i + 1];
                persone[i + 1] = tmp;
                i = 0;
            } else {
                i++;
                if ((i + 1) == persone.length) {
                    control = true;
                }
            }
        }
    }

    private static void stampaArray(Persona[] persone) {
        String report = "";
        int i = 0;
        for (Persona persona : persone) {
            //report += persona.toString() + "\n";  
            System.out.println(persone[i].toString());
            i++;
        }

        System.out.println("\n");
    }

}
