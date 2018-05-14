/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.ArrayList;

/**
 *
 * @author 16.03378-7
 */
public class ListaDeContatos implements Imprimivel {

    public ArrayList<Contato> lista;

    public ListaDeContatos() {
        this.lista = new ArrayList<>();
    }

    @Override
    public void imprimirLista() {
        for (Contato lista1 : this.lista) {
            System.out.println("Nome\t- Numero\t- Email");
            System.out.println(lista1.nome + "\t- " + lista1.telefone + "\t- " + lista1.email);
        }
    }
    public void adicionarContato(Contato contato){
        this.lista.add(contato);
    }
    public void removerContato(Contato contato){
        this.lista.remove(this.lista.indexOf(contato));
    }
    
    
}
