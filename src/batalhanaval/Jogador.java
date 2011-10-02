/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class Jogador {
    
    private Jogador oponente;
    private ArrayList<Barco> barcos = new ArrayList<Barco>();
    
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
}
