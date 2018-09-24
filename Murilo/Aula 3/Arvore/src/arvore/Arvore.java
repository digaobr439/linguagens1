/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

import java.util.TreeSet;

/**
 *
 * @author 16.03378-7
 */
public class Arvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Dados> tree = new TreeSet<Dados>();
        tree.add(new Dados(1,"Bunda"));
        tree.add(new Dados(10,"Cobre"));
        tree.add(new Dados(10,"Cobre")); 
        System.out.println("Conjunto de dados");
        System.out.println(tree);
    }
    
}
