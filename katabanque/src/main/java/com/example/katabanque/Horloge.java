package com.example.katabanque;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horloge implements HorlogeInterface {
    
    public String formatDate(){
        DateTimeFormatter formateur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS");
        return formateur.format(LocalDateTime.now() );
    }
    
}
