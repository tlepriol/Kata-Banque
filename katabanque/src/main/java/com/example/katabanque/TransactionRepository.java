package com.example.katabanque;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {

    public List<String> getCalls() {
        List<String> calls = new ArrayList<>();
        calls.add("get - 1");
        return calls;
    }
    
}
