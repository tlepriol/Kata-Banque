package com.example.katabanque;

public class Compte {

    public int getSolde(int solde, int depot, int retrait) {
        if(depot != 0){
            return solde+depot;
        }else if (retrait != 0){
            return solde-retrait;
        }else{
            return solde;
        }
       
    }

}
