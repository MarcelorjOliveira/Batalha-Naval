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
public class Jogadas {
    
    Jogador jogador1 = new Jogador();
    Jogador jogador2 = new Jogador();
    
    public Jogadas() {
    }
    
    @Before
    public void setUp() throws BarcoForaDaCoordenadaDoTabuleiroException {
        jogador1.desafia(jogador2);
        
        jogador1.criaPortaAviao(6,2,Barco.DIREITA);
        jogador1.criaSubmarino(5,6);
        jogador1.criaSubmarino(3,8);
        jogador1.criaSubmarino(2,9);
        jogador1.criaSubmarino(6,8);
        jogador1.criaBarcoDeDoisCanos(3,1,Barco.ESQUERDA);   
        jogador1.criaBarcoDeDoisCanos(6,1,Barco.DIREITA);
        jogador1.criaBarcoDeDoisCanos(3,5,Barco.ESQUERDA);
        jogador1.criaBarcoDeTresCanos(10,7,Barco.CIMA);
        jogador1.criaBarcoDeTresCanos(7,10,Barco.DIREITA);
        jogador1.criaBarcoDeQuatroCanos(8,6,Barco.BAIXO);
        
        jogador2.criaPortaAviao(3,4,Barco.CIMA);
        jogador2.criaSubmarino(2,7);
        jogador2.criaSubmarino(6,1);
        jogador2.criaSubmarino(8,3);
        jogador2.criaSubmarino(9,2);
        jogador2.criaBarcoDeDoisCanos(5,7,Barco.CIMA);   
        jogador2.criaBarcoDeDoisCanos(7,7,Barco.CIMA);
        jogador2.criaBarcoDeDoisCanos(4,10,Barco.CIMA);
        jogador2.criaBarcoDeTresCanos(7,9,Barco.DIREITA);
        jogador2.criaBarcoDeTresCanos(4,10,Barco.ESQUERDA);
        jogador2.criaBarcoDeQuatroCanos(9,4,Barco.BAIXO);
    }
    @Test
    public void seJogadorClicaEmAgua() {
      assertEquals("Agua",jogador1.clica(6,4));
      assertEquals("Agua",jogador1.clica(8,2));
      assertEquals("Agua",jogador1.clica(10,5));
    }
}
