/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author marcelo
 */
public class PortaAviao extends Barco{
    
    private static int TAMANHO = 5;
    
    public PortaAviao(int XOrigem, int YOrigem, int direcao) throws BarcoForaDaCoordenadaDoTabuleiroException
    {
        super(XOrigem,YOrigem,TAMANHO);
        criaPontosBaseadoEmDirecao(direcao);
    }
    
    @Override
    protected void criaPontosaDireita() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Ponto ponto2 = new Ponto(pontos.get(0).X + 1,pontos.get(0).Y);
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto(pontos.get(1).X + 1, pontos.get(1).Y);
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto(pontos.get(2).X, pontos.get(2).Y - 1);
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto(pontos.get(2).X, pontos.get(2).Y + 1);
        pontos.add(ponto5);
    }

    @Override
    protected void criaPontosAbaixo() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Ponto ponto2 = new Ponto(pontos.get(0).X, pontos.get(0).Y + 1);
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto(pontos.get(1).X, pontos.get(1).Y + 1);
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto(pontos.get(2).X + 1, pontos.get(2).Y);

        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto(pontos.get(2).X - 1, pontos.get(2).Y);
        pontos.add(ponto5);
    }

    @Override
    protected void criaPontosaEsquerda() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Ponto ponto2 = new Ponto(pontos.get(0).X - 1, pontos.get(0).Y);
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto(pontos.get(1).X - 1, pontos.get(1).Y);
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto(pontos.get(2).X, pontos.get(2).Y + 1);
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto(pontos.get(2).X, pontos.get(2).Y - 1);
        pontos.add(ponto5);
    }

    @Override
    protected void criaPontosAcima() throws BarcoForaDaCoordenadaDoTabuleiroException {
        Ponto ponto2 = new Ponto(pontos.get(0).X, pontos.get(0).Y - 1);
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto(pontos.get(1).X, pontos.get(1).Y - 1);
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto(pontos.get(2).X - 1, pontos.get(2).Y);
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto(pontos.get(2).X + 1, pontos.get(2).Y);
        pontos.add(ponto5);
    }
}
