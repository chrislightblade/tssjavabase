/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione06_riordino_elementi_in_un_array.generics;

/**
 *
 * carateristica = è il campo valore, deve essere un contenitore generico
 * 
 * @author tss
 */
public class Box<T> implements Comparable<T>{
    
    private T object;

    public Box(T object) {
        this.object = object;
    }  
    
    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
    
    @Override
    public String toString(){
        return object.toString();
    }

    @Override
    public int compareTo(T o) {
        return this.object.getClass().toString().compareTo(o.getClass().toString());
    }
    
}
