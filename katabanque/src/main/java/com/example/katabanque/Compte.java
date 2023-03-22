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

    public int getSolde() {
       return solde;
    }

    public void depot(int depot) {
        solde=solde+depot;
        transactions.add(formatDate(LocalDateTime.now()) + " - " + depot + " - " + solde);
    }

    public void retrait(int retrait) {
        solde=solde-retrait;
        transactions.add(formatDate(LocalDateTime.now()) + " - " + "-" +retrait + " - " + solde);
    }

    public List<String> getTransaction() {
        return transactions;
    }

    public String formatDate(LocalDateTime date){
        DateTimeFormatter formateur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
        return formateur.format(date);
    }

}
