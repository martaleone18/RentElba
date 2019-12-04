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
public class Automobile extends Mezzi {
    
    private int assicurazioneGiornaliera;

    public Automobile(String modello, int prezzoGiornaliero, int prezzoOrario) {
        super(modello, prezzoGiornaliero, prezzoOrario);
    }
    
}
