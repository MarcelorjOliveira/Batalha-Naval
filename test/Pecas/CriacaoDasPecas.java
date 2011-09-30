package Pecas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import batalhanaval.BarcoDeQuatroCanos;
import batalhanaval.BarcoDeTresCanos;
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
    public void criaBarcoDeDoisCanosAcima() {
        BarcoDeDoisCanos barcodedoiscanos = new BarcoDeDoisCanos(2,3,CIMA);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(2, barcodedoiscanos.pontos.get(1).X);
        assertEquals(2, barcodedoiscanos.pontos.get(1).Y);
}

    public void criaBarcoDeDoisCanosAbaixo() {
        BarcoDeDoisCanos barcodedoiscanos = new BarcoDeDoisCanos(2,3,BAIXO);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(2, barcodedoiscanos.pontos.get(1).X);
        assertEquals(4, barcodedoiscanos.pontos.get(1).Y);

    }

    @Test
    public void criaBarcoDeTresCanosAcima() {
        BarcoDeTresCanos barcodetrescanos = new BarcoDeTresCanos(2,3,CIMA);
        assertEquals(2, barcodetrescanos.pontos.get(0).X);
        assertEquals(3, barcodetrescanos.pontos.get(0).Y);
        assertEquals(2, barcodetrescanos.pontos.get(1).X);
        assertEquals(2, barcodetrescanos.pontos.get(1).Y);
        assertEquals(2, barcodetrescanos.pontos.get(2).X);
        assertEquals(1, barcodetrescanos.pontos.get(2).Y);
    }

    @Test
    public void criaBarcoDeTresCanosAEsquerda() {
        BarcoDeTresCanos barcodetrescanos = new BarcoDeTresCanos(3,3,ESQUERDA);
        assertEquals(3, barcodetrescanos.pontos.get(0).X);
        assertEquals(3, barcodetrescanos.pontos.get(0).Y);
        assertEquals(2, barcodetrescanos.pontos.get(1).X);
        assertEquals(3, barcodetrescanos.pontos.get(1).Y);
        assertEquals(1, barcodetrescanos.pontos.get(2).X);
        assertEquals(3, barcodetrescanos.pontos.get(2).Y);
    }

    @Test
    public void criaBarcoDeTresCanosAbaixo() {
        BarcoDeTresCanos barcodetrescanos = new BarcoDeTresCanos(3,3,BAIXO);
        assertEquals(3, barcodetrescanos.pontos.get(0).X);
        assertEquals(3, barcodetrescanos.pontos.get(0).Y);
        assertEquals(3, barcodetrescanos.pontos.get(1).X);
        assertEquals(4, barcodetrescanos.pontos.get(1).Y);
        assertEquals(3, barcodetrescanos.pontos.get(2).X);
        assertEquals(5, barcodetrescanos.pontos.get(2).Y);
    }

    @Test
    public void criaBarcoDeQuatroCanosADireita() {
        BarcoDeQuatroCanos barcodequatrocanos = new BarcoDeQuatroCanos(3,3,DIREITA);
        assertEquals(3, barcodequatrocanos.pontos.get(0).X);
        assertEquals(3, barcodequatrocanos.pontos.get(0).Y);
        assertEquals(4, barcodequatrocanos.pontos.get(1).X);
        assertEquals(3, barcodequatrocanos.pontos.get(1).Y);
        assertEquals(5, barcodequatrocanos.pontos.get(2).X);
        assertEquals(3, barcodequatrocanos.pontos.get(2).Y);
        assertEquals(6, barcodequatrocanos.pontos.get(3).X);
        assertEquals(3, barcodequatrocanos.pontos.get(3).Y);
    }
}

