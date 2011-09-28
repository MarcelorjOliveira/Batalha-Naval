package Pecas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import batalhanaval.BarcoDeDoisCanos;
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
    private final int DIREITA = 1;
    private final int BAIXO = 2;
    private final int ESQUERDA = 3;
    private final int CIMA = 4;
    
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
    
    @Test
    public void criaBarcoDeDoisCanosADireita() {
        BarcoDeDoisCanos barcodedoiscanos = new BarcoDeDoisCanos(2,3,DIREITA);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(3, barcodedoiscanos.pontos.get(1).X);
        assertEquals(3, barcodedoiscanos.pontos.get(1).Y);
    }
    
    @Test
    public void criaBarcoDeDoisCanosAbaixo() {
        BarcoDeDoisCanos barcodedoiscanos = new BarcoDeDoisCanos(2,3,BAIXO);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(2, barcodedoiscanos.pontos.get(1).X);
        assertEquals(4, barcodedoiscanos.pontos.get(1).Y);
        
    }
}
