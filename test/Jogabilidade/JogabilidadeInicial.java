/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogabilidade;

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
}
