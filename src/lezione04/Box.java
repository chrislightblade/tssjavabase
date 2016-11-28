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
public class Box {

    private int n;
    private Bicycle bici;

    public Box(int n, Bicycle bici) {
        this.n = n;
        this.bici = bici;
    }
    

    public Bicycle getBici() {
        return bici;
    }

    public void setBici(Bicycle param) {
        param.setSpeed(0);
        this.bici = param;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

}
