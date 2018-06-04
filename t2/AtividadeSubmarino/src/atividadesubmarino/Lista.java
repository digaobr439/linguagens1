/**
 * Willian Rodrigues Chan 16.01095-7
 * Rodrigo Martins De Carvalho 16.03378-7
 */
package atividadesubmarino;

import java.util.ArrayList;

/**
 *
 * @author 16.03378-7
 */
abstract class Lista {
    public ArrayList<Produto> lista;

    public Lista() {
        this.lista = new ArrayList<>();
    }
    public boolean removerUltimoDaLista(){
        int temp;
        if(this.lista.isEmpty()){
            return false;
        }
        else{
            this.lista.remove(this.lista.size()-1);
            return true;
        }
    }
    public void limparLista(){
        this.lista.clear();
    }
    public String retornarResumo(){
        String temp = new String();
        double valor = 0;
        double frete = 0;
        temp+= "Seu carrinho possui os seguintes itens: \n";
        for(int i = 0; i < this.lista.size(); i++){
            temp += lista.get(i).exibirResumo();
            temp += "\n";
            valor += this.lista.get(i).getPreco();
            frete += this.lista.get(i).getFrete();
        }
        temp += "Preco: " + Double.toString(valor) +"\n";
        temp += "Frete: " + Double.toString(frete) +"\n";
        temp += "Valor Total: " + Double.toString(valor+frete) +"\n";
        return temp;
    }
    public abstract boolean adicionarALista(Produto prod);
    public abstract int getRestantes();
    
}
