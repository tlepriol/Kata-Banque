package com.example.katabanque;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    int counter;

    public List<String> getCalls() {
        List<String> calls = new ArrayList<>();
        calls.add("get - " + counter);
        return calls;
    }

    public void getAllTransactions() {
        counter++;
    }

    
}
