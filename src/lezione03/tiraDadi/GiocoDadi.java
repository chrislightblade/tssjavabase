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
public class GiocoDadi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Giocatore Fabio = new Giocatore("Fabio", 100);
        
        Dado FabioDado = new Dado(6);
        Dado BancoDado = new Dado(6);
        int conta = 0;
        
        Contatore contaMani = new Contatore(0, 1);
        while (Fabio.saldo() > 0){
            Fabio.Stampa();
            int lancioGiocatore = FabioDado.lancio();
            int lancioBanco = BancoDado.lancio();
            if(lancioGiocatore > lancioBanco){
                Fabio.vince();
            } else {
                Fabio.perde();
            }
            contaMani.conta();
            System.out.println("il giocatore ha fatto: " + lancioGiocatore + "\nil banco ha fatto: " + lancioBanco + "\nsoldi: " + Fabio.saldo() + "\npuntata numero: " + contaMani.stampa());
        }
    }
    
}
