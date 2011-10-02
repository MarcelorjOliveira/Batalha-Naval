/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogabilidade;

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
       
        /*assertEquals(jogador1.barcos().get(0).pontos.get(0).X,submarino.pontos.get(0).X);
        assertEquals(jogador1.barcos().get(0).pontos.get(0).Y,submarino.pontos.get(0).Y);*/
    }
    
    @Test
    public void sejogadorCriaBarcoDeDoisCanos() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.criaBarcoDeDoisCanos(3,4,Barco.DIREITA);
        Barco barcodedoiscanos = new Barco(3,4, Barco.BARCODEDOISCANOS, Barco.DIREITA);
        assertTrue(jogador1.barcos().get(0).equals(barcodedoiscanos));
    }
}
