/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package erronulo;

/**
 *
 * @author 16.03378-7
 */
public class ErroNulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
            System.out.println("Nova frase:" + novaFrase);
        }
        catch(NullPointerException e){
            System.out.println("errou");
        }
    }
    
}
