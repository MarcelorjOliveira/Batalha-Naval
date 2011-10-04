/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author marcelo
 */
public class Ponto {
    
    public final int X;
    public final int Y;
    
    public Ponto(int coordenadaX, int coordenadaY) throws BarcoForaDaCoordenadaDoTabuleiroException
    {
        if((coordenadaX <= 0) || (coordenadaX > Tabuleiro.tamanho) || (coordenadaY <= 0) || (coordenadaY > Tabuleiro.tamanho))
        {
            throw new BarcoForaDaCoordenadaDoTabuleiroException();
        }
        
        this.X = coordenadaX;
        this.Y = coordenadaY;
    }
    
    @Override
    public boolean equals(Object paramPonto)
    {
        Ponto ponto = (Ponto)paramPonto;
        if((this.X == ponto.X) && (this.Y == ponto.Y)) 
         {
           return true;
         }
        return false;
    }
}
