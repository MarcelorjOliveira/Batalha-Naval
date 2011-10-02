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
}
