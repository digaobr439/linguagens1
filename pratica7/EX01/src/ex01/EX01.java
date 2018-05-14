/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author 16.03378-7
 */
public class EX01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDeContatos lista = new ListaDeContatos();
        
        Contato contatoGenerico = new Contato("Marcio","marcio@gmail.com","98456-9854");
        
        lista.adicionarContato(contatoGenerico);
        contatoGenerico = new Contato("Eduardo","eduardo@gmail.com","98457-9854");
        lista.adicionarContato(contatoGenerico);
        contatoGenerico = new Contato("Glauber","glauber@gmail.com","98458-9854");
        lista.adicionarContato(contatoGenerico);
        lista.imprimirLista();
        lista.removerContato(contatoGenerico);
        lista.imprimirLista();
    }
    
}
