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
public class GestRent {
static ArrayList<Noleggio> elencoNoleggio;
static ArrayList<Turista> elencoTuristi;
static ArrayList<Mezzi> elencoMezzi;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Turista t1 = new Turista ("Marta", "Leone", "MartaLeo", "xxxxx", "3335556767", 1995);
        Mezzi m1 =new Mezzi ("Ducati", 25, 3);
        Mezzi m2 =new Mezzi ("Ranault Clio", 50, 10 );
        
        
    }
    
    
    
}
