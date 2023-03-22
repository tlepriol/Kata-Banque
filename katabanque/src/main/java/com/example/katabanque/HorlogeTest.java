package com.example.katabanque;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HorlogeTest implements HorlogeInterface {
    String now;

    public HorlogeTest(String date) {
        this.now = date;
    }

    public String getFormattedNow(){
        return this.now;
    }
}
