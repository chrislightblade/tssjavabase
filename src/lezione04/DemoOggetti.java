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
public class DemoOggetti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicycle b1 = new Bicycle(10, 1);
        Bicycle b2 = new Bicycle(10, 1);
        
        if(b1 == b2){
            System.out.println("uguali");
        } else {
            System.out.println("diversi");            
        }
        
        Bicycle b3 = new Bicycle();
        //Matematica m = new Matematica();// me lo impedisce perhè ho messo il costruttore in privato, impedendo all'utente di sprecare memoria;
        
        System.out.println("Numero di instanze create: " + Bicycle.getNumeroIstanze() + "\n");
        
    }
    
}
