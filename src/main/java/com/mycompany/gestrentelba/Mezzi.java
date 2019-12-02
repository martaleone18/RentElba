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
public class Mezzi {

    private String modello;
    private int prezzoGiornaliero;
    private int prezzoOrario;
    private int numGiorni;
    private ArrayList<Mezzi> elencoMezzi;

    public Mezzi(String modello, int prezzoGiornaliero, int prezzoOrario) {
        this.modello = modello;
        this.prezzoGiornaliero = prezzoGiornaliero;
        this.prezzoOrario = prezzoOrario;
        elencoMezzi = new ArrayList<Mezzi>();

    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getPrezzoGiornaliero() {
        return prezzoGiornaliero;
    }

    public void setPrezzoGiornaliero(int prezzoGiornaliero) {
        this.prezzoGiornaliero = prezzoGiornaliero;
    }

    public int getPrezzoOrario() {
        return prezzoOrario;
    }

    public void setPrezzoOrario(int prezzoOrario) {
        this.prezzoOrario = prezzoOrario;
    }

    public ArrayList<Mezzi> getElencoMezzi() {
        return elencoMezzi;
    }

    public void setElencoMezzi(ArrayList<Mezzi> elencoMezzi) {
        this.elencoMezzi = elencoMezzi;
    }

    public int getNumGiorni() {
        return numGiorni;
    }

    public void setNumGiorni(int numGiorni) {
        this.numGiorni = numGiorni;
    }

    
    
      public String schedaInfoMezzi() {
        String ris = " ";
        int i = 0;
        for (Mezzi mez : elencoMezzi) {

            i++;

            ris += i + " - " + mez.getModello() + " - " + mez.getPrezzoGiornaliero() + " - " + mez.costoNoleggioGG() + "- " +
                    mez.getPrezzoOrario() + "\n";

        }

        return ris;

    }
      public int costoNoleggioGG () {
          int ris = getPrezzoGiornaliero() * getNumGiorni();

          return ris;
      }
      
      
}
