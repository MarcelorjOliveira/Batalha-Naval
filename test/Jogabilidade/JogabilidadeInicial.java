/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogabilidade;

import batalhanaval.PortaAviao;
import batalhanaval.Barco;
import batalhanaval.BarcoForaDaCoordenadaDoTabuleiroException;
import batalhanaval.Jogador;
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
public class JogabilidadeInicial {
    
    public JogabilidadeInicial() {
    }
    
    Jogador jogador1;
    Jogador jogador2;
    
    @Before
    public void setUp() {
        jogador1 = new Jogador();
        jogador2 = new Jogador();
    }

    @Test
    public void seJogador1desafiaJogador2() {
    
    jogador1.desafia(jogador2);
    
    assertSame(jogador2, jogador1.oponente());
    assertSame(jogador1, jogador2.oponente());
        
    }
    
    @Test
    public void sejogadorCriaSubmarino() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.criaSubmarino(3,4);
        Barco submarino = new Barco(3,4, Barco.SUBMARINO);
        assertTrue(jogador1.barcos().get(0).equals(submarino));
    }
    
    @Test
    public void sejogadorCriaBarcoDeDoisCanos() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.criaBarcoDeDoisCanos(3,4,Barco.DIREITA);
        Barco barcodedoiscanos = new Barco(3,4, Barco.BARCODEDOISCANOS, Barco.DIREITA);
        assertTrue(jogador1.barcos().get(0).equals(barcodedoiscanos));
    }
    
    @Test
    public void sejogadorCriaBarcoDeTresCanos() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.criaBarcoDeTresCanos(3,4,Barco.DIREITA);
        Barco barcodetrescanos = new Barco(3,4, Barco.BARCODETRESCANOS, Barco.DIREITA);
        assertTrue(jogador1.barcos().get(0).equals(barcodetrescanos));
    }
    
    @Test
    public void sejogadorCriaBarcoDeQuatroCanos() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.criaBarcoDeQuatroCanos(3,4,Barco.DIREITA);
        Barco barcodequatrocanos = new Barco(3,4, Barco.BARCODEQUATROCANOS, Barco.DIREITA);
        assertTrue(jogador1.barcos().get(0).equals(barcodequatrocanos));
    }
    
    @Test
    public void sejogadorCriaPortaAviao() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.criaPortaAviao(3,4,Barco.DIREITA);
        PortaAviao portaaviao = new PortaAviao(3,4,Barco.DIREITA);
        assertTrue(jogador1.barcos().get(0).equals(portaaviao));
    }
    
    @Test
    public void seJogadorCriaAQuantidadeCertaDePecas() 
    {
        jogador1.criaPecasAleatorias();
        assertEquals(11,jogador1.barcos().size());
    }
}
