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
public class Barco{
    
    public ArrayList<Ponto> pontos = new ArrayList<Ponto>();
    
    public static final int DIREITA = 1;
    public static final int BAIXO = 2;
    public static final int ESQUERDA = 3;
    public static final int CIMA = 4;
    
    public static final int SUBMARINO = 1;
    public static final int BARCODEDOISCANOS = 2;
    public static final int BARCODETRESCANOS = 3;
    public static final int BARCODEQUATROCANOS = 4;
    
    private int tamanho;
    
    public Barco(int XOrigem, int YOrigem)
    {
        criaPontoInicial(XOrigem,YOrigem);
    }
    
    public Barco(int XOrigem, int YOrigem, int tamanho)
    {
        criaPontoInicial(XOrigem,YOrigem);
    }
    
    public Barco(int XOrigem, int YOrigem, int tamanho, int direcao)
    {
        this.tamanho = tamanho;
        criaPontoInicial(XOrigem,YOrigem);
        criaPontosBaseadoEmDirecao(direcao);
    }
    
    protected void criaPontoInicial(int XOrigem, int YOrigem)
    {
        Ponto ponto = new Ponto();
        ponto.X = XOrigem;
        ponto.Y = YOrigem;
        pontos.add(ponto);
    }
    
    protected void criaPontosBaseadoEmDirecao(int direcao)
    {
        switch(direcao)
        {
            case DIREITA:
                criaPontosaDireita();
                break;
            case BAIXO:
                criaPontosAbaixo();
                break;
            case ESQUERDA:
                criaPontosaEsquerda();
                break;
            case CIMA:
                criaPontosAcima();
                break;
        }
    }
     
       private void criaPontosaDireita() {
       int contador;
       for(contador = 0 ; contador < tamanho ; contador++)
       {
        Ponto ponto = new Ponto();
        ponto.X = pontos.get(contador).X + 1;
        ponto.Y = pontos.get(contador).Y;
        pontos.add(ponto);
       }
       }

    private void criaPontosAbaixo() {
      int contador;
      for(contador = 0 ; contador < tamanho ; contador++)
      {
        Ponto ponto = new Ponto();
        ponto.X = pontos.get(contador).X;
        ponto.Y = pontos.get(contador).Y + 1;
        pontos.add(ponto);
      }
    }

    private void criaPontosaEsquerda() {
       int contador;
       for(contador = 0 ; contador < tamanho ; contador++)
       {
        Ponto ponto = new Ponto();
        ponto.X = pontos.get(contador).X - 1;
        ponto.Y = pontos.get(contador).Y;
        pontos.add(ponto);
       }
    }

    private void criaPontosAcima() {
       int contador;
       for(contador = 0 ; contador < tamanho ; contador++)
       {
        Ponto ponto = new Ponto();
        ponto.X = pontos.get(contador).X;
        ponto.Y = pontos.get(contador).Y - 1;
        pontos.add(ponto);
       }
    }
    
}
