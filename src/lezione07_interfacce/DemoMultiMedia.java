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
public class DemoMultiMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultiMedia mm = new CD_PLAYER();
        mm.play();
        mm.stop();
        
        MultiMedia mm1 = new Mp3Player();
        mm1.play();
        mm1.stop();
        
        MultiMedia medias[] = new MultiMedia[2];
        medias[0] = new CD_PLAYER();
        medias[1] = new Mp3Player();
        
        for (MultiMedia media : medias) {
            System.out.println(media.version());
            media.play();
            media.reset();
        }
        
        
    }
    
}
