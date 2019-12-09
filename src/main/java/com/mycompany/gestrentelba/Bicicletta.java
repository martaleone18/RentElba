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
public class Bicicletta extends Mezzi {

    private String attivitàAggiuntive;
    

    public Bicicletta(String modello, int prezzoGiornaliero, int prezzoOrario) {
        super(modello, prezzoGiornaliero, prezzoOrario);
        this.attivitàAggiuntive=attivitàAggiuntive;

    }

}
