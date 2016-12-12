/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.riordino_elementi_in_un_array;

import lezione05_modifiche_su_metodi_oggetti_e_uso_extends.*;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Persona implements Comparable<Persona>{

    private String nome, cognome;
    private String sesso;
    private Date datanascita = new Date(0, 0, 0);
    
    public Persona(String nome, String cognome) {
        this(nome, cognome, null, null);        
    }

    public Persona(String nome, String cognome, String sesso, Date datanascita){
        this.sesso = sesso;
        this.datanascita = datanascita;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Date getDatanascita() {
        return datanascita;
    }

    public void setDatanascita(Date datanascita) {
        this.datanascita = datanascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        if(!sesso.equalsIgnoreCase("M") || !sesso.equalsIgnoreCase("F")){
            //gestire errore
            return;
        }
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    @Override
    public String toString(){
        return nome + "." + cognome;
    }    
    
    /*@Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;            
        }
        
        if(obj.getClass() != Persona.class){
            return false;
        }
        //assegna l'oggetto obj a un oggetto nuovo p in classe Persona
        //l'elemento fra parentesi definisce il formato nuovo che deve diventare 
        //CASTING, dove sto praticamente convertendo obj in Persona
        Persona p = (Persona)obj;
        //if(!this.getCognome().equals(p.getCognome())){
        //    return false;
        //}
        //if(this.getNome().equals(p.getNome())){
        //    return true;
        //}
        
        if(this.getNome().equals(p.getNome()) && this.getCognome().equals(p.getCognome())){
            return true;
        }
        
        return false;
    }*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.cognome);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cognome, other.cognome)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Persona o) {
        return this.cognome.compareTo(o.getCognome());
    }
}
