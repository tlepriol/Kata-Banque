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
        solde = compte.getSolde();
        
        //Then
        assertEquals(2000, solde);
    }
}
