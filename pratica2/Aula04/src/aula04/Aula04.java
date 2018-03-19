/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author 16.03378-7
 */
public class Aula04 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta c1 = new Conta();
        Conta minhaConta = new Conta();
        
        c1.saldo = 1000;
        c1.vizualizarSaldo();
        c1.cpf = "438.368.858.96";
        System.out.println(c1.cpf);
        minhaConta.saldo = 1800;
        minhaConta.vizualizarSaldo();
    }
    
}
