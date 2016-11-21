/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione03.tiraDadi;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class combattimenti {

    int valori[] = new int[]{-4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8};
    // 0 1 2 3 4 5 6 7 8 9 10 11 12 13
    //-4-3-2-1 0 1 2 3 4 5  6  7  8  9 
    int forzapg = personaggio.forza;
    int agilitàpg = personaggio.agilità;
    int difesapg = personaggio.difesa;
    int intelligenzapg = personaggio.intelligenza;
    int costituzionepg = personaggio.costituzione;
    int punti_vitapg = personaggio.punti_vita;
    int cariche_magichepg = personaggio.cariche_magiche;
    int cariche_tecnichepg = personaggio.cariche_tecniche;
    int cariche_elementalipg = personaggio.cariche_elementali;
    //int perforarepg = personaggio.perforare;
    int bonus_colpirepg = personaggio.bonus_colpire;
    int danno_armapg = personaggio.danno_arma;
    int totale_armaturapg = personaggio.totale_armatura;

    int forza_mostro[] = new int[10];
    int agilità_mostro[] = new int[10];
    int difesa_mostro[] = new int[10];
    int intelligenza_mostro[] = new int[10];
    int costituzione_mostro[] = new int[10];
    int punti_vita_mostro[] = new int[10];
    int cariche_magiche_mostro[] = new int[10];
    int cariche_tecniche_mostro[] = new int[10];
    int cariche_elementali_mostro[] = new int[10];
    int bonus_colpire_mostro[] = new int[10];
    int totale_armatura_mostro[] = new int [10];
    int danno_arma_mostro[] = new int[10];

    Random random = new Random();//uso un d20

    private void colpireilNemico() {

        int colpire = difesapg + agilitàpg + bonus_colpirepg + (random.nextInt(20) + 1);
        int difendere = difesa_mostro[0] + agilità_mostro[0] + totale_armatura_mostro[0] + (random.nextInt(20) + 1);

        if (colpire > difendere) {
            int danno = danno_armapg + forzapg - 7;
            punti_vita_mostro -= danno;
        }
    }
    
    private void colpiredelNemico() {

        int difendere = forzapg + intelligenzapg + totale_armaturapg + (random.nextInt(20) + 1);
        int colpire = forza_mostro[] + intelligenza_mostro[] + bonus_colpire_mostro[] + (random.nextInt(20) + 1);

        if (colpire > difendere) {
            int danno = danno_arma_mostro[] + forza_mostro[] - 7;
            punti_vitapg -= danno;
        }
    }
    
    

}
