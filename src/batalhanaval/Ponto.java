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
      /*  if(coordenadaX < 1 || coordenadaX > Tabuleiro.tamanho)
        {
            throw new BarcoForaDaCoordenadaDoTabuleiroException();
        }
        
        if(coordenadaY < 1 || coordenadaY > Tabuleiro.tamanho)
        {
            throw new BarcoForaDaCoordenadaDoTabuleiroException(); 
        }*/
        
        this.X = coordenadaX;
        this.Y = coordenadaY;
    }
}
