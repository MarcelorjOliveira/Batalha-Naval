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
public class PortaAviao extends Barco{
    
    public PortaAviao(int XOrigem, int YOrigem, int direcao)
    {
        super(XOrigem,YOrigem);
        criaPontosBaseadoEmDirecao(direcao);
    }
    
    private void criaPontosaDireita() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X + 1;
        ponto2.Y = pontos.get(0).Y;
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto();
        ponto3.X = pontos.get(1).X + 1;
        ponto3.Y = pontos.get(1).Y;
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto();
        ponto4.X = pontos.get(2).X;
        ponto4.Y = pontos.get(2).Y - 1;
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto();
        ponto5.X = pontos.get(2).X;
        ponto5.Y = pontos.get(2).Y + 1;
        pontos.add(ponto5);
    }

    private void criaPontosAbaixo() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X;
        ponto2.Y = pontos.get(0).Y + 1;
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto();
        ponto3.X = pontos.get(1).X;
        ponto3.Y = pontos.get(1).Y + 1;
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto();
        ponto4.X = pontos.get(2).X - 1;
        ponto4.Y = pontos.get(2).Y;
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto();
        ponto5.X = pontos.get(2).X + 1;
        ponto5.Y = pontos.get(2).Y;
        pontos.add(ponto5);
    }

    private void criaPontosaEsquerda() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X - 1;
        ponto2.Y = pontos.get(0).Y;
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto();
        ponto3.X = pontos.get(1).X - 1;
        ponto3.Y = pontos.get(1).Y;
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto();
        ponto4.X = pontos.get(2).X;
        ponto4.Y = pontos.get(2).Y + 1;
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto();
        ponto5.X = pontos.get(2).X;
        ponto5.Y = pontos.get(2).Y - 1;
        pontos.add(ponto5);
    }

    private void criaPontosAcima() {
        Ponto ponto2 = new Ponto();
        ponto2.X = pontos.get(0).X;
        ponto2.Y = pontos.get(0).Y - 1;
        pontos.add(ponto2);
        
        Ponto ponto3 = new Ponto();
        ponto3.X = pontos.get(1).X;
        ponto3.Y = pontos.get(1).Y - 1;
        pontos.add(ponto3);
        
        Ponto ponto4 = new Ponto();
        ponto4.X = pontos.get(2).X - 1;
        ponto4.Y = pontos.get(2).Y;
        pontos.add(ponto4);
        
        Ponto ponto5 = new Ponto();
        ponto5.X = pontos.get(2).X + 1;
        ponto5.Y = pontos.get(2).Y;
        pontos.add(ponto5);
    }
}
