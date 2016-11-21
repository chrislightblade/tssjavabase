/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.tiraDadi;

/**
 *
 * @author tss
 */
public class Giocatore {

    private String nome;
    private int soldi = 0;

    //metodo costruttore
    public Giocatore(String nomeGiocatore, int credito) {
        nome = nomeGiocatore;
        soldi = credito;
    }

    public void perde() {
        soldi--;
    }

    public void vince() {
        soldi++;
    }

    public void Stampa() {
        System.out.println("nome: " + nome + "\nsoldi: " + soldi);
    }

    int saldo() {
        return soldi;
    }
}
