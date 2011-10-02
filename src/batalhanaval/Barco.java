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
    
    public Barco(int XOrigem, int YOrigem) throws BarcoForaDaCoordenadaDoTabuleiroException
    {
        criaPontoInicial(XOrigem,YOrigem);
    }
    
    public Barco(int XOrigem, int YOrigem, int tamanho) throws BarcoForaDaCoordenadaDoTabuleiroException
    {
        criaPontoInicial(XOrigem,YOrigem);
        this.tamanho = tamanho;
    }
    
    public Barco(int XOrigem, int YOrigem, int tamanho, int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException
    {
        this.tamanho = tamanho;
        criaPontoInicial(XOrigem,YOrigem);
        criaPontosBaseadoEmDirecao(direcao);
    }
    
    protected void criaPontoInicial(int XOrigem, int YOrigem) throws BarcoForaDaCoordenadaDoTabuleiroException
    {
        Ponto ponto = new Ponto(XOrigem,YOrigem);
        pontos.add(ponto);
    }
    
    protected void criaPontosBaseadoEmDirecao(int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException
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
     
       protected void criaPontosaDireita() throws BarcoForaDaCoordenadaDoTabuleiroException {
       int contador;
       for(contador = 0 ; contador < tamanho ; contador++)
       {
        Ponto ponto = new Ponto(pontos.get(contador).X + 1, pontos.get(contador).Y);
        pontos.add(ponto);
       }
       }

    protected void criaPontosAbaixo() throws BarcoForaDaCoordenadaDoTabuleiroException {
      int contador;
      for(contador = 0 ; contador < tamanho ; contador++)
      {
        Ponto ponto = new Ponto(pontos.get(contador).X, pontos.get(contador).Y + 1);
        pontos.add(ponto);
      }
    }

    protected void criaPontosaEsquerda() throws BarcoForaDaCoordenadaDoTabuleiroException {
       int contador;
       for(contador = 0 ; contador < tamanho ; contador++)
       {
        Ponto ponto = new Ponto(pontos.get(contador).X - 1, pontos.get(contador).Y);
        pontos.add(ponto);
       }
    }

    protected void criaPontosAcima() throws BarcoForaDaCoordenadaDoTabuleiroException {
       int contador;
       Ponto ponto;
       for(contador = 0 ; contador < tamanho ; contador++)
       {
         int novoX = pontos.get(contador).X;
         int novoY = pontos.get(contador).Y - 1;
         ponto = new Ponto(novoX, novoY);
        pontos.add(ponto);
       }
    }
    
    @Override
    public boolean equals(Object objeto) {
        Barco barco = (Barco)objeto;
        int contador = 0;
        do
        {
            if(pontos.get(contador).X != barco.pontos.get(contador).X)
            {
                return false;
            }
            if(pontos.get(contador).Y != barco.pontos.get(contador).Y)
            {
                return false;
            }
            contador++;
        }
        while(contador < tamanho);
        return true;
    }
    
}
