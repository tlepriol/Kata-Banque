package com.example.katabanque;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> getTransaction() {
        List<String> transactions = new ArrayList<>();
        transactions.add("21/03/2023 - 1000 - 1000");
        return transactions;
    }

}
