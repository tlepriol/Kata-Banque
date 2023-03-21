package com.example.katabanque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    /*@Test
    public void getSoldeGiven1000Retrait2000Return1000(){
        // Given
        int solde;
        compte.depot(1000);
        // When
        compte.retrait(2000);
        // Then
        assertEquals("1000", solde);
    }*/
}
