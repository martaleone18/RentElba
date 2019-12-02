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
public class Turisti {

    private String nome;
    private String cognome;
    private String username;
    private String password;
    private String numTelefono;
    private int annoNascita;
    private ArrayList<Turisti> elencoTuristi;

    public Turisti(String nome, String cognome, String username, String password, String numTelefono, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.numTelefono = numTelefono;
        this.annoNascita = annoNascita;
        elencoTuristi = new ArrayList<Turisti>();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public ArrayList<Turisti> getElencoTuristi() {
        return elencoTuristi;
    }

    public void setElencoTuristi(ArrayList<Turisti> elencoTuristi) {
        this.elencoTuristi = elencoTuristi;
    }

    public String schedaInfoTuristi() {
        String ris = " ";
        int i = 0;
        for (Turisti tu : elencoTuristi) {

            i++;

            ris += i + " - " + tu.getNome() + " - " + tu.getCognome() + " - " + tu.getUsername() + " - "
                    + tu.getPassword() + " - " + tu.getNumTelefono() + " - " + tu.getAnnoNascita() + "\n";

        }

        return ris;

    }

}
