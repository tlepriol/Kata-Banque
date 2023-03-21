package com.example.katabanque;

public class Compte {
    int solde;
    int depot;
    int retrait;

    public int getSolde() {
       return solde;
    }

    public void depot(int depot) {
        solde=solde+depot;
    }

    public void retrait(int retrait) {
        solde=solde-retrait;
    }

}
