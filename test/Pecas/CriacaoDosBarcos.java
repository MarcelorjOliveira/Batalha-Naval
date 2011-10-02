package Pecas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import batalhanaval.BarcoForaDaCoordenadaDoTabuleiroException;
import batalhanaval.PortaAviao;
import batalhanaval.Barco;
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

//TODO Barco não ser criado fora do Tabuleiro
// TODO Se um barco não é criado em cima dos outros
public class CriacaoDosBarcos {

    private Tabuleiro tabuleiro;

    public CriacaoDosBarcos() throws BarcoForaDaCoordenadaDoTabuleiroException {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws BarcoForaDaCoordenadaDoTabuleiroException {
        tabuleiro = new Tabuleiro();
    }

    @After
    public void tearDown() {
    }

    /*
    @Test(expected = BarcoForaDaCoordenadaDoTabuleiroException.class)
    public void naocriaBarcoEmCoordenadaForaDoTabuleiro() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco submarino = new Barco(11,3, Barco.SUBMARINO);
    }*/
    
    @Test
    public void criaSubmarino() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco submarino = new Barco(2,3, Barco.SUBMARINO);
        assertEquals(2, submarino.pontos.get(0).X);
        assertEquals(3, submarino.pontos.get(0).Y);
    }

    @Test
    public void criaBarcoDeDoisCanosADireita() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodedoiscanos = new Barco(2,3,Barco.BARCODEDOISCANOS,Barco.DIREITA);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(3, barcodedoiscanos.pontos.get(1).X);
        assertEquals(3, barcodedoiscanos.pontos.get(1).Y);
    }

    @Test
    public void criaBarcoDeDoisCanosAcima() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodedoiscanos = new Barco(2,3,Barco.BARCODEDOISCANOS,Barco.CIMA);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(2, barcodedoiscanos.pontos.get(1).X);
        assertEquals(2, barcodedoiscanos.pontos.get(1).Y);
}

    public void criaBarcoDeDoisCanosAbaixo() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodedoiscanos = new Barco(2,3,Barco.BARCODEDOISCANOS,Barco.BAIXO);
        assertEquals(2, barcodedoiscanos.pontos.get(0).X);
        assertEquals(3, barcodedoiscanos.pontos.get(0).Y);
        assertEquals(2, barcodedoiscanos.pontos.get(1).X);
        assertEquals(4, barcodedoiscanos.pontos.get(1).Y);

    }

    @Test
    public void criaBarcoDeTresCanosAcima() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodetrescanos = new Barco(2,3,Barco.BARCODETRESCANOS,Barco.CIMA);
        assertEquals(2, barcodetrescanos.pontos.get(0).X);
        assertEquals(3, barcodetrescanos.pontos.get(0).Y);
        assertEquals(2, barcodetrescanos.pontos.get(1).X);
        assertEquals(2, barcodetrescanos.pontos.get(1).Y);
        assertEquals(2, barcodetrescanos.pontos.get(2).X);
        assertEquals(1, barcodetrescanos.pontos.get(2).Y);
    }

    @Test
    public void criaBarcoDeTresCanosAEsquerda() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodetrescanos = new Barco(3,3,Barco.BARCODETRESCANOS,Barco.ESQUERDA);
        assertEquals(3, barcodetrescanos.pontos.get(0).X);
        assertEquals(3, barcodetrescanos.pontos.get(0).Y);
        assertEquals(2, barcodetrescanos.pontos.get(1).X);
        assertEquals(3, barcodetrescanos.pontos.get(1).Y);
        assertEquals(1, barcodetrescanos.pontos.get(2).X);
        assertEquals(3, barcodetrescanos.pontos.get(2).Y);
    }

    @Test
    public void criaBarcoDeTresCanosAbaixo() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodetrescanos = new Barco(3,3,Barco.BARCODETRESCANOS,Barco.BAIXO);
        assertEquals(3, barcodetrescanos.pontos.get(0).X);
        assertEquals(3, barcodetrescanos.pontos.get(0).Y);
        assertEquals(3, barcodetrescanos.pontos.get(1).X);
        assertEquals(4, barcodetrescanos.pontos.get(1).Y);
        assertEquals(3, barcodetrescanos.pontos.get(2).X);
        assertEquals(5, barcodetrescanos.pontos.get(2).Y);
    }

    @Test
    public void criaBarcoDeQuatroCanosADireita() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Barco barcodequatrocanos = new Barco(3,3,Barco.BARCODEQUATROCANOS,Barco.DIREITA);
        assertEquals(3, barcodequatrocanos.pontos.get(0).X);
        assertEquals(3, barcodequatrocanos.pontos.get(0).Y);
        assertEquals(4, barcodequatrocanos.pontos.get(1).X);
        assertEquals(3, barcodequatrocanos.pontos.get(1).Y);
        assertEquals(5, barcodequatrocanos.pontos.get(2).X);
        assertEquals(3, barcodequatrocanos.pontos.get(2).Y);
        assertEquals(6, barcodequatrocanos.pontos.get(3).X);
        assertEquals(3, barcodequatrocanos.pontos.get(3).Y);
    }
    
    @Test
    public void criaPortaAviaoADireita() throws BarcoForaDaCoordenadaDoTabuleiroException {
        PortaAviao portaaviao = new PortaAviao(3,3,PortaAviao.DIREITA);
        assertEquals(3, portaaviao.pontos.get(0).X);
        assertEquals(3, portaaviao.pontos.get(0).Y);
        assertEquals(4, portaaviao.pontos.get(1).X);
        assertEquals(3, portaaviao.pontos.get(1).Y);
        assertEquals(5, portaaviao.pontos.get(2).X);
        assertEquals(3, portaaviao.pontos.get(2).Y);
        assertEquals(5, portaaviao.pontos.get(3).X);
        assertEquals(2, portaaviao.pontos.get(3).Y);
        assertEquals(5, portaaviao.pontos.get(4).X);
        assertEquals(4, portaaviao.pontos.get(4).Y);
    }
    
    @Test
    public void criaPortaAviaoAcima() throws BarcoForaDaCoordenadaDoTabuleiroException {
        PortaAviao portaaviao = new PortaAviao(3,3,PortaAviao.CIMA);
        assertEquals(3, portaaviao.pontos.get(0).X);
        assertEquals(3, portaaviao.pontos.get(0).Y);
        assertEquals(3, portaaviao.pontos.get(1).X);
        assertEquals(2, portaaviao.pontos.get(1).Y);
        assertEquals(3, portaaviao.pontos.get(2).X);
        assertEquals(1, portaaviao.pontos.get(2).Y);
        assertEquals(2, portaaviao.pontos.get(3).X);
        assertEquals(1, portaaviao.pontos.get(3).Y);
        assertEquals(4, portaaviao.pontos.get(4).X);
        assertEquals(1, portaaviao.pontos.get(4).Y);
    }
    
}

