package com.example.katabanque;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Compte compte;
    @Before 
    public void init() {
        compte = new Compte();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void getSoldeGiven2000Return2000()
    {
        //Given
        int solde;
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
        int solde;
        compte.depot(1000);

        // When
        List<String> transactions = compte.getTransaction();

        // Then
        assertEquals(LocalDate.now() + " - 1000 - 1000", transactions.get(0));
    }

    @Test
    public void getTransactionGiven0Depot500ReturnCorrectLine() {
        // Given
        int solde;
        compte.depot(500);

        // When
        List<String> transactions = compte.getTransaction();

        // Then
        assertEquals(LocalDate.now() + " - 500 - 500", transactions.get(0));
    }

    @Test
    public void getTransactionGiven1000Retrait500ReturnCorrectLines() {
        // Given
        int solde;
        compte.depot(1000);
        compte.retrait(500);

        // When
        List<String> transactions = compte.getTransaction();

        // Then
        assertEquals(LocalDate.now() + " - 1000 - 1000", transactions.get(0));
        assertEquals(LocalDate.now() + " - -500 - 500", transactions.get(1));
    }
    
}
