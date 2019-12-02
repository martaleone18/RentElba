/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gestrentelba;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Noleggio {

    private String Turista;
    private String mezzo;
    private int numGiorni;
    private ArrayList<Noleggio> elencoNoleggio;

    public Noleggio(String Turista, String mezzo, int numGiorni) {
        this.Turista = Turista;
        this.mezzo = mezzo;
        this.numGiorni = numGiorni;
        elencoNoleggio = new ArrayList<Noleggio>();
    }

    public ArrayList<Noleggio> getElencoNoleggio() {
        return elencoNoleggio;
    }

    public void setElencoNoleggio(ArrayList<Noleggio> elencoNoleggio) {
        this.elencoNoleggio = elencoNoleggio;
    }

    public String getTurista() {
        return Turista;
    }

    public void setTurista(String Turista) {
        this.Turista = Turista;
    }

    public String getMezzo() {
        return mezzo;
    }

    public void setMezzo(String mezzo) {
        this.mezzo = mezzo;
    }

    public int getNumGiorni() {
        return numGiorni;
    }

    public void setNumGiorni(int numGiorni) {
        this.numGiorni = numGiorni;
    }
    
    public String schedaInfoNoleggio() {
        String ris = " ";
        int i = 0;
        for (Noleggio nol : elencoNoleggio) {

            i++;

            ris += i + " - " + nol.getTurista() + " - " + nol.getMezzo() + " - " + nol.getNumGiorni() + "- " + "\n";

        }

        return ris;

    }

}
