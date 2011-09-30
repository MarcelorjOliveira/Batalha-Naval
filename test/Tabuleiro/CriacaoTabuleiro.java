/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabuleiro;

import batalhanaval.Tabuleiro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class CriacaoTabuleiro {
    
    private Tabuleiro tabuleiro;
    
    public CriacaoTabuleiro() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        tabuleiro = new Tabuleiro();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testaTamanhoTabuleiro()
    {
        assertEquals(10, tabuleiro.largura);
        assertEquals(10, tabuleiro.altura);
    }
}
