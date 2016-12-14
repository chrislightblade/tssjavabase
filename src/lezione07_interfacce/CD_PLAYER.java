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
public class CD_PLAYER implements MultiMediaPlus, MultiMedia{

    @Override
    public void play() {
        System.out.println(this.getClass() + ".Play");
        
    }

    @Override
    public void stop() {
        System.out.println(this.getClass() + ".Stop!");
        
    }
    
    @Override
    public void pause() {
        
    }   

    @Override
    public void FastForward() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void FastRewind() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reset() {
        MultiMediaPlus.super.reset(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String version() {
        return VERSION;
    }
    
    }
