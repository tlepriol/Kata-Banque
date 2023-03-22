package com.example.katabanque;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Compte {

    int solde;
    int depot;
    int retrait;
    List<String> transactions = new ArrayList<>();
    HorlogeInterface horloge;

    public Compte(HorlogeInterface horloge) {
        this.horloge = horloge;
    }

    public int getSolde() {
       return solde;
    }

    public void depot(int depot) {
        solde=solde+depot;
        transactions.add(horloge.getFormattedNow() + " - " + depot + " - " + solde);
    }

    public void retrait(int retrait) {
        solde=solde-retrait;
        transactions.add(horloge.getFormattedNow() + " - " + "-" +retrait + " - " + solde);
    }

    public List<String> getTransaction() {
        return transactions;
    }



}
