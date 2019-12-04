/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

/**
 *
 * @author tss
 */
public class Moto extends Mezzi {

    private int assicurazioneGiornaliera;

    public Moto(String modello, int prezzoGiornaliero, int prezzoOrario) {
        super(modello, prezzoGiornaliero, prezzoOrario);
        this.assicurazioneGiornaliera = assicurazioneGiornaliera;

    }

    public int getAssicurazioneGiornaliera() {
        return assicurazioneGiornaliera;
    }

    public int costoAssicurazioneGG() {
        int ris = getAssicurazioneGiornaliera() * getNumGiorni();
        return ris;
    }
    
     public int costoNolAssGG () {
          int ris = costoNoleggioGG() + costoAssicurazioneGG();

          return ris;
      }
      
    
}
