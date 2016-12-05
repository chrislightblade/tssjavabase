/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione05_modifiche_su_metodi_oggetti_e_uso_extends;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Autista extends Persona{
    
    private String patente;

    public Autista(String nome, String cognome, String patente) {
        super(nome, cognome);
        this.patente = patente;
        
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    @Override
    public String toString(){
        return super.toString() + " . Patente:" + patente;
    }

    @Override
    public int hashCode() { 
        int hash = super.hashCode() + Objects.hashCode(this.patente);
        //int hash = 7;
        //hash = 67 * hash + Objects.hashCode(this.patente);
        return hash;
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
        if(!super.equals(obj)){
           return false;
        }
        final Autista other = (Autista) obj;
        
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return true;
    }
    
    
}