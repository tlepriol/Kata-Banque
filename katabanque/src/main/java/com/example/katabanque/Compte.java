package com.example.katabanque;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compte {
    int solde;
    int depot;
    int retrait;
    List<String> transactions = new ArrayList<>();

    public int getSolde() {
       return solde;
    }

    public void depot(int depot) {
        solde=solde+depot;
        transactions.add(LocalDate.now() + " - " + depot + " - " + solde);
    }

    public void retrait(int retrait) {
        solde=solde-retrait;
    }

    public List<String> getTransaction() {
        return transactions;
    }

}
