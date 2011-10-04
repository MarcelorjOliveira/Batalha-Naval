package batalhanaval;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class NaoPodeCriarUmBarcoEmCimaDoOutroException extends Exception {
    
    public NaoPodeCriarUmBarcoEmCimaDoOutroException () {
        System.out.println("Não pode criar um Barco em Cima Do Outro");
    }
    
}
