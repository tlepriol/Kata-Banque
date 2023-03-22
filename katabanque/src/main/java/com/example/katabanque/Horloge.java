package com.example.katabanque;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horloge implements HorlogeInterface {
    LocalDateTime now;

    public Horloge() {
        this.now = LocalDateTime.now();
    }

    public String getFormattedNow(){
        DateTimeFormatter formateur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
        return formateur.format( this.now );
    }
    
}