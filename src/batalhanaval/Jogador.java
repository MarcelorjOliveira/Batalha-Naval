/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author marcelo
 */

// TODO se Jogador tenta clicar em uma região fora do Tabuleiro
public class Jogador {
    
    private String nome;
    
    private Jogador oponente;
    private ArrayList<Barco> barcos = new ArrayList<Barco>();
    private ArrayList<Barco> barcosDestruidos = new ArrayList<Barco>();
    
    public Jogador(String nome) {
        this.nome = nome;
    }
    
    public void desafia(Jogador jogador)
    {
        this.oponente = jogador;
        jogador.oponente = this;
    }
    
    public Jogador oponente()
    {
        return oponente;
    }
    
    public ArrayList<Barco> barcos() {
        return barcos;
    }
    
   public void criaSubmarino(int X, int Y) throws BarcoForaDaCoordenadaDoTabuleiroException {
    barcos.add(new Barco(X,Y,Barco.SUBMARINO));
    }

    public void criaBarcoDeDoisCanos(int X, int Y, int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException {
        barcos.add(new Barco(X,Y,Barco.BARCODEDOISCANOS, direcao));
    }

    public void criaBarcoDeTresCanos(int X, int Y, int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException {
        barcos.add(new Barco(X,Y,Barco.BARCODETRESCANOS, direcao));
    }

    public void criaBarcoDeQuatroCanos(int X, int Y, int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException {
        barcos.add(new Barco(X,Y,Barco.BARCODEQUATROCANOS, direcao));
    }

    public void criaPortaAviao(int X, int Y, int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException {
        barcos.add(new PortaAviao(X,Y,direcao));
    }
    
    public void criaPecasAleatorias()
    {
        int X,Y,direcao;
        try {
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaPortaAviao(X,Y,direcao);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        criaSubmarino(X,Y);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        criaSubmarino(X,Y);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        criaSubmarino(X,Y);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        criaSubmarino(X,Y);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaBarcoDeDoisCanos(X,Y,direcao);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaBarcoDeDoisCanos(X,Y,direcao);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaBarcoDeDoisCanos(X,Y,direcao);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaBarcoDeTresCanos(X,Y,direcao);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaBarcoDeTresCanos(X,Y,direcao);
        
        X = 1 + (int) (Math.random() * 9);
        Y = 1 + (int) (Math.random() * 9);
        direcao = 1 + (int) (Math.random() * 3);
        criaBarcoDeQuatroCanos(X,Y,direcao);
        
        } catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public String clica(int X, int Y) throws BarcoForaDaCoordenadaDoTabuleiroException 
    {
        Ponto pontoParam = new Ponto(X,Y);
        for(Barco barco : oponente.barcos)
        {
            for(Ponto ponto : barco.pontos)
            {
                  if(pontoParam.equals(ponto)) 
                  {
                      barco.pontosAcertados.add(pontoParam);
                      if(barco.pontosAcertados.size() == barco.pontos.size())
                      {
                          oponente.barcosDestruidos.add(barco);
                          if(oponente.barcosDestruidos.size() == oponente.barcos.size())
                          {
                              return nome + " Venceu";
                          }
                          else
                          {
                            return barco.tipoBarco() + " destruído" ;
                          }
                      }
                      else
                      {
                        return "Acertou";
                      }
                  }
            }
        }
        return "Água";
    }
}
