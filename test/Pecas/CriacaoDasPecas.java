package Pecas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import batalhanaval.Submarino;
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
public class CriacaoDasPecas {
    
    private Tabuleiro tabuleiro;
    
    public CriacaoDasPecas() {
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
    public void criaSubmarino() {
        Submarino submarino = new Submarino(2,3);
        assertEquals(2, submarino.ponto.X);
        assertEquals(3, submarino.ponto.Y);
    }
}
