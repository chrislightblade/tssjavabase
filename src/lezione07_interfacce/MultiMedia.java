/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione07_interfacce;

/**
 *
 * @author tss
 */
public interface MultiMedia {
    
    
    /*pubic static final è sottinteso*/ String PLAYER = "CD_PLAYER";
    String VERSION = "1.0";
    
    //public è sottinteso    
    void play();
    void stop();
    void pause();
    
    public String version();
    
    //fa almeno questo
    default public void reset(){
        
        System.out.println(this.getClass() + "."+ "reset()... di default");
    }
    
}
