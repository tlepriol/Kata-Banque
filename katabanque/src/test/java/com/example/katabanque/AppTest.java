package com.example.katabanque;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void getSoldeReturn2000()
    {
        //Given
        int solde;
        Compte compte = new Compte();

        //When
        solde = compte.getSolde(2000, 0, 0);
        
        //Then
        assertEquals(2000, solde);
    }


    @Test
    public void getSoldeAfterDepot3000Return4000(){
        //Given
        int solde;
        Compte compte = new Compte();

        //When
        solde = compte.getSolde(1000, 3000,0);

        // Then
        assertEquals(4000, solde);
    }

    @Test
    public void getSoldeAfterRetrait500Return3500(){
        // Given
        int solde;
        Compte compte = new Compte();
        // When
        solde = compte.getSolde(4000, 0, 500);
        // Then
        assertEquals(3500, solde);
    }
}
