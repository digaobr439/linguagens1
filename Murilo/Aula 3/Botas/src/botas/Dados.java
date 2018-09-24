/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botas;

import java.util.Comparator;

/**
 *
 * @author 16.03378-7
 */
public class Dados {
    private int direita;
    private int esquerda;

    public Dados(int direita, int esquerda) {
        this.direita = direita;
        this.esquerda = esquerda;
    }

    public int getDireita() {
        return direita;
    }

    public int getEsquerda() {
        return esquerda;
    }

    public void setDireita(int direita) {
        this.direita = direita;
    }

    public void setEsquerda(int esquerda) {
        this.esquerda = esquerda;
    }

    
    
    @Override
    public String toString(){
        return "Direita" + this.getDireita() +"Esquerda " + this.getEsquerda();
    }
    


}
