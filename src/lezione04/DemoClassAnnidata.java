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
public class DemoClassAnnidata {
    
    public static void main(String[] args) {
        
        Persona p = new Persona("Mario", "Rossi");
        //Persona.Indirizzo ind = new Persona.Indirizzo("via Roma", 8, 10011, "Bilbao");      
        Persona.Indirizzo indirizzo = p.getIndirizzo();
        indirizzo.setIndirizzo("via Roma");
        indirizzo.setCap(10011);
        indirizzo.setCittà("Bilbao");
        indirizzo.setNumero(8);
        System.out.println(p.getNome() + "." + p.getCognome());
        
    }
    
}

class Persona{
    
    private String nome, cognome;
    private Indirizzo indirizzo;

    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = new Indirizzo("via Roma", 8, 10011, "Bilbao");
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }    

    public Indirizzo getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(Indirizzo indirizzo) {
        this.indirizzo = indirizzo;
    }
    
    
    
    
    class Indirizzo{
        
        private String indirizzo;
        private int numero, cap;
        private String città;

        public Indirizzo(String indirizzo, int numero, int cap, String città) {
            this.indirizzo = indirizzo;
            this.numero = numero;
            this.cap = cap;
            this.città = città;
        }

        public int getCap() {
            return cap;
        }

        public String getCittà() {
            return città;
        }

        public String getIndirizzo() {
            return indirizzo;
        }

        public int getNumero() {
            return numero;
        }

        public void setCap(int cap) {
            this.cap = cap;
        }

        public void setCittà(String città) {
            this.città = città;
        }

        public void setIndirizzo(String indirizzo) {
            this.indirizzo = indirizzo;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }
        
        
        
    }
       
}