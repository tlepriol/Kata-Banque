package com.example.katabanque;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
  
    @Test
    public void getSoldeGiven2000Return2000()
    {
        //Given
        int solde;
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(2000);

        //When
        solde = compte.getSolde();
        
        //Then
        assertEquals(2000, solde);
    }


    @Test
    public void getSoldeGiven1000Depot3000Return4000(){
        //Given
        int solde;
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(1000);
        

        //When
        compte.depot(3000);

        // Then
        solde = compte.getSolde();
        assertEquals(4000, solde);
    }

    @Test
    public void getSoldeGiven4000Retrait500Return3500(){
        // Given
        int solde;
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(4000);

        // When
        compte.retrait(500);
        
        // Then
        solde = compte.getSolde();
        assertEquals(3500, solde);
    }

    @Test
    public void getTransactionGiven0Depot1000Return1Line() {
        // Given
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(1000);

        // When
        List<String> transactions = compte.getTransaction();

        // Then
        assertEquals("23/03/2023 14:44:56.123 - 1000 - 1000", transactions.get(0));
    }

    @Test
    public void getTransactionGiven0Depot500ReturnCorrectLine() {
        // Given
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(500);

        // When
        List<String> transactions = compte.getTransaction();

        // Then
        assertEquals("23/03/2023 14:44:56.123 - 500 - 500", transactions.get(0));
    }

    @Test
    public void getTransactionGiven1000Retrait500ReturnCorrectLines() {
        // Given
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(1000);
        compte.retrait(500);
        

        // When
        List<String> transactions = compte.getTransaction();

        // Then
        assertEquals("23/03/2023 14:44:56.123 - 1000 - 1000", transactions.get(0));
        assertEquals("23/03/2023 14:44:56.123 - -500 - 500", transactions.get(1));
    }

    @Test
    public void getTransactionGiven300ReturnCorrectLine() {
        //Given
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(300);

        //When
        List<String> transactions = compte.getTransaction();

        //Then
        assertEquals("23/03/2023 14:44:56.123 - 300 - 300", transactions.get(0));
    }

    @Test
    public void getTransactionShouldCallTransactionRepository() {
        // Given
        TransactionRepository transactionRepository = new TransactionRepository();
        HorlogeTest horlogeTest = new HorlogeTest("23/03/2023 14:44:56.123");
        Compte compte = new Compte(horlogeTest, transactionRepository);
        compte.depot(300);

        // When
        compte.getTransaction();

        // Then
        List<String> calls = transactionRepository.getCalls();
        assertEquals("get - 1", calls.get(0));
    }
    
}
