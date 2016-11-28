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
public class DemoApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
          
        Bicycle bici = new Bicycle(0, 1);
        bici.setSpeed(10);
        
        Box box = new Box(n, bici);
        int numero = 10;
        box.setN(numero);
    }

    
}
